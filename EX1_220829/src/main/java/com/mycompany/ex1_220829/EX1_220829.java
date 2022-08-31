package com.mycompany.ex1_220829;

import java.util.Scanner;


public class EX1_220829 {

    public static void main(String[] args) {
        
        int codigo;
        float salarioMensual;
        String nombre, apellido; 
        
        Scanner input = new Scanner(System.in);
        
        atributos trabajador = new atributos();
        
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        trabajador.setNombre(nombre);
        
        System.out.println("Ingrese su apellido: ");
        apellido = input.nextLine();
        trabajador.setApellidos(apellido);
        
        
        System.out.println("Ingrese su codigo: ");
        codigo = input.nextInt();
        trabajador.setCodigo(codigo);
        
        System.out.println("Ingrese su salario mensual: ");
        salarioMensual = input.nextFloat();
        trabajador.setSalarioMensual(salarioMensual);
        
        System.out.println("\nNombre del trabajador: " + trabajador.getNombre());
        System.out.println("Apellido del trabajador: " + trabajador.getApellidos());
        System.out.println("Codigo del trabajador: " + trabajador.getCodigo());
        System.out.println("\nSalario mensual: " + trabajador.getSalarioMensual());
        System.out.println("\nSalario diario: " + trabajador.getSalarioDiario(salarioMensual));
        
    }
}
