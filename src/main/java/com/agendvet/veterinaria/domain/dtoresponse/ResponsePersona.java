package com.agendvet.veterinaria.domain.dtoresponse;

import com.agendvet.veterinaria.app.dto.DTOTipoIdentificacion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePersona {
    private String nombres;
    private String apellidos;
    private int numeroIdentificacion;
    private DTOTipoIdentificacion tipoIdentificacion;
    private String telefono;

}
