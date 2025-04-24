/*
 * Desenvolvido por Alisson de Carvalho Silva
 * 					Cecília Guimarães Maia
 * 					Tiago Jurã Teixeira Araújo
 */

 /*
  * Simulação mínima
  */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Scanner in = new Scanner( System.in );

		// dados mockados

			Curso pp = new Curso("Projeto de Programas", "120 horas", "Ensinar Paradigma Orientado a Objeto");
			Curso ftc = new Curso("Fundamentos Téoricos da Computação", "60 horas", "Abordar temas teóricos acerca da computação");
			Curso md = new Curso("Matemática Discreta", "120h", "Lógica de Predicados");
			Curso aed = new Curso("Algoritmo e Estrutura de Dados", "120h", "Abordagem de Algoritmos");

			Aluno aluno1 = new Aluno("Alisson", 1234, "Alisson@email.com");
			Aluno aluno2 = new Aluno("Moises", 1244, "Moa@email.com");
			Aluno aluno3 = new Aluno("Cecilia", 1342, "Ceci@email.com");
			Aluno aluno4 = new Aluno("Tiago", 3324, "tiago@email.com");
			Aluno aluno5 = new Aluno("Gustavo", 1324, "gusttavo@email.com");

			Turma tm1 = new Turma("Lic7002", "Quarto Período");
			Turma tm2 = new Turma("Lic7001", "Quatro Período");
			Turma tm3 = new Turma("Lic7003", "Quatro Período");
			Turma tm4 = new Turma("Lic7004", "Quatro Período");
			Turma tm5 = new Turma("Lic7005", "Quatro Período");

			Professor prof1 = new Professor("Fábio Santos", "Paradigma Orientado a Objeto", 1234);
			Professor prof2 = new Professor("Elloa Guedes", "Fundamentos Computacionais", 4321);

			Avaliacao av1 = new Avaliacao("Prova", 10, 1);
			Avaliacao av2 = new Avaliacao("Trabalho", 10, 1);
			Avaliacao av3 = new Avaliacao("Atividade", 10, 1);

		// -  -  -

		int x;

		System.out.println("\nDIGITE UM NÚMERO ABAIXO PARA EXECUTAR UMA SIMULAÇÂO: \n\n[1] : 2 professores com cursos distintos \n[2] : 2 cursos, cada um ao menos com 1 turma \n[3] : 5 alunos matriculados em turmas variadas \n[4] : Pelo menos 3 avaliações por turma \n[5] : Submissões cruzadas entre alunos e avaliações \n[6] : geração de relatório de desempenho por aluno\n");
		x = in.nextInt();
		in.nextLine();

		if( x == 1){

			// 2 professores com cursos distintos

			prof1.setCurso(pp); 
			pp.setProfessor(prof1);
			prof1.setCurso(aed); 
			aed.setProfessor(prof1);

			prof2.setCurso(ftc); 
			ftc.setProfessor(prof2);
			prof2.setCurso(md); 
			md.setProfessor(prof2);

			System.out.println("\nAguarde. Gerando simulação...");

			Thread.sleep(2000);

			System.out.println("\nProfessor 1: ");
			prof1.getAll();

			Thread.sleep(2000);

			System.out.println("\nProfessor 2: ");
			prof2.getAll();

		}else{
			if(x == 2){

				pp.setTurma(tm1);
				ftc.setTurma(tm2);

				System.out.println("\nBeleza! Vamos lá para a simulação 2!\n");

				Thread.sleep(2000);

				System.out.println("Aguarde. Gerando a simulação...");

				Thread.sleep(2000);

				System.out.println("\nTurma 1: ");
				pp.setProfessor(prof1);
				pp.getAll();

				Thread.sleep(2000);

				System.out.println("\nTurma 2: ");
				ftc.setProfessor(prof2);
				ftc.getAll();

			}else{
				if(x == 3){

					aluno1.setTurma(tm5);
					aluno1.setTurma(tm3);
					aluno1.setTurma(tm1);

					aluno2.setTurma(tm2);
					aluno2.setTurma(tm4);

					aluno3.setTurma(tm5);
					aluno3.setTurma(tm3);
					aluno3.setTurma(tm1);

					aluno4.setTurma(tm2);
					aluno4.setTurma(tm4);

					aluno5.setTurma(tm5);
					aluno5.setTurma(tm3);
					aluno5.setTurma(tm1);

					System.out.println("\nBeleza! Vamos lá para a simulação 2!\n");

					System.out.println("Aguarde. Gerando a simulação...");

					Thread.sleep(2000);

					System.out.println("\nAluno 1: ");
					aluno1.getAll();

					Thread.sleep(2000);

					System.out.println("\nAluno 2: ");
					aluno2.getAll();

					Thread.sleep(2000);

					System.out.println("\nAluno 3: ");
					aluno3.getAll();

					Thread.sleep(2000);

					System.out.println("\nAluno 4: ");
					aluno4.getAll();

					Thread.sleep(2000);

					System.out.println("\nAluno 5: ");
					aluno5.getAll();

				}else{
					if(x == 4){

						tm1.adicionarAvaliacao(av3);
						tm1.adicionarAvaliacao(av2);
						tm1.adicionarAvaliacao(av1);

						System.out.println("\nBeleza. Vamos realizar a simulação 4\n");

						System.out.println("\nAvaliações da Turma 1: \n");
						tm1.getAvaliacoes();





					}else{
						if(x == 5){



						}else{
							if(x == 6){


								
							}else{
								System.out.println("Valor inválido! Reinicie o programa");
							}
						}	
					}
				}
			}
		}

	}

}
