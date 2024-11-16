package eafit.nodo.services;

import eafit.nodo.domains.Persona;

public class Medico extends Persona {

    public Medico(String nombre, String apellido, String sueldo) {
        super(nombre, apellido, sueldo);
    }

    @Override
    protected void ejercer(){
        System.out.println("Esta en cirugia");
    }
}
