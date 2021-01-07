package com.scrummertest.model;

public class Main {

    public static void main(String[] args) {
	FiguraCreacion factory = new FiguraCreacion();
	Figura cuadrado = factory.creaFigura(12f, 0f, 8f, 9F, "cuadrado");
	Figura triangulo = factory.creaFigura(1F, 2F, 4F, 3F, "triangulo");
	Figura circulo = factory.creaFigura(1F, 2F, 3F, 9F, "circulo");

	if (cuadrado != null) {
	    System.out.println(cuadrado.toString());
	}else{
	    System.out.println("tipo no valido");
	}
	if (triangulo != null) {
	    System.out.println(triangulo.toString());
	}else{
	    System.out.println("tipo no valido");
	}
	if (circulo != null) {
	    System.out.println(circulo.toString());
	}else{
	    System.out.println("tipo no valido");
	}

    }

}
