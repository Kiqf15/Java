/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.Random;
import view.FrmPrincipal;

/**
 *
 * @author kaiqu
 */
public class foge {
    FrmPrincipal janela;
    Random r;
    

    public foge(FrmPrincipal janela) {
        this.janela = janela;
        this.r = new Random();
    }
    
    public void run(){
        int x = janela.getBotao().getX();
        int y = janela.getBotao().getY();
        janela.getBotao().setLocation(
        r.nextInt(janela.getWidth()-(janela.getBotao().getWidth())),
        r.nextInt(janela.getHeight() - (janela.getBotao().getHeight()))
        );
    }
}
