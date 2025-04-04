package com.example.APIClassRoom.servicios;

import com.example.APIClassRoom.modelos.Docente;
import com.example.APIClassRoom.repositorios.ICursoRepositorio;
import com.example.APIClassRoom.repositorios.IDocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public Docente modifcarDocente(Integer id,Docente datosDocente)throws Exception{
        try {
            //Para modificar primero debo buscar
            //JPA ME DEVUELVE UN DATO OPCIONAL (PUEDE ESTAR O NO)
            Optional<Docente>docenteBuscado=this.repositorio.findById(id);


            //Apenas lo busques pregunta si si estaba
            if(docenteBuscado.isPresent()){
                //Modifiquelo ps papa

                docenteBuscado.get().setEspecialidad(datosDocente.getEspecialidad());//Modificando un dato viejo
                return this.repositorio.save(docenteBuscado.get());

            }else{
                //No estaba el muñeco
                throw new Exception("El usuario a modificar no se encunetra en BD");
            }

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR POR ID

    //BUSCAR TODOS

    //ELIMINAR


}
