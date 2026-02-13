package com.bootcamp.week1.ejercicio01;

public class HolaMundoMejorado {
    public static void main(String[] args) {
        // TODO: Declarar variables
        String nombre = "Victor Manuel Martinez";
        int edad = 24;
        double altura = 1.85;
        boolean esActivo = true;

        // TODO: Concatenacion con +
        String mensaje1 = "Me llamo " + nombre + ", tengo " + edad
                         + " anios, mido " + altura + "m y estoy "
                         + (esActivo ? "activo" : "inactivo") + ".";
        System.out.println(mensaje1);

        // TODO: Usando String.format()
        String mensaje2 = String.format(
            "Me llamo %s, tengo %d anios, mido %.2f m y estoy %s.",
            nombre, edad, altura, esActivo ? "activo" : "inactivo"
        );
        System.out.println(mensaje2);
    }
}
