package com.example.APIClassRoom.ayudas;

public enum MensajesAPI {

    ESTUDIANTE_NO_ENCONTRADO("El estudiante que buscas no se encuentra en BD"),
    DOCENTE_NO_ENCONTRADO("El docente que buscas no se encuentra en BD");

    private String texto;

    MensajesAPI(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
