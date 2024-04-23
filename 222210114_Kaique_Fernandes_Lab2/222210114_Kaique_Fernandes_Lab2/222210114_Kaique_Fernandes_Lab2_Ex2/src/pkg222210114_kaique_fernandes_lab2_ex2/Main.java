/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210114_kaique_fernandes_lab2_ex2;

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
        Scanner input = new Scanner(System.in);
        
        Funcionarios f1 = new Funcionarios();
        Funcionarios f2 = new Funcionarios();
        System.out.print("Nome: ");
        f1.setNome(input.nextLine());
        System.out.print("Sobrenome: ");
        f1.setSobrenome(input.nextLine());
        System.out.print("Salario: ");
        f1.setSalario(input.nextDouble());
        input.nextLine();
        System.out.print("Nome: ");
        f2.setNome(input.nextLine());
        System.out.print("Sobrenome: ");
        f2.setSobrenome(input.nextLine());
        System.out.print("Salario: ");
        f2.setSalario(input.nextDouble());
        
        f1.salario();
        f2.salario();
        
    }
    
}
