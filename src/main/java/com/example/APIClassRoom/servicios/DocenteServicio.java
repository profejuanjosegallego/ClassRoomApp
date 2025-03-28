package com.example.APIClassRoom.servicios;

import com.example.APIClassRoom.modelos.Docente;
import com.example.APIClassRoom.repositorios.ICursoRepositorio;
import com.example.APIClassRoom.repositorios.IDocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteServicio {
    @Autowired //Inyeccion de dependencias
    IDocenteRepositorio repositorio;

    //En el servicio implementamos los metodos
    //que necesitamos segun los servicios a ofrecer

    //GUARDAR
    public Docente guardarDocente(Docente datosDocente)throws Exception{
        try{
          return this.repositorio.save(datosDocente);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }


    //MODIFICAR

    //BUSCAR POR ID

    //BUSCAR TODOS

    //ELIMINAR


}
