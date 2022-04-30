package atividade_explorando_conceitos_oo_com_formas_geometricas;

public class Triangulo extends FormaGeometrica{

    private double area;
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea(){
        return this.area;
    }

    public void calcularArea() {
        this.area = (this.base * this.altura) / 2;
    }

    @Override
    public void mostrarArea() {
        System.out.println(this.getArea());
    }
}
