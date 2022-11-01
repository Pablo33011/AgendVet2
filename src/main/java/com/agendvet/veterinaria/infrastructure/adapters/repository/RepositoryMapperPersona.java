package com.agendvet.veterinaria.infrastructure.adapters.repository;

import com.agendvet.veterinaria.app.dto.DTOPersona;
import com.agendvet.veterinaria.domain.model.ModelPersona;
import com.agendvet.veterinaria.infrastructure.adapters.entity.EntityPersona;

public class RepositoryMapperPersona {
    private final RepositoryMapperTipoIdentificacion tipoIdentificacionMapper;

    public RepositoryMapperPersona(RepositoryMapperTipoIdentificacion tipoIdentificacionMapper) {
        this.tipoIdentificacionMapper = tipoIdentificacionMapper;
    }

    public EntityPersona crearEntity(ModelPersona modelPersona) {
        return new EntityPersona(modelPersona.getNombres(),modelPersona.getApellidos(),modelPersona.getNumeroIdentificacion(),this.tipoIdentificacionMapper.crearEntity(modelPersona.getTipoIdentificacion()),modelPersona.getTelefono());
        }
    public ModelPersona crearDTOtoModel(DTOPersona dtoPersona){
        return new ModelPersona(dtoPersona.getNombres(),dtoPersona.getApellidos(),dtoPersona.getNumeroIdentificacion(),this.tipoIdentificacionMapper.crearDTOtoModel(dtoPersona.getTipoIdentificacion()),dtoPersona.getTelefono());
    }
}
