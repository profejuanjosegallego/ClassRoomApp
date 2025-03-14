package com.example.APIClassRoom.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Curso {
    private Integer id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id")
    @JsonBackReference
    Docente docente;

    public Curso() {
    }

    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
