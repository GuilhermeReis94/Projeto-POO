
public class Vendedor extends Pessoa implements IVendedor{
	
	private String dataAdmissao;
	private int vendasNoMes;
	
	public Vendedor(String nome, String cpf, int idade, String sexo, String dataAdmissao, int vendasNoMes) {
		super(nome, cpf, idade, sexo);
		this.dataAdmissao = dataAdmissao;
		this.vendasNoMes = vendasNoMes;
	}
	
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public int getVendasNoMes() {
		return vendasNoMes;
	}
	public void setVendasNoMes(int vendasNoMes) {
		this.vendasNoMes = vendasNoMes;
	}
	
	public void calcularComissao() {
		System.out.println("O valor da comissão é de: " + (vendasNoMes * 350));
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Data de Admissão: " + this.dataAdmissao);
		System.out.println("Vendas no Mês: " + this.vendasNoMes);
	}
}