package Exemplo2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 22);
		Aluno aluno3 = new Aluno("Pedro", 19);
		List<Aluno> lista = new ArrayList<>();		
		Arquivo arquivo = new Arquivo("alunos");
		arquivo.gravarArquivo(aluno1);
		arquivo.gravarArquivo(aluno2);
		arquivo.gravarArquivo(aluno3);
		
		lista = arquivo.leArquivo();
		
		for(Aluno a : lista) {
			System.out.println("Nome: "+ a.getNome() + ", Idade: "+ a.getIdade());
		}

	}

}
