package Modelo;
/*Uma ficha representa uma array bi-dimensional onde � armazenado
salarios no periodo de um ano, dispostos e organizado em linhas e colunas,
cada linha representa os encargos sociais do salario (INSS, IRRF, PENS�O DE ALIMENTOS, etc)
cada coluna representa o valor recebido no m�s;
*/
public class Ficha {

	private Double[][] ficha = new Double[8][12];

	public Double[][] getFicha() {
		return ficha;
	}

	public void setFicha(Double[][] ficha) {
		this.ficha = ficha;
	}
}
