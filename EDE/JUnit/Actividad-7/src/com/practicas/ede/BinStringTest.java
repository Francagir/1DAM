package com.practicas.ede;

import static org.junit.Assert.*;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

public class BinStringTest {

	private BinString binString;

	public BinStringTest() {
		binString = new BinString();
	}

	@Test
	public void sumarTest() {
		// Test de la función sumar
		int expected = 0;
		assertEquals(expected, binString.sumar(""));
		expected = 292;
		assertEquals(expected, binString.sumar("aba"));
		expected = 292;
	}

	@Test
	public void aBinarioTest() {
		// Test de la función aBinario
		String expected = "100100100";
		assertEquals(expected, binString.aBinario(292));

	}

	@Test
	public void convertirTest() {

		String expected = "100100100";
		assertEquals(expected, binString.convertir("aba"));
	}
}
