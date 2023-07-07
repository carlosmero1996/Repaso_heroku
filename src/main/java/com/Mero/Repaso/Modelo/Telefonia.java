/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Mero.Repaso.Modelo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author carlos
 */
@Document(collection = "Telefonia")
@Data
public class Telefonia {
    private String tipo_telefonia;
    private String telefono;
            
            
}
