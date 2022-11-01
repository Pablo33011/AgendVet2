package com.agendvet.veterinaria.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DTOPersona {
    private String nombres;
    private String apellidos;
    private int numeroIdentificacion;
    private DTOTipoIdentificacion tipoIdentificacion;
    private String telefono;


    public static DTOPersona dummy(){
        return new DTOPersona();
    }
}
