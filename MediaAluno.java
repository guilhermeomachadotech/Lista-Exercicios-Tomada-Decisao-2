import java.util.*; 
public class MediaAluno {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		double nota1, nota2, media, notaExame,mediaE;
		System.out.println("Digite a primeira nota do aluno:");
		nota1=ler.nextDouble();
		System.out.println("Digite a segunda nota do aluno:");
		nota2=ler.nextDouble();
		media=(nota1+nota2)/2;
		System.out.println("A m�dia do aluno � "+media+".");
		if (media<3) {
			System.out.println("O aluno est� reprovado.");
		}else if (media>=6) {
			System.out.println("O aluno et� aprovado.");
		}else  {
			System.out.println("O aluno est� em exame.");
			System.out.println("Digite a nota do exame:");
			notaExame=ler.nextDouble();
			mediaE=(nota1+nota2+notaExame)/3;
			System.out.println("A nova m�dia � "+mediaE+".");
		if (mediaE>=6) {
				System.out.println("O aluno est� aprovado.");
			}else {
				System.out.println("O aluno est� reprovado.");
			}
		}
		ler.close();
	}

}
