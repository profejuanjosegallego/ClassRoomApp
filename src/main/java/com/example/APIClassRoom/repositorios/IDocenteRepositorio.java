package com.example.APIClassRoom.repositorios;

import com.example.APIClassRoom.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocenteRepositorio extends JpaRepository<Docente,Integer> {

}
