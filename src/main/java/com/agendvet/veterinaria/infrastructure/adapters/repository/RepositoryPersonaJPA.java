package com.agendvet.veterinaria.infrastructure.adapters.repository;

import com.agendvet.veterinaria.infrastructure.adapters.entity.EntityPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPersonaJPA extends JpaRepository<EntityPersona,Integer> {



}
