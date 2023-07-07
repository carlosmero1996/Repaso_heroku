/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Mero.Repaso.Service;

import com.Mero.Repaso.Repository.PersonaRepository;
import com.Mero.Repaso.Modelo.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class PersonaServiceImp extends GenericServiceImpl<Persona, Long> implements GenericService<Persona, Long> {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }


    
}
