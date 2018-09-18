/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-1
 */
public class DataValidation {
     public float string2Int(String value){
    float numero2=0;
    try{
        numero2 =Integer.parseInt(value);
    }catch(NumberFormatException err){
        JOptionPane.showMessageDialog(null,"Error al convertir  valor");
        numero2 =0;
    }
    return numero2;
    } 
    public float string2Float(String value){
    float numero1=0.0f;
    try{
        numero1 = Float.parseFloat(value);
        
    }catch(NumberFormatException err){
        JOptionPane.showMessageDialog(null,"Error al convertir  valor");
        numero1 =0.0f;
    }
    return numero1;
    } 
   
    public double string2Double(String value){
    double numero2=0.0;
    try{
        numero2 = Double.parseDouble(value);
    }catch(NumberFormatException err){
        JOptionPane.showMessageDialog(null,"Error al convertir  valor");
        numero2 =0.0;
    }
    return numero2;
    } 

}
