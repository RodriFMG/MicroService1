package com.example.microservice1_1.Domain;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Schema(name = "Bebida", description = "Modelo de bebidas")
//@ApiModel(description = "Detalles sobre bebida")
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" }, allowSetters = true)
@Table(name = "bebida")

public class Bebida extends Producto{

    //atributos
    //@ApiModelProperty(notes = "El tipo de bebida")
    private String tipo_bebida;

    //@ApiModelProperty(notes = "Cantidad de bebidas")
    private Float tamano;

    //constructores
    public Bebida(){}
    public Bebida(Long id2, String img2, Long stock2, Float precio2, String nombre2, Boolean estado2, String fabricante2, String tipo_bebida, Float tamano2) {
        super(id2, img2, stock2, precio2, nombre2, estado2, fabricante2);
        this.tipo_bebida = tipo_bebida;
        this.tamano = tamano2;
    }



    //getters
    public String getTipo_bebida() { return tipo_bebida; }
    public Float getTamano() { return tamano; }

    //setters
    public void setTipo_bebida(String tipo_bebida) { this.tipo_bebida = tipo_bebida; }
    public void setTamano(Float tamano) { this.tamano = tamano; }

}

