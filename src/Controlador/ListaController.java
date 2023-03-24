/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.Cliente;
import Modelos.ListaModell;
import Vistas.frmListas;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */

   
    public class ListaController implements ActionListener{
        frmListas VistaLista;
        ListaModell ModeloVista;
        
        public ListaController (frmListas VistaLista, ListaModell ModeloVista){
            this.VistaLista=VistaLista;
            this.ModeloVista=ModeloVista;
            //poner a ala excucha los botones
            this.VistaLista.btnAtenderC.addActionListener(this);
            this.VistaLista.btnIngresarC.addActionListener(this);
            this.VistaLista.btnAtenderT.addActionListener(this);
            
            //levantar vista lista          
            this.VistaLista.setLocationRelativeTo(null);
           // this.VistaLista.setLocationRelativeTo(null);
            this.VistaLista.setVisible(true);
        }
        
        
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== this.VistaLista.btnIngresarC){
                this.ModeloVista.EncolarC(this.VistaLista.txtApellidos.getText(),
                        this.VistaLista.txtNombre.getText());
                
                //mostrar los datos en el txt area
                Queue<Cliente>listaLocal = this.ModeloVista.ListarC();
                
                String Cadena="";
                
                for(Cliente MiListaCliente: listaLocal){
                    Cadena=Cadena +MiListaCliente.getApellidos()+" "+MiListaCliente.getNombre()+"\n";
                    
                    
                }
                this.VistaLista.txtListaC.setText(Cadena);
                JOptionPane.showMessageDialog(null,"Cliente Agregado a la Lista");
                this.VistaLista.txtApellidos.setText("");
                this.VistaLista.txtNombre.setText("");
             }
            if(e.getSource()==this.VistaLista.btnAtenderC){
                this.ModeloVista.DesEncolar();
                this.ModeloVista.EncolarC(this.VistaLista.txtApellidos.getText(),
                        this.VistaLista.txtNombre.getText());
                Queue <Cliente> listaLocal = this.ModeloVista.ListarC();
                String Cadena="";
                for(Cliente MiListaCliente: listaLocal){
                    Cadena=Cadena+MiListaCliente.getApellidos()+" "+MiListaCliente.getNombre()+"\n";
               }
                this.VistaLista.txtListaC.setText(Cadena);
                JOptionPane.showMessageDialog(null, "Cliente Atendido");
             }
            if(e.getSource()==this.VistaLista.btnAtenderT){
                this.VistaLista.txtListaC.setText("");
                JOptionPane.showMessageDialog(null,"Todos Los clientes Atendidos");
            }
        }
        
    }

