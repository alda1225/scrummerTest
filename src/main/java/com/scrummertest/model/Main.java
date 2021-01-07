package com.scrummertest.model;

public class Main {

    public static void main(String[] args) {
	FiguraCreacion factory = new FiguraCreacion();
	Figura cuadrado = factory.creaFigura(12f, 0f, 8f, 9F, "cuadrado");
	Figura triangulo = factory.creaFigura(1F, 2F, 4F, 3F, "triangulo");
	Figura circulo = factory.creaFigura(1F, 2F, 3F, 9F, "s");

	if (cuadrado != null) {
	    System.out.println(cuadrado.toString());
	}
	if (triangulo != null) {
	    System.out.println(triangulo.toString());
	}
	if (circulo != null) {
	    System.out.println(circulo.toString());
	}

    }

}
