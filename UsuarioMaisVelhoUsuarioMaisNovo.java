import java.util.*; 
public class UsuarioMaisVelhoUsuarioMaisNovo {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		String nome;
		String nomeVelho;
		String nomeNovo;
		byte idade, idadeVelho, idadeNovo;
		System.out.println("Digite o nome do primeiro usu�rio:");
		nome=ler.next();
		System.out.println("Digite a idade do primeiro usu�rio:");
		idade=ler.nextByte();
		nomeVelho=nome;
		nomeNovo=nome;
		idadeVelho=idade;
		idadeNovo=idade;
		System.out.println("Digite o nome do segundo usu�rio:");
		nome=ler.next();
		System.out.println("Digite a idade do segundo usu�rio:");
		idade=ler.nextByte();
		if(idade>idadeVelho) {
			nomeVelho=nome;
			idadeVelho=idade;
		}else if(idade<idadeNovo) {
			nomeNovo=nome;
			idadeNovo=idade;
		}
		System.out.println("Digite o nome do terceiro usu�rio:");
		nome=ler.next();
		System.out.println("Digite a idade do terceiro usu�rio:");
		idade=ler.nextByte();
		if(idade>idadeVelho) {
			nomeVelho=nome;
			idadeVelho=idade;
		}else if(idade<idadeNovo) {
			nomeNovo=nome;
			idadeNovo=idade;
		}
		System.out.println("Digite o nome do quarto usu�rio:");
		nome=ler.next();
		System.out.println("Digite a idade do quarto usu�rio:");
		idade=ler.nextByte();
		if(idade>idadeVelho) {
			nomeVelho=nome;
			idadeVelho=idade;
		}else if(idade<idadeNovo) {
			nomeNovo=nome;
			idadeNovo=idade;
		}
		System.out.println("Digite o nome do quinto usu�rio:");
		nome=ler.next();
		System.out.println("Digite a idade do quinto usu�rio:");
		idade=ler.nextByte();
		if(idade>idadeVelho) {
			nomeVelho=nome;
			idadeVelho=idade;
		}else if(idade<idadeNovo) {
			nomeNovo=nome;
			idadeNovo=idade;
		}
		if(idadeVelho!=idadeNovo) {
			System.out.println(nomeVelho+" � o usu�rio mais velho, com "+idadeVelho+" anos e o usu�rio mais novo � "+nomeNovo+", com "+idadeNovo+" anos.");
		}else if(idadeVelho==idadeNovo) {
			System.out.println("Todos t�m a mesma idade.");
		}
		ler.close();
	}
	
		
}
