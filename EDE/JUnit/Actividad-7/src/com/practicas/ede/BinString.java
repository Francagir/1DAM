//Francisco Carrasco Girb�s - Primer cambio
package com.practicas.ede;

// �Qu� puede hacer esta Clase?
//Convertir  un numero y una cadena a binario
public class BinString {
	public BinString() {
	}

	// �Qu� hace este m�todo?
	// convierte a binario el resultado de la suma
	public String convertir(String s) {
		return aBinario(sumar(s));
	}

	// �Qu� hace este m�todo?
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

	// �Qu� hace este m�todo?
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
