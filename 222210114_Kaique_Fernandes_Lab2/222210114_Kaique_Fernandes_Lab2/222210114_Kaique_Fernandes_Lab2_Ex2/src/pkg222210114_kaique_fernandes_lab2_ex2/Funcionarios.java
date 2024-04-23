/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210114_kaique_fernandes_lab2_ex2;

/**
 *
 * @author unifkfernandes
 */
public class Funcionarios {
    private String nome;
    private String sobrenome;
    private double salario;
    private double salarioanual;
    private double salarioatual;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    public void salario(){
        if (salario < 0){
            salario = 0;
        }
        else{
            salarioanual = 12*salario;
            salarioatual = salarioanual + salarioanual*0.1;
            System.out.println("Salário anual sem reajuste de 10%: "+ salarioanual);
            System.out.println("Salário anual com reajuste de 10%: "+ salarioatual);
        }
        
    }
    
}
