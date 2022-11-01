package com.agendvet.veterinaria.infrastructure.adapters.repository;

import com.agendvet.veterinaria.app.dto.DTOTipoIdentificacion;
import com.agendvet.veterinaria.domain.model.ModelTipoIdentificacion;
import com.agendvet.veterinaria.infrastructure.adapters.entity.EntityTipoIdentificacion;

public class RepositoryMapperTipoIdentificacion {
    public EntityTipoIdentificacion crearEntity(ModelTipoIdentificacion tipoIdentificacion){
        return new EntityTipoIdentificacion(tipoIdentificacion.getTipoIdentificacion());
    }
    public ModelTipoIdentificacion crearDTOtoModel(DTOTipoIdentificacion tipoIdentificacion){
        return new ModelTipoIdentificacion(tipoIdentificacion.getTipoIdentificacion());
    }
    public ModelTipoIdentificacion crearEntitytoModel(EntityTipoIdentificacion tipoIdentificacion){
        return new ModelTipoIdentificacion(tipoIdentificacion.getTipoIdentificacion());
    }
    public DTOTipoIdentificacion crearModeltoDTO(ModelTipoIdentificacion tipoIdentificacion){
        return new DTOTipoIdentificacion(tipoIdentificacion.getTipoIdentificacion());
    }
}
