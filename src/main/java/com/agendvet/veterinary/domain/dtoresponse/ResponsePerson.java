package com.agendvet.veterinary.domain.dtoresponse;

import com.agendvet.veterinary.app.dto.DTOIdType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePerson {
    private String nombres;
    private String apellidos;
    private int numeroIdentificacion;
    private DTOIdType tipoIdentificacion;
    private String telefono;

}
