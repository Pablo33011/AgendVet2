package com.agendvet.veterinary.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DTOPerson {
    private String nombres;
    private String apellidos;
    private int numeroIdentificacion;
    private DTOIdType tipoIdentificacion;
    private String telefono;


    public static DTOPerson dummy(){
        return new DTOPerson();
    }
}
