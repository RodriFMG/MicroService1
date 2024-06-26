package com.example.microservice1_1.Domain;
//import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Schema(name = "Cafe", description = "Recurso de cafe")
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" }, allowSetters = true)
@Table(name = "cafe")
public class Cafe extends Producto{

    //atributos
    //@ApiModelProperty(notes = "El tipo único de cafe")
    private String tipo_cafe;

    //constructores
    public Cafe(){}
    public Cafe(Long id2, String img2, Long stock2, Float precio2, String nombre2, Boolean estado2, String fabricante2, String tipo_cafe) {
        super(id2, img2, stock2, precio2, nombre2, estado2, fabricante2);
        this.tipo_cafe = tipo_cafe;
    }

    //getter
    public String getTipo_cafe() { return tipo_cafe; }

    //setter
    public void setTipo_cafe(String tipo_cafe) { this.tipo_cafe = tipo_cafe; }
}

