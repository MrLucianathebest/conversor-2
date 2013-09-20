package conversor;

public class Conversor {
	
	public double celsiusParaFahrenheit(double celsius) {
		double resultado = (9.0*celsius)/5.0+32.0;
		return resultado;
	}
	
	public int celsiusParaFahrenheit(int celsius) {
		int resultado = (9*celsius)/5+32;
		return resultado;
	}
	
	public double celsiusParaKelvin(double celsius) {
		double resultado = (celsius+273.0);
		return resultado;
	}
	
	public int celsiusParaKelvin(int celsius) {
		int resultado = (celsius+273);
		return resultado;
	}
	
	public double fahrenheitParaCelsius(double fahrenheit) {
		double resultado = (5.0*(fahrenheit-32.0))/(9.0);
		return resultado;
	}
	
	public int fahrenheitParaCelsius(int fahrenheit) {
		int resultado = (5*(fahrenheit-32))/(9);
		return resultado;
	}

	public double fahrenheitParaKelvin(double fahrenheit) {
		double resultado = (5.0*((fahrenheit-32.0)/9.0))+273.0;
		return resultado;
	}
	
	public int fahrenheitParaKelvin(int fahrenheit) {
		int resultado = (5*((fahrenheit-32)/9))+273;
		return resultado;
	}
	
	public double kelvinParaCelsius(double kelvin) {
		double resultado = (kelvin-273.0);
		return resultado;
	}
	
	public int kelvinParaCelsius(int kelvin) {
		int resultado = (kelvin-273);
		return resultado;
	}
	
	public double kelvinParaFahrenheit(double kelvin) {
		double resultado = (9.0*((kelvin-273.0)/5.0))+32.0;
		return resultado;
	}
	
	public int kelvinParaFahrenheit(int kelvin) {
		int resultado = (9*((kelvin-273)/5))+32;
		return resultado;
	}

}
