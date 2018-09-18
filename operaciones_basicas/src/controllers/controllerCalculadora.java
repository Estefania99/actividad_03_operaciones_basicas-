/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import models.modelCalculadora;
import views.viewCalculadora;
import extras.DataValidation;
/**
 *
 * @author fanny
 */
public class controllerCalculadora {
    modelCalculadora modelcalculadora;
    viewCalculadora viewcalculadora;
    DataValidation dataValidation = new DataValidation ();
    
    MouseListener ml = new MouseListener (){
        @Override
        public void mouseClicked(MouseEvent e) {
            modelcalculadora.setNumero1(dataValidation.string2Float(viewcalculadora.jtf_numero1.getText()));
            modelcalculadora.setNumero2(dataValidation.string2Float(viewcalculadora.jtf_numero2.getText()));
            if(e.getSource()==viewcalculadora.jb_suma)jb_sumaMouseClicked();
            else if(e.getSource()==viewcalculadora.jb_resta)jb_restaMouseClicked();
            else if(e.getSource()==viewcalculadora.jb_multiplicacion)jb_multiplicacionMouseClicked();
            else if(e.getSource()==viewcalculadora.jb_division)jb_divisionMouseClicked();
            else if(e.getSource()==viewcalculadora.jb_modulo)jb_moduloMouseClicked();
            else if(e.getSource()==viewcalculadora.jb_limpiar)jb_limpiarMouseClicked();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        };
        public controllerCalculadora(modelCalculadora modelcalculadora , viewCalculadora viewcalculadora){
        viewcalculadora.setVisible(true);
        this.modelcalculadora = modelcalculadora;
        this.viewcalculadora = viewcalculadora;
        this.viewcalculadora.jb_division.addMouseListener(ml);
        this.viewcalculadora.jb_suma.addMouseListener(ml);
        this.viewcalculadora.jb_resta.addMouseListener(ml);
        this.viewcalculadora.jb_modulo.addMouseListener(ml);
        this.viewcalculadora.jb_multiplicacion.addMouseListener(ml);
        this.viewcalculadora.jb_limpiar.addMouseListener(ml);
        initComponets();

}

    private void initComponets() {
        viewcalculadora.setVisible(true);
    }
    
    private void jb_sumaMouseClicked() {                                     
        float numero1=0.0f;
        float numero2=0.0f;
        float resultado=0.0f;
        numero1=Float.parseFloat(this.viewcalculadora.jtf_numero1.getText());
        numero2=Float.parseFloat(this.viewcalculadora.jtf_numero2.getText());
        resultado = numero1 + numero2;
        this.viewcalculadora.jl_resultado.setText(String.valueOf(resultado));       
    }                                    

    private void jb_restaMouseClicked() {                                      
         float numero1=0.0f;
        float numero2=0.0f;
        float resultado=0.0f;
        numero1=Float.parseFloat(this.viewcalculadora.jtf_numero1.getText());
        numero2=Float.parseFloat(this.viewcalculadora.jtf_numero2.getText());
        resultado = numero1 - numero2;
        this.viewcalculadora.jl_resultado.setText(String.valueOf(resultado));  
    }                                     

    private void jb_moduloMouseClicked() {                                       
       float numero1=0.0f;
        float numero2=0.0f;
        float resultado=0.0f;
        numero1=Float.parseFloat(this.viewcalculadora.jtf_numero1.getText());
        numero2=Float.parseFloat(this.viewcalculadora.jtf_numero2.getText());
        resultado = numero1 % numero2;
        this.viewcalculadora.jl_resultado.setText(String.valueOf(resultado)); 
    }                                      

    private void jb_divisionMouseClicked() {                                         
          float numero1=0.0f;
        float numero2=0.0f;
        float resultado=0.0f;
        numero1=Float.parseFloat(this.viewcalculadora.jtf_numero1.getText());
        numero2=Float.parseFloat(this.viewcalculadora.jtf_numero2.getText());
        resultado = numero1 / numero2;
        this.viewcalculadora.jl_resultado.setText(String.valueOf(resultado)); 
    }                                        

    private void jb_multiplicacionMouseClicked() {                                               
         float numero1=0.0f;
        float numero2=0.0f;
        float resultado=0.0f;
        numero1=Float.parseFloat(this.viewcalculadora.jtf_numero1.getText());
        numero2=Float.parseFloat(this.viewcalculadora.jtf_numero2.getText());
        resultado = numero1 * numero2;
        this.viewcalculadora.jl_resultado.setText(String.valueOf(resultado)); 
    }                                                                                

    private void jb_limpiarMouseClicked() {                                        
        float numero1=0.0f;
        float numero2=0.0f;
        float resultado=0.0f;
        this.viewcalculadora.jtf_numero1.setText(String.valueOf(numero1));
        this.viewcalculadora.jtf_numero2.setText(String.valueOf(numero2));
        this.viewcalculadora.jl_resultado.setText(String.valueOf(resultado));
    }          

    }



  
