package com.agendvet.veterinary.infrastructure.adapters.repository;

import com.agendvet.veterinary.app.dto.DTOIdType;
import com.agendvet.veterinary.domain.model.ModelIdType;
import com.agendvet.veterinary.infrastructure.adapters.entity.EntityIdType;

public class RepositoryMapperIdType {
    public EntityIdType crearEntity(ModelIdType tipoIdentificacion){
        return new EntityIdType(tipoIdentificacion.getIdType());
    }
    public ModelIdType crearDTOtoModel(DTOIdType tipoIdentificacion){
        return new ModelIdType(tipoIdentificacion.getTipoIdentificacion());
    }
    public ModelIdType crearEntitytoModel(EntityIdType tipoIdentificacion){
        return new ModelIdType(tipoIdentificacion.getTipoIdentificacion());
    }
    public DTOIdType crearModeltoDTO(ModelIdType tipoIdentificacion){
        return new DTOIdType(tipoIdentificacion.getIdType());
    }
}
