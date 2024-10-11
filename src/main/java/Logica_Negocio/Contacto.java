/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1002871285
 */
public class Contacto {
    private String Nombre ;
    private String Num_Telfono;

    public Contacto() {
    }

    public Contacto(String Nombre, String Num_Telfono) {
        this.Nombre = Nombre;
        this.Num_Telfono = Num_Telfono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNum_Telfono() {
        return Num_Telfono;
    }

    public void setNum_Telfono(String Num_Telfono) {
        this.Num_Telfono = Num_Telfono;
    }

   
    
}
