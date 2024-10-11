/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.Helper_Validacion;
import Logica_Negocio.Agenda;
import Logica_Negocio.Contacto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1002871285
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre_agenda, id, nombre_contacto, num_telefono;
        int opcion=0, num_contac=0, rta, conteo;
        Contacto objContacto; 
        Agenda objAgenda;
        ArrayList ListaContactosGlobal;
        ArrayList <Agenda> listaAgendas = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        
        
        do {            
            System.out.println("\n1. Guardar Contacto");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Salir");
            
            
            do {
                try {

                    System.out.print("Digite una opcion valida: ");
                    opcion = leer.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                leer.nextLine();
            } while (opcion <= 0);
            
            
            
            switch (opcion) {
                case 1:
                    ArrayList<Contacto> listacontactoslocal= new ArrayList<>();
                      do {
                        try {

                            System.out.print("\nDigite el numero de contactos:");
                            num_contac= leer.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("Error");
                        }
                        leer.nextLine();

                    } while (num_contac <= 0);
                      
                      for (int i = 0; i < num_contac; i++) {
                        
                          System.out.print("\nNombre del Contacto: ");
                          nombre_contacto = leer.nextLine();
                          
                            rta = Helper_Validacion.ValidarVacio(nombre_contacto);

                            while (rta > 0) {
                             System.out.println("Nombre del Contacto: ");
                              nombre_contacto = leer.nextLine();
                              
                           rta = Helper_Validacion.ValidarVacio(nombre_contacto);
                             }
            
            
                              conteo = Helper_Validacion.ValidarTodo(nombre_contacto);

                                  while (conteo != 0) {
                                    System.out.println("Nombre del Conatacto: ");
                                   nombre_contacto= leer.nextLine();
                                   conteo = Helper_Validacion.ValidarTodo(nombre_contacto);}   
                                  
                                    
                          System.out.print("Numero de Telefono: ");
                          num_telefono= leer.nextLine();
                          
                          rta = Helper_Validacion.ValidarVacio(num_telefono);

                            while (rta > 0) {
                             System.out.println("Numero de Telefono: ");
                              num_telefono = leer.nextLine();
                              
                           rta = Helper_Validacion.ValidarVacio(num_telefono);
                             }
            
            
                              conteo = Helper_Validacion.ValidarTodoLetra(num_telefono);

                                  while (conteo != 0) {
                                    System.out.println("Numero de Telefono: ");
                                   num_telefono= leer.nextLine();
                                   conteo = Helper_Validacion.ValidarTodoLetra(num_telefono);}  
                                  
                              objContacto = new Contacto(nombre_contacto, num_telefono);              
                              listacontactoslocal.add(objContacto);
                      }
                      
                      
                      
                       ListaContactosGlobal = listacontactoslocal;                             
                       listacontactoslocal=null;
                       
                       System.out.print("\nDigite el nombre de la Agenda de contactos: ");
                        nombre_agenda = leer.nextLine();
                        
                         rta = Helper_Validacion.ValidarVacio(nombre_agenda);

                            while (rta > 0) {
                             System.out.println("Digite el nombre de la Agenda de contactos: ");
                              nombre_agenda = leer.nextLine();
                              
                           rta = Helper_Validacion.ValidarVacio(nombre_agenda);
                             }
            
            
                              conteo = Helper_Validacion.ValidarTodo(nombre_agenda);

                                  while (conteo != 0) {
                                    System.out.println("Digite el nombre de la Agenda de contactos: ");
                                   nombre_agenda= leer.nextLine();
                                   conteo = Helper_Validacion.ValidarTodo(nombre_agenda);}  
                        
                       System.out.print("Digite el id de la agenda: ");
                       id = leer.nextLine();
                       
                       rta = Helper_Validacion.ValidarVacio(id);

                            while (rta > 0) {
                             System.out.println("Digite el id de la agenda: ");
                              id = leer.nextLine();
                              
                           rta = Helper_Validacion.ValidarVacio(id);
                             }
            
            
                              conteo = Helper_Validacion.ValidarTodoLetra(id);

                             while (conteo != 0) {
                              
                                 System.out.println("Digite el id de la agenda: ");
                                 id= leer.nextLine();
                                conteo = Helper_Validacion.ValidarTodoLetra(id);}  
                       
                    objAgenda= new Agenda(nombre_agenda, id, ListaContactosGlobal);
                    listaAgendas.add(objAgenda);
                     break;             
                case 2:
                     Helpers.Helper_Impresion.ImprimirInformacionAgenda(listaAgendas);
                     break;
                case 3:
                    
                    break;
         
                    
            }
        } while (opcion != 3);
    }
    
}
