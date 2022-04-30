package atividade_explorando_conceitos_oo_com_formas_geometricas;

public class Quadrado extends FormaGeometrica implements Quadrilatero{

    private double area;
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getArea(){
        return this.area;
    }

    public void calcularArea() {
        this.area = this.lado * this.lado;
    }

    @Override
    public void mostrarArea() {
        System.out.println(this.getArea());
    }
}
