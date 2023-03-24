/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas14marzo;

import Controlador.ListaController;
import Modelos.ListaModell;
import Vistas.frmListas;

/**
 *
 * @author Javier
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          frmListas VistaListas=new frmListas(null, true);
    ListaModell ModeloVist=new ListaModell();
    ListaController ControladorL = new ListaController(VistaListas,ModeloVist);
    }
  
}
