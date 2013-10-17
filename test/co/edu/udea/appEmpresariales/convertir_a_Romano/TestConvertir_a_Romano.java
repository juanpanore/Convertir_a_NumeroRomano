package co.edu.udea.appEmpresariales.convertir_a_Romano;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.udea.appEmpresariales.convertir_a_Romano.Romano;


public class TestConvertir_a_Romano {
	
	Romano romano;
	@Before
	public void correrAntes() {
		romano= new Romano();
	}
	
	@Test
	public void testConvertir_a_I() {
		String numeroRomano=romano.cambiarARomano("1");
		Assert.assertEquals("I", numeroRomano);	
	}
	@Test
	public void testConvertir_a_II() {
		String numeroRomano=romano.cambiarARomano("2");
		Assert.assertEquals("II", numeroRomano);
	}
	@Test
	public void testConvertir_a_III() {
		String numeroRomano=romano.cambiarARomano("3");
		Assert.assertEquals("III", numeroRomano);
	}
	@Test
	public void testConvertir_a_IV() {
		String numeroRomano=romano.cambiarARomano("4");
		Assert.assertEquals("IV", numeroRomano);
	}
	@Test
		public void testConvertir_a_V() {
		String numeroRomano=romano.cambiarARomano("5");
		Assert.assertEquals("V", numeroRomano);
	}
	@Test
	public void testConvertir_a_VI() {
		String numeroRomano=romano.cambiarARomano("6");
		Assert.assertEquals("VI", numeroRomano);
	}
	@Test
	public void testConvertir_a_VII() {
		String numeroRomano=romano.cambiarARomano("7");
		Assert.assertEquals("VII", numeroRomano);
	}
	@Test
	public void testConvertir_a_VIII() {
		String numeroRomano=romano.cambiarARomano("8");
		Assert.assertEquals("VIII", numeroRomano);
	}
	@Test
	public void testConvertir_a_IX() {
		String numeroRomano=romano.cambiarARomano("9");
		Assert.assertEquals("IX", numeroRomano);
	}
}
