import java.util.*;
public class ConsumoMedioEconomicoOuNaoEconomico {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		double km, litros, consumoMedio;
		System.out.println ("Digite a dist�ncia percorrida (em kil�metros):");
		km=ler.nextDouble();
		System.out.println("Digite a capacidade do tanque de combust�vel (em litros):");
		litros=ler.nextDouble();
		consumoMedio=km/litros;
		System.out.println ("O consumo m�dio � de "+consumoMedio+" km/L.");
		if (consumoMedio>=10) {
			System.out.println("O carro � econ�mico.");
		}else {
			System.out.println("O carro n�o � econ�mico.");
		}
		ler.close();
	}

}
