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
	@Test
	public void testConvertir_a_X() {
		String numeroRomano=romano.cambiarARomano("10");
		Assert.assertEquals("X", numeroRomano);
	}
	@Test
	public void testConvertir_a_XCI() {
		String numeroRomano=romano.cambiarARomano("91");
		Assert.assertEquals("XCI", numeroRomano);
	}
	@Test
	public void testConvertir_a_M() {
		String numeroRomano=romano.cambiarARomano("1000");
		Assert.assertEquals("M", numeroRomano);
	}
	@Test
	public void testConvertir_a_CMI() {
		String numeroRomano=romano.cambiarARomano("901");
		Assert.assertEquals("CMI", numeroRomano);
	}
	@Test
	public void testConvertir_a_DCXX() {
		String numeroRomano=romano.cambiarARomano("620");
		Assert.assertEquals("DCXX", numeroRomano);
	}
	@Test
	public void testConvertir_a_LXXIII() {
		String numeroRomano=romano.cambiarARomano("73");
		Assert.assertEquals("LXXIII", numeroRomano);
	}
	@Test
	public void testConvertir_a_XL() {
		String numeroRomano=romano.cambiarARomano("40");
		Assert.assertEquals("XL", numeroRomano);
	}
	@Test
	public void testConvertir_a_DLI() {
		String numeroRomano=romano.cambiarARomano("551");
		Assert.assertEquals("DLI", numeroRomano);
	}
	@Test
	public void testConvertir_a_DCCCLVII() {
		String numeroRomano=romano.cambiarARomano("857");
		Assert.assertEquals("DCCCLVII", numeroRomano);
	}
	@Test
	public void testConvertir_a_MD() {
		String numeroRomano=romano.cambiarARomano("1500");
		Assert.assertEquals("MD", numeroRomano);
	}
	@Test
	public void testConvertir_a_MDCLVII() {
		String numeroRomano=romano.cambiarARomano("1657");
		Assert.assertEquals("MDCLVII", numeroRomano);
	}
	@Test
	public void testConvertir_a_MM() {
		String numeroRomano=romano.cambiarARomano("2000");
		Assert.assertEquals("MM", numeroRomano);
	}
	@Test
	public void testConvertir_a_MMMCMXCIX() {
		String numeroRomano=romano.cambiarARomano("3999");
		Assert.assertEquals("MMMCMXCIX", numeroRomano);
	}
}
