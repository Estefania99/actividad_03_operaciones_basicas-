/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
    import controllers.controllerCalculadora;
    import models.modelCalculadora;
    import views.viewCalculadora;
/**
 *
 * @author fanny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelCalculadora model = new modelCalculadora();
        viewCalculadora view = new viewCalculadora();
        controllerCalculadora ControllerCalculadora = new controllerCalculadora( model ,  view);
    }
    
}
