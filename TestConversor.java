package testConversor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import conversor.Conversor;

public class TestConversor {

	Conversor meuConversor;
	
	@Before
	public void setUp() throws Exception {
	}

	
	
	
	@Test
	public void testCelsiusParaFahrenheit(){
		meuConversor = new Conversor();
		assertEquals(104.0, meuConversor.celsiusParaFahrenheit(40.0),0.01);
	
	}
	@Test
	public void testcelsiusParaKelvin(){
		meuConversor = new Conversor();
		assertEquals(273.0, meuConversor.celsiusParaKelvin(0.0), 0.01);
		
	}
	@Test
	public void testFahrenheitParaKelvin(){
		meuConversor = new Conversor();
		assertEquals(313.0, meuConversor.fahrenheitParaKelvin(104.0),0.001);
	
	}
	@Test
	public void testFahrenheitParaCelsius(){
		meuConversor = new Conversor();
		assertEquals(40.0, meuConversor.fahrenheitParaCelsius(104.0),0.01);
	
	}
	@Test
	public void testKelvinParaFahrenheit(){
		meuConversor = new Conversor();
		assertEquals(104.0, meuConversor.kelvinParaFahrenheit(313.0),0.01);
	
	}
	@Test
	public void testKelvinParaCelsius(){
		meuConversor = new Conversor();
		assertEquals(0.0, meuConversor.kelvinParaCelsius(273.0),0.01);
	
	}
	
	//Para inteiros
	@Test
	public void testcelsiusParaKelvinINT(){
		meuConversor = new Conversor();
		assertEquals(273, meuConversor.celsiusParaKelvin(0));
		
	}
	@Test
	public void testFahrenheitParaKelvinINT(){
		meuConversor = new Conversor();
		assertEquals(313, meuConversor.fahrenheitParaKelvin(104));
	
	}
	@Test
	public void testFahrenheitParaCelsiusINT(){
		meuConversor = new Conversor();
		assertEquals(40, meuConversor.fahrenheitParaCelsius(104));
	
	}
	@Test
	public void testKelvinParaFahrenheitINT(){
		meuConversor = new Conversor();
		assertEquals(104, meuConversor.kelvinParaFahrenheit(313));
	
	}
	@Test
	public void testKelvinParaCelsiusINT(){
		meuConversor = new Conversor();
		assertEquals(0, meuConversor.kelvinParaCelsius(273));
	
	}
}
