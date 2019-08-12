package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Funcionario {

	private String nome;
	private String cpf;
	private ArrayList<double[][]> fichas = new ArrayList<>();
	
	public void setFichas(double[][] ficha) {
		fichas.add(ficha);
		
	}
	 
	public void getFicha() {
			
		System.out.println(fichas.size());
		
		detalhes();
		
	}
	
	public void detalhes() {
		Iterator i = fichas.iterator();
		
		while(i.hasNext()) {
			
		double[][] ficha = (double[][]) i.next();
			
			for(int l = 0; l < 8; l++) {
				for(int c = 0; c < 12; c++) {
				System.out.println("Linha "+l+ " Coluna "+c+" "+ficha[l][c]);
				}
			
			
			}
		
		i.next();
		System.out.println("----------------------");
		
		}
		
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
		
		
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getcpf() {
		return this.cpf;
		
		
	}
	
	
	
	
		
}
