package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Una clase Contacto que almacena el nombre y una lista de teléfonos para cada contacto.
 * @author María José (profesora ED)
 * @version 1.0
 */
public class Persona {
    private String name;
    private List<String> phones;

    /**
     * Método constructor de la clase Contacto al que hay que pasarle los dos atributos de clase
     * @param name Nombre del contacto
     * @param phone Lista de teléfonos del contacto
     */

    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Atributo que almacena el nombre del contacto
     */ /**
     * Método get para el atributo Nombre
     * @return Un String con el nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Atributo que almacena una lista de teléfonos (String) asociados al contacto
     */ /**
     * Método get para la lista de teléfonos
     * @return Devuelve un array de Strings con los teléfonos asociados al contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}