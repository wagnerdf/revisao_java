package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {
	
	/* Main é um metodo auto executavel em Java*/
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		/*Iniciando interface de acesso para usuario secretario*/
		String login = JOptionPane.showInputDialog("Informe o logi");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
				
		if( permitirAcesso.autenticar()) {/*se TRUE acessa se FALSE não acessa*/
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		for(int qtd = 1; qtd <=5; qtd++) {
		
		/* new Aluno() é uma instancia (Criação de Objeto)*/
		/* aluno1 é uma referencia para o objeto aluno*/
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
		String rg = JOptionPane.showInputDialog("Registro geral?");
		String numeroCpf = JOptionPane.showInputDialog("Numero do CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pae?");
		String dataMatricula = JOptionPane.showInputDialog("Data matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Nome da escola");
		*/
	
		Aluno aluno1 = new Aluno();
		
		
		aluno1.setNome(nome);
		
		/*
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMaricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		*/
		
		for (int pos =1; pos <= 1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina?");
		
		if(escolha == 0) {/*Opção sim e zero*/
			
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover == 0) {
			
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
		}
	alunos.add(aluno1);	
	}
		
	maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());	
	maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());	
	maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());	
		
	for (Aluno aluno : alunos) {
		
		if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
			maps.get(StatusAluno.APROVADO).add(aluno);
		}else
		if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
			maps.get(StatusAluno.RECUPERACAO).add(aluno);
		}else {
			maps.get(StatusAluno.REPROVADO).add(aluno);
		}
		
	}
	
	System.out.println("-------------- Lista dos Aprovados --------------------");
	for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
		System.out.println("O Aluno(a): "+aluno.getNome()+" - Resultado = "+ aluno.getAlunoAprovado2()+" com média de = "+aluno.getMediaNota());
	}
	System.out.println("-------------- Lista dos Reprovados --------------------");
	for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
		System.out.println("O Aluno(a): "+aluno.getNome()+" - Resultado = "+ aluno.getAlunoAprovado2()+" com média de = "+aluno.getMediaNota());
	}
	System.out.println("-------------- Lista dos em Recuperação --------------------");
	for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
		System.out.println("O Aluno(a): "+aluno.getNome()+" - Resultado = "+ aluno.getAlunoAprovado2()+" com média de = "+aluno.getMediaNota());
	}

		}else {
			JOptionPane.showMessageDialog(null,"Acesso não permitido");
		}
	}

}
