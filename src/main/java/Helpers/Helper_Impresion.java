/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Agenda;
import java.util.ArrayList;

/**
 *
 * @author 1002871285
 */
public class Helper_Impresion {
    public static void ImprimirInformacionAgenda(ArrayList<Agenda> listaAgendas) {
        for (int i = 0; i < listaAgendas.size(); i++) {
            System.out.println("El nombre de la Agenda es:" + "\t" + listaAgendas.get(i).getNombre());
            System.out.println("El id de la Agenda es:" + "\t" + listaAgendas.get(i).getId());
            System.out.println("");
            for (int j = 0; j < listaAgendas.get(i).getListacontactos().size(); j++) {

                System.out.println("El nombre del contacto es:" + "\t" + listaAgendas.get(i).getListacontactos().get(j).getNombre());
                System.out.println("El numero del contacto es: " + "\t+57 " + listaAgendas.get(i).getListacontactos().get(j).getNum_Telfono());
                System.out.println("");
            }
        }

    }
}
