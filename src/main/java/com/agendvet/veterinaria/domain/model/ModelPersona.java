package com.agendvet.veterinaria.domain.model;

import com.agendvet.veterinaria.domain.validators.ValidadorAtributos;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ModelPersona {

    private String nombres;
    private String apellidos;
    private int numeroIdentificacion;
    private ModelTipoIdentificacion tipoIdentificacion;
    private String telefono;

    public static ModelPersona of (String nombres, String apellidos, int numeroIdentificacion, ModelTipoIdentificacion tipoIdentificacion, String telefono){
        ValidadorAtributos.validarObligatorioCadena(nombres,"ERROR: El nimbre no puede ser nulo o vacío");
        ValidadorAtributos.validarObligatorioCadena(nombres,"ERROR: El apellido no puede ser nulo o vacío");
        ValidadorAtributos.validarObligatorioEntero(numeroIdentificacion,"ERROR: numero de identificación obligatorio");
        return new ModelPersona(nombres, apellidos, numeroIdentificacion, tipoIdentificacion, ValidadorAtributos.validartelefono(telefono));
    }
}
