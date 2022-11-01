package com.agendvet.veterinaria.domain.validators;

public class ValidadorAtributos {

    private ValidadorAtributos(){}

    public static void validarObligatorioCadena(String valor, String mensaje) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void validarObligatorioEntero(Integer valor, String mensaje) {
        if (valor == null ) {
            throw new IllegalArgumentException(mensaje);
        }
    }
    public static String validartelefono(String valor) {
        String cadena="0000000000";
        if (valor == null || valor.isEmpty()) {
            return cadena;
        }
        return valor;
    }

   /* public static void validarObligatorioFecha(LocalDate fecha, String mensaje){
        if (fecha == null || fecha.isEqual(null)) {
            throw new IllegalArgumentException(mensaje);
        }
    }*/

}
