package com.app.bkndbydips7.repository;

import com.app.bkndbydips7.model.Pet;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PetRepository extends SimpleJpaRepository<Pet, String> {
    private final EntityManager em;
    public PetRepository(EntityManager em) {
        super(Pet.class, em);
        this.em = em;
    }
    @Override
    public List<Pet> findAll() {
        return em.createNativeQuery("Select * from \"bkndbydips7\".\"Pet\"", Pet.class).getResultList();
    }
}