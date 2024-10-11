/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1002871285
 */
public class Agenda {
    
    private String Nombre;
    private String Id;
    private ArrayList<Contacto> listacontactos;

    public Agenda() {
    }

    public Agenda(String Nombre, String Id, ArrayList<Contacto> listacontactos) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.listacontactos = listacontactos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public ArrayList<Contacto> getListacontactos() {
        return listacontactos;
    }

    public void setListacontactos(ArrayList<Contacto> listacontactos) {
        this.listacontactos = listacontactos;
    }
    
    
}
