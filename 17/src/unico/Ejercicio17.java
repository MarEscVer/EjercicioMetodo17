package unico;

public class Ejercicio17 {

	public static void main(String[] args) {

		/*
		 * Implementa un método que permita calcular la energía cinética de un cuerpo,
		 * sabiendo que, la energía cinética de un cuerpo es aquella que posee debido
		 * a su movimiento. La energía cinética de una masa puntual depende de su masa
		 * (m), y de su velocidad (v). Así:
		 */

		double masa;
		double velocidad;
		double energiaCinetica;

		Util.escribirLn("Programa para calcular Energía Cinética de un cuerpo.");
		Util.escribirLn("Para ello necesitamos: ");
		masa = Util.leerDouble("Masa: ");
		velocidad = Util.leerDouble("Velocidad: ");
		
		energiaCinetica = numBinario(masa, velocidad);
		Util.escribir("Energía cinética = " + energiaCinetica);
	}

	public static double numBinario(double m, double v) {
		double energia;
		
		energia = (Math.pow((m * v), 2)) / 2;

		return energia;
	}
}
