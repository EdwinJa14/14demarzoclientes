/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class ListaModell {
    //clase lista
    Queue<Cliente>ListaClientes=new LinkedList();
    
    public void EncolarC(String Ape,String Nom){
        
        Cliente nuevoCliente = new Cliente(Ape,Nom);
        this.ListaClientes.add(nuevoCliente);
       // JOptionPane.showMessageDialog(null,"Cliente Agregado  A La Lista");
    }
    
    
public Queue ListarC(){
    return this.ListaClientes;
}
public void DesEncolar(){
    this.ListaClientes.poll();
}
}

