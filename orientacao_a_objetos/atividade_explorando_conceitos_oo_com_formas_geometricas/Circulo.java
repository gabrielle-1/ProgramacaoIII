package atividade_explorando_conceitos_oo_com_formas_geometricas;

public class Circulo extends FormaGeometrica{

    private double area;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        return this.area;
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * (Math.pow(raio,2));
    }

    @Override
    public void mostrarArea() {
        System.out.println(this.getArea());
    }
}
