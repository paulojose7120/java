
import FuncionarioTeste.Func;
import Modelo.Funcionario;

public class Driver {

	public static void main(String[] args) {
		
		double[][] ficha1 = Func.retornaValores();
		double[][] ficha2 = Func.retornaValores();
		double[][] ficha3 = Func.retornaValores();
		double[][] ficha4 = Func.retornaValores();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Paulo Jose de S. Júnior");
		funcionario.setCpf("000.000.000-00");
		
		
		
		funcionario.setFichas(ficha1);
		funcionario.setFichas(ficha2);
		funcionario.setFichas(ficha3);
		funcionario.setFichas(ficha4);
		
		System.out.println("NOME: "+ funcionario.getNome());
		System.out.println("CPF: "+ funcionario.getcpf());
		System.out.print("");
		funcionario.getFicha();
	}

}
