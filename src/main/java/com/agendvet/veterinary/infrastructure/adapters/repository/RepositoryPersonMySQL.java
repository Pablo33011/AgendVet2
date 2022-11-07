package com.agendvet.veterinary.infrastructure.adapters.repository;

import com.agendvet.veterinary.app.dto.DTOPerson;
import com.agendvet.veterinary.domain.dtoresponse.ResponsePerson;
import com.agendvet.veterinary.domain.port.PortPerson;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryPersonMySQL implements PortPerson {

    private final RepositoryPersonJPA repositoryPersonaJPA;

    public RepositoryPersonMySQL(RepositoryPersonJPA repositoryPersonaJPA) {
        this.repositoryPersonaJPA = repositoryPersonaJPA;
    }

    @Override
    public ResponsePerson get(int code) {
        return null;
    }

    @Override
    public ResponsePerson save(DTOPerson dtoPerson) {
        return null;
    }

    @Override
    public boolean delete(int code) {
        return false;
    }

    @Override
    public List<ResponsePerson> getAll() {
        return null;
    }

    @Override
    public boolean exist(int code) {
        return false;
    }
}
