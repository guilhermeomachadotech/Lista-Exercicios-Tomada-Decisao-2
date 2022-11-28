import java.util.*;
public class DescontoIrpf {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		double salario, irpf;
		System.out.println("Digite o sal�rio do empregado:");
		salario=ler.nextDouble();
		if (salario<=1434.59) {
			System.out.println("N�o h� desconto do IRPF nessa base de c�lculo mensal do sal�rio.");
		}else if(salario<=2150.00) {
			irpf=(salario*7.5/100)-107.59;
			System.out.println("O valor do desconto do IRPF � de R$ "+irpf+".");
		}else if(salario<=2866.70) {
			irpf=(salario*15.0/100)-268.84;
			System.out.println("O valor do desconto do IRPF � de R$ "+irpf+".");
		}else if(salario<=3582.00) {
			irpf=(salario*22.5/100)-483.84;
			System.out.println("O valor do desconto do IRPF � de R$ "+irpf+".");
		}else {
			irpf=(salario*27.5/100)-662.94;
			System.out.println("O valor do desconto do IRPF � de R$ "+irpf+".");
		}
		ler.close();
	}

}
