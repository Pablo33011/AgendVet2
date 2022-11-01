package com.agendvet.veterinaria.domain.model;

import com.agendvet.veterinaria.domain.validators.ValidadorAtributos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class ModelTipoIdentificacion {
    private int codigo;
    private String tipoIdentificacion;

    public ModelTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public static  ModelTipoIdentificacion of (int codigo, String tipoIdentificacion){
        ValidadorAtributos.validarObligatorioEntero(codigo,"ERROR: Campo Obligatorio");
        ValidadorAtributos.validarObligatorioCadena(tipoIdentificacion,"ERROR: Campo Obligatorio");
        return new ModelTipoIdentificacion(codigo, tipoIdentificacion);
    }
}
