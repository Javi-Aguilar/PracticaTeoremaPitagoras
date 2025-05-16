package clases;

public class TrianguloRectangulo {
	
	int a;
	int b;
	double c;
	
	/**
	 * Crea un Triángulo Rectángulo con catetos de 1cm
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	/**
	 * Crea un triángulo rectángulo con los catetos pasasdos por parámetros
	 * @param catA cateto del triangulo en cm
	 * @param catB cateto del triangulo en cm
	 * @throws IllegalArgumentException, el valor tiene que ser mayor a 0
	 */
	public TrianguloRectangulo(int catA, int catB) {
		if(catA <= 0 || catB <= 0) {
			throw new IllegalArgumentException("El valor de los catetos tiene que ser mayor a 0");
		}
		else {
			this.a = catA;
			this.b = catB;
		}
	}
	
	/**
	 * Calcula el area de un triángulo rectángulo en cm
	 * @return valor del en cm
	 */
	public int area() {
		return (this.a * this.b) / 2;
	}
	
	/**
	 * calcula la hipotenusa de un triangulo rectangulo en cm
	 * @return valor de la hipotenusa en cm
	 */
	public double hipotenusa() {
		this.c = Math.sqrt( ( this.a*this.a ) + ( this.b*this.b ) );
		return this.c;
	}
	
	/**
	 * Calcula el perímetro de un triangulo rectangulo en cm
	 * @return valor del perímetro en cm
	 */
	public double perimetro() {
		return this.a + this.b + hipotenusa();
	}
	
	//GETTER y SETTER
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public void setA(int catA) {
		this.a = catA;
	}
	
	public void setB(int catB) {
		this.b = catB;
	}
	
	public void setC(double catC) {
		this.c = catC;
	}
	
	//Metodo toString
	public String toString() {
		String res = "Cateto A: "+this.a + "Cateto B: "+this.b + "Hipotenusa" + this.c;
		return res;
	}
	
	
}
