/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import FrmPrincipal.janela;
import java.awt.event.MouseEvent;

/**
 *
 * @author kaiqu
 */
public class controller {
        janela janela;

    public controller(janela janela) {
        this.janela = janela;
    }
    
    public void arrasta(){
        int x = (int) janela.getMousePosition().getX();
        int y = (int) janela.getMousePosition().getY();
        janela.getFoto().setLocation(
                janela.getLocation().x + x - janela.getFoto().getWidth()/2,
                janela.getLocation().y + y - janela.getFoto().getHeight()/2
        );
        
    }
    
    public void mouseDragged(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        arrasta();
    }
}
