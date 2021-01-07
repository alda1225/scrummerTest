package com.scrummertest.model;

public class FiguraCreacion {
	
	public Figura creaFigura (Float superficie, Float base, Float alto, Float diametro, String tipoFigura) {
		if (tipoFigura.equalsIgnoreCase("cuadrado")) {
			return new Cuadrado(superficie, base, tipoFigura);
		} else if (tipoFigura.equalsIgnoreCase("triangulo")) {
			return new Triangulo(superficie, base, alto, tipoFigura);
		} else if (tipoFigura.equalsIgnoreCase("circulo")) {
			return new Circulo(superficie, diametro, tipoFigura);
		}	
		return null;
	}
}
