import java.util.*;
public class RaizRealX {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		System.out.println("Digite o valor de A:");
		a=ler.nextDouble();
		System.out.println("Digite o valor de B:");
		b=ler.nextDouble();
		System.out.println("Digite o valor de C:");
		c=ler.nextDouble();
		delta=b*b-4*a*c;
		if (delta<0) {
			System.out.println("N�o existem ra�zes reais de X nessa equa��o.");
		}else if(delta==0) {
			x1=(-b+(Math.sqrt (delta)))/(2*a);
			System.out.println("A �nica raiz real de x � "+x1+".");
		}else {
			x1=(-b+(Math.sqrt (delta)))/(2*a);
			x2=(-b-(Math.sqrt (delta)))/(2*a);
			System.out.println("O valor da primeira ra�z real de x � "+x1+" e da segunda � "+x2+".");
		}
		ler.close();
	}

}
