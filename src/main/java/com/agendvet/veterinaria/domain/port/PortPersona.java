package com.agendvet.veterinaria.domain.port;

import com.agendvet.veterinaria.app.dto.DTOPersona;
import com.agendvet.veterinaria.domain.dtoresponse.ResponsePersona;

import java.util.List;

public interface PortPersona {
    ResponsePersona consultar(int codigo);
    ResponsePersona guardar(DTOPersona dtoPersona);
    boolean eliminar(int codigo);
    List<ResponsePersona> listar();
    boolean existe (int codigo);
}
