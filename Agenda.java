package com.example.jcastillo.laboratorio5;

import java.util.ArrayList;

public class Agenda {

    private static ArrayList<Contacto> agenda = new ArrayList<Contacto>();

    public static ArrayList<Contacto> agendas(){
        return agenda;
    }

    public static boolean noExiste (String numero){
        boolean retornar = true;
        for (Contacto temp:agenda){
            if (temp.getNumero().equals(numero)){
                retornar = false;
            }
        }
        return retornar;
    }

    public static Contacto hallarContacto(String numero){
        Contacto retornar = new Contacto();
        return retornar;
    }
}
