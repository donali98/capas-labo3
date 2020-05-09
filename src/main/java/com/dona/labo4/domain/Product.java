package com.dona.labo4.domain;

public class Product {
    private Integer id;
    private String nombre;
    private Integer cantidad;


    public Product() {
    }

    public Product(Integer id, String nombre, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }



}