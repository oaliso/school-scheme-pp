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


		int x;

		System.out.println("\nDIGITE UM NÚMERO ABAIXO PARA EXECUTAR UMA SIMULAÇÂO: \n\n[1] : 2 professores com cursos distintos \n[2] : 2 cursos, cada um ao menos com 1 turma \n[3] : 5 alunos matriculados em turmas variadas \n[4] : Pelo menos 3 avaliações por turma \n[5] : Submissões cruzadas entre alunos e avaliações \n[6] : geração de relatório de desempenho por aluno\n");
		x = in.nextInt();
		in.nextLine();

		if( x == 1){

			// 2 professores com cursos distintos

			Curso pp = new Curso("Projeto de Programas", "120 horas", "Ensinar Paradigma Orientado a Objeto");
			Curso ftc = new Curso("Fundamentos Téoricos da Computação", "60 horas", "Abordar temas teóricos acerca da computação");
			Curso md = new Curso("Matemática Discreta", "120h", "Lógica de Predicados");
			Curso aed = new Curso("Algoritmo e Estrutura de Dados", "120h", "Abordagem de Algoritmos");

			Professor prof1 = new Professor("Fábio Santos", "Paradigma Orientado a Objeto", 1234);
			Professor prof2 = new Professor("Elloa Guedes", "Fundamentos Computacionais", 4321);

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

		// alisson ja ta fazendo

		}else{
			if(x == 2){



			}else{
				if(x == 3){



				}else{
					if(x == 4){



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
