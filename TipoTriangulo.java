import java.util.*;
public class TipoTriangulo {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		double a, b, c;
		System.out.println("Digite a primeira medida do tri�ngulo:");
		a=ler.nextDouble();
		System.out.println("Digite a segunda medida:");
		b=ler.nextDouble();
		System.out.println("Digite a terceira medida:");
		c=ler.nextDouble();
		if (a>c+b || b>a+c || c>a+b) {
			System.out.println("As medidas n�o formam um tri�ngulo.");
		}else if (a==b && b==c && c==a) {
			System.out.println("As medidas formam um tri�ngulo equil�tero.");
		}else if (a!=b && b!=c && c!=a) {
			System.out.println("As medidas formam um tri�ngulo escaleno.");
		}else {
			System.out.println("As medidas formam um tri�ngulo is�sceles.");
		}
		ler.close();
	}

}
