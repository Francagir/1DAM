//Francisco Carrasco Girbés - Primer cambio
package com.practicas.ede;

// ¿Qué puede hacer esta Clase?
//Convertir  un numero y una cadena a binario
public class BinString {
	public BinString() {
	}

	// ¿Qué hace este método?
	// convierte a binario el resultado de la suma
	public String convertir(String s) {
		return aBinario(sumar(s));
	}

	// ¿Qué hace este método?
	// Suma los caracteres de la cadena (en valor binario)
	public int sumar(String s) {
		String s1 = s.substring(0);
		int sum = 0;
		while (!s1.equals("")) {
			sum = sum + (int) (s1.charAt(0));
			s1 = s1.substring(1);
		}

		return sum;
	}

	// ¿Qué hace este método?
	//Convierte un numero a binario
	public String aBinario(int n) {
		String s = "";

		while (n > 0) {
			if (n % 2 == 0)
				s = "0" + s;
			else
				s = "1" + s;
			n = n / 2;
		}

		return s;
	}

	public static void main(String[] args) {

	}
}
