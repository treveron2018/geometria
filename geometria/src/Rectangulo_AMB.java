/**
 * 
 * @author Andr�s Mart�nez Bertomeu
 * @version 1.2
 */
public class Rectangulo_AMB extends FiguraGeometrica_AMB {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de rect�ngulos
	 * @param tipoFigura indica el tipo de figura creada
	 * @param lG Lado Grande
	 * @param lP Lado Peque�o
	 */
	public Rectangulo_AMB(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Reescribe el m�todo �rea de la superclase, calculando el �rea de un rect�ngulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Reescribe el m�todo per�metro de la superclase, calculando el per�metro de un rect�ngulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
