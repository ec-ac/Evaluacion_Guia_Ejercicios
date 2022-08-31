package com.mycompany.ex1_220829;

public class atributos {
    private String nombre;
    private String apellidos;
    private int codigo;
    private float salarioMensual, salarioDiario;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }

    public float getSalarioDiario() {
        return salarioDiario;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public void setSalarioDiario(float salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public atributos() {
    }

    public atributos(String nombre, String apellidos, int codigo, float salarioMensual, float salarioDiario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.salarioMensual = salarioMensual;
        this.salarioDiario = salarioDiario;
    }
    
    public float getSalarioDiario(float salarioMensual) {
        return (salarioMensual/30);
    }
    
}

