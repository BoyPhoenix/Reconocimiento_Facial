package com.unipamplona.prototipoasistencia.utils;

public class RespuestaUtil {

    private String mensaje;
    private Object resultado;

    public RespuestaUtil(String mensaje, Object resultado) {
        this.mensaje = mensaje;
        this.resultado = resultado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getResultado() {
        return resultado;
    }

    public void setResultado(Object resultado) {
        this.resultado = resultado;
    }
}
