/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210114_kaique_fernandes_lab2_ex1;

/**
 *
 * @author unifkfernandes
 */
public class Retangulo {
    private int lado1;
    private int lado2;
    private int area;
    private int perimetro;
    

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }
   
    
    public void area(){
        this.area = lado1*lado2;
        System.out.println("Area = " + area);
    }
    
    public void perimetro(){
        this.perimetro = lado1+lado1+lado2+lado2;
        System.out.println("Perimetro = "+ perimetro);
    }
}
