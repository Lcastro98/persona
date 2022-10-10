package com.bootcamp;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(18);
        persona.setNombre("Juana Martinez");
        persona.setTelefono("3153304897");

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}
