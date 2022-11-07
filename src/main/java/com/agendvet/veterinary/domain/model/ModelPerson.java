package com.agendvet.veterinary.domain.model;

import com.agendvet.veterinary.domain.validators.ValidatorAttribute;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ModelPerson {

    private String name;
    private String lastName;
    private int idNumber;
    private ModelIdType idType;
    private String phone;

    public static ModelPerson of (String nombres, String apellidos, int numeroIdentificacion, ModelIdType tipoIdentificacion, String telefono){
        ValidatorAttribute.validarObligatorioCadena(nombres,"ERROR: El nimbre no puede ser nulo o vacío");
        ValidatorAttribute.validarObligatorioCadena(nombres,"ERROR: El apellido no puede ser nulo o vacío");
        ValidatorAttribute.validarObligatorioEntero(numeroIdentificacion,"ERROR: numero de identificación obligatorio");
        return new ModelPerson(nombres, apellidos, numeroIdentificacion, tipoIdentificacion, ValidatorAttribute.validartelefono(telefono));
    }
}
