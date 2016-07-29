/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 * Clase que gestiona la informacion de las personas.
 *
 * @author Jose
 * @since 28/07/2016
 * @version 1
 */
public class Person {

    protected String id;
    protected String name;

    /**
     *
     * @param id indentificador de las personas
     * @param name nombre de la persona
     */
    public Person(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
