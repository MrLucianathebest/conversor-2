package conversor;
import java.io.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Conversor umConversor = new Conversor(); 
		System.out.println("Escolha a opção para conversão:");
		System.out.println("1 -> De graus Celcius para graus Fahrenheit");
		System.out.println("2 -> De graus Celsius para Kelvin");
		System.out.println("3 -> De graus Fahrenheit para graus Celsius");
		System.out.println("4 -> De graus Fahrenheit para Kelvin");
		System.out.println("5 -> De Kelvin para graus Fahrenheit");
		System.out.println("6 -> De Kelvin para graus Celsius");
		
		int opcao = Integer.parseInt(leitor.readLine());
		System.out.println("Digite o valor da temperatura:");
		double valorLido = Double.parseDouble(leitor.readLine());
		
		switch (opcao){
			
			case 1: System.out.println("O resultado da conversão é: " + umConversor.celsiusParaFahrenheit(valorLido));
			break;
			case 2:System.out.println("O resultado da conversão é: " + umConversor.celsiusParaKelvin(valorLido));	
			break;
			case 3: System.out.println("O resultado da conversão é: "+ umConversor.fahrenheitParaCelsius(valorLido));
			break;
			case 4: System.out.println("O resultado da conversõa é: "+ umConversor.fahrenheitParaKelvin(valorLido));
			break;
			case 5: System.out.println("O resultado da conversão é: "+ umConversor.kelvinParaFahrenheit(valorLido));
			break;
			case 6: System.out.println("O resultado da conversão é: "+ umConversor.kelvinParaCelsius(valorLido));
			break;
		}				
	}		
}
	


