package com.agendvet.veterinary.domain.model;

import com.agendvet.veterinary.domain.validators.ValidatorAttribute;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ModelIdType {
    private int code;
    private String idType;

    public ModelIdType(String idType) {
        this.idType = idType;
    }

    public static ModelIdType of (int code, String idType){
        ValidatorAttribute.validarObligatorioEntero(code,"ERROR: Campo Obligatorio");
        ValidatorAttribute.validarObligatorioCadena(idType,"ERROR: Campo Obligatorio");
        return new ModelIdType(code, idType);
    }
}
