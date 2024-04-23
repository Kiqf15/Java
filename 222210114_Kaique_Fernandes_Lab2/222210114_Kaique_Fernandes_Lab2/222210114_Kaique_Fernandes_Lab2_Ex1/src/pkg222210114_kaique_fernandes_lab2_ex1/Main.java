/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210114_kaique_fernandes_lab2_ex1;

import java.util.Scanner;

/**
 *
 * @author unifkfernandes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o lado 1 do retângulo: ");
        ret1.setLado1(input.nextInt());
        System.out.print("Digite o lado 2 do retângulo: ");
        ret1.setLado2(input.nextInt());
        System.out.print("Digite o lado 1 do retângulo: ");
        ret2.setLado1(input.nextInt());
        System.out.print("Digite o lado 2 do retângulo: ");
        ret2.setLado2(input.nextInt());
        
        ret1.area();
        ret1.perimetro();
        ret2.area();
        ret2.perimetro();
        
        
    }

    
    
}
