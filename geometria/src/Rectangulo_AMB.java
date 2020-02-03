/**
 * 
 * @author Andrés Martínez Bertomeu
 * @version 1.2
 */
public class Rectangulo_AMB extends FiguraGeometrica_AMB {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de rectángulos
	 * @param tipoFigura indica el tipo de figura creada
	 * @param lG Lado Grande
	 * @param lP Lado Pequeño
	 */
	public Rectangulo_AMB(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Reescribe el método área de la superclase, calculando el área de un rectángulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Reescribe el método perímetro de la superclase, calculando el perímetro de un rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
