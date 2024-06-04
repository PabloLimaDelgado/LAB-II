package org.example;

import org.example.Persona.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pablo", 22);

        try {
            usuario.setEdad(12);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}