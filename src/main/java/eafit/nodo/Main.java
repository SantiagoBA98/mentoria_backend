package eafit.nodo;

import eafit.nodo.domains.Persona;
import eafit.nodo.services.Enfermero;
import eafit.nodo.services.Medico;

public class Main {

    /*
     * 1. Medico. enfermero, aseador, farmaceuta, recepcionista
     * 2. Encarga de relacionar personas
     *
     * */
    public static void main(String[] args) {
        Persona persona = new Medico("a","","");
        /* Una clase hija no puede instanciar la clase padre */
        //Medico medico = new Persona();
        /* Pero una clase padre si puede instanciar una clase hija */
        //Medico medico = new Enfermero();

    }
}