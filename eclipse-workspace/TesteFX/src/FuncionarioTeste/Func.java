package FuncionarioTeste;

public class Func {

	static int linha = 8;
	static int coluna = 12;
	
	public static double[][] ficha = new double [linha][coluna];
	
	public static double[][] retornaValores() {
	for(int i = 0; i < linha; i++) {
		for(int z = 0; z < coluna; z++) {
			ficha[i][z] = 500.0;
			
		}				
		}
	return ficha;
	}
}
