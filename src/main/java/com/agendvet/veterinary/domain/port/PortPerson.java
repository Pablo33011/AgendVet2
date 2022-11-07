package com.agendvet.veterinary.domain.port;

import com.agendvet.veterinary.app.dto.DTOPerson;
import com.agendvet.veterinary.domain.dtoresponse.ResponsePerson;

import java.util.List;

public interface PortPerson {
    ResponsePerson get(int code);
    ResponsePerson save(DTOPerson dtoPerson);
    boolean delete(int code);
    List<ResponsePerson> getAll();

    boolean exist (int code);
}
