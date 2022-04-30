package atividade_explorando_conceitos_oo_com_formas_geometricas;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(10);
        Circulo circulo = new Circulo(10);
        Triangulo triangulo = new Triangulo(10,8);

        quadrado.calcularArea();
        quadrado.mostrarArea();

        circulo.calcularArea();
        circulo.mostrarArea();

        triangulo.calcularArea();
        triangulo.mostrarArea();
    }
}
