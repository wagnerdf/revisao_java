package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Wagner Augusto de Andrade");
		aluno.setNomeEscola("JDEV - Treinamento");
		aluno.setIdade(15);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("5445225458");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("65485452-25");
		secretario.setIdade(18);
		secretario.setNome("João de Farias");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade()+ " - "+ aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(" Salário é = "+aluno.salario());
		System.out.println(" Salário é = "+diretor.salario());
		System.out.println(" Salário é = "+secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
					
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = "
				+ pessoa.getNome() + " e o salario é de = "+pessoa.salario());
	}

}
