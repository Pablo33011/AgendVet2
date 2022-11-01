package com.agendvet.veterinaria.infrastructure.adapters.repository;

import com.agendvet.veterinaria.app.dto.DTOPersona;
import com.agendvet.veterinaria.domain.dtoresponse.ResponsePersona;
import com.agendvet.veterinaria.domain.port.PortPersona;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryPersonaMySQL implements PortPersona {

    private final RepositoryPersonaJPA repositoryPersonaJPA;

    public RepositoryPersonaMySQL(RepositoryPersonaJPA repositoryPersonaJPA) {
        this.repositoryPersonaJPA = repositoryPersonaJPA;
    }

    @Override
    public ResponsePersona consultar(int codigo) {
        return null;
    }

    @Override
    public ResponsePersona guardar(DTOPersona dtoPersona) {
        return null;
    }

    @Override
    public boolean eliminar(int codigo) {
        return false;
    }

    @Override
    public List<ResponsePersona> listar() {
        return null;
    }

    @Override
    public boolean existe(int codigo) {
        return false;
    }
}
