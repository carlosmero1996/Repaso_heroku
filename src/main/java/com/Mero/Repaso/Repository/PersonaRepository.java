/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Mero.Repaso.Repository;

import com.Mero.Repaso.Modelo.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author carlos
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}
