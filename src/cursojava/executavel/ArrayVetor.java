package cursojava.executavel;



import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	
	public static void main(String[] args) {
		
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {7.8,9.5,6.8,7.2};
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Wagner Augusto de Andrade");
		aluno.setNomeEscola("JDEV Treinamento");
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		/*Criação do aluno*/
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Marina Amorim Moura de Andrade");
		aluno2.setNomeEscola("JDEV Treinamento");
		
		/*Criação da disciplina*/
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Portugues");
		disciplina3.setNota(notas);
		
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("PHP");
		disciplina4.setNota(notasLogica);
		
		aluno2.getDisciplinas().add(disciplina4);
		
		
		//-------------------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno é: "+ arrayAlunos[pos].getNome());
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é : "+d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota número: "+posnota+" é igual = "+d.getNota()[posnota]);
				}
				
			}
			
		}
		
	}
}
















