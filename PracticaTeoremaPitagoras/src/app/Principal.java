package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		//Catetos entre 0 y 10
		TrianguloRectangulo trian = new TrianguloRectangulo (4,6);
		
		//Triangulo por defecto
		TrianguloRectangulo predet = new TrianguloRectangulo ();
		
		//TRIAN
		double area1 = trian.area();
		double perimetro1 = trian.perimetro();
		
		//PREDET
		double area2 = predet.area();
		double perimetro2 = predet.perimetro();
		
		System.out.print("Finalizado");
		
		
		
		

	}

}
