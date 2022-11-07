package com.agendvet.veterinary.infrastructure.adapters.repository;

import com.agendvet.veterinary.app.dto.DTOPerson;
import com.agendvet.veterinary.domain.model.ModelPerson;
import com.agendvet.veterinary.infrastructure.adapters.entity.EntityPerson;

public class RepositoryMapperPerson {
    private final RepositoryMapperIdType tipoIdentificacionMapper;

    public RepositoryMapperPerson(RepositoryMapperIdType tipoIdentificacionMapper) {
        this.tipoIdentificacionMapper = tipoIdentificacionMapper;
    }

    public EntityPerson crearEntity(ModelPerson modelPersona) {
        return new EntityPerson(modelPersona.getName(),modelPersona.getLastName(),modelPersona.getIdNumber(),this.tipoIdentificacionMapper.crearEntity(modelPersona.getIdType()),modelPersona.getPhone());
        }
    public ModelPerson crearDTOtoModel(DTOPerson dtoPersona){
        return new ModelPerson(dtoPersona.getNombres(),dtoPersona.getApellidos(),dtoPersona.getNumeroIdentificacion(),this.tipoIdentificacionMapper.crearDTOtoModel(dtoPersona.getTipoIdentificacion()),dtoPersona.getTelefono());
    }
}
