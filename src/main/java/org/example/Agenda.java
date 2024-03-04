package org.example;

import java.util.*;

/**
 * Clase Agenda que contiene una lista de objetos de la clase Contacto
 * @author María José (profesora ED)
 * @version 1.0
 *
 */
public class Agenda {
    /**
     * Atributo que almacena una lista de contactos
     */
    private List<Persona> contacts; // Lista de Contacto

    /**
     * Método constructor por defecto de la clase Agenda
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método que permite añadir un contacto a la agenda.
     * @param name Nombre del contacto
     * @param phone Número de teléfono del contacto
     */

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método que permite borrar un contacto de la agenda a partir de su nombre
     * @param name Nombre del contacto a borrar
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método que permite modificar el número de teléfono asociado a un contacto.
     * @param name Nombre del contacto al que queremos modificar el número de teléfono
     * @param oldPhone Número de teléfono antiguo. Es decir, el que se desea eliminar
     * @param newPhone Nuevo número de teléfono. Es decir, el que se desea añadir en lugar del antiguo.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Método get para extraer la lista de contactos de una agenda
     * @return Una lista de objetos de clase Contacto
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}