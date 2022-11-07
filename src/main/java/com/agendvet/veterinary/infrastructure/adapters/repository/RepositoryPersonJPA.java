package com.agendvet.veterinary.infrastructure.adapters.repository;

import com.agendvet.veterinary.infrastructure.adapters.entity.EntityPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPersonJPA extends JpaRepository<EntityPerson,Integer> {



}
