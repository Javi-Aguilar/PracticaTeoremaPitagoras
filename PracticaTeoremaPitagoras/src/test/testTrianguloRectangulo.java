package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	//TEST METODOS PARA TRIANGULO POR DEFECTO
		TrianguloRectangulo predet = new TrianguloRectangulo ();
		TrianguloRectangulo trian = new TrianguloRectangulo (4,6);
		
		@Test
		void testHipotenusa() {
			double valorEsperado = 1.4142135623730951;
			double valorObtenido = predet.hipotenusa();
			assertEquals(valorEsperado, valorObtenido);
		}
		
		
		@Test
		void testArea() {
			double valorEsperado = 0.5;
			double valorObtenido = predet.area();
			assertEquals(valorEsperado, valorObtenido);
		}
		
		@Test
		void testPerimetro() {
			double valorEsperado = 3.414213562373095;
			double valorObtenido = predet.perimetro();
			assertEquals(valorEsperado, valorObtenido);
		}
		
		
		//--------------------------------------------------------------------------
		
		/*
		//Triangulo con valores por parametro
		
		
		@Test
		void testHipotenusa() {
			double valorEsperado = 7.211102550927978;
			double valorObtenido = trian.hipotenusa();
			assertEquals(valorEsperado, valorObtenido);
		}

		@Test
		void testArea() {
			double valorEsperado = 12.0;
			double valorObtenido = trian.area();
			assertEquals(valorEsperado, valorObtenido);
		}

		@Test
		void testPerimetro() {
			double valorEsperado = 17.21110255092798;
			double valorObtenido = trian.perimetro();
			assertEquals(valorEsperado, valorObtenido);
		}
		*/
}
