
public class Venda {
	
	private Pessoa pessoa;
	private Moto moto;
	private double valorTotal;
	private String tipoPagamento;
	
	public Venda(Pessoa pessoa, Moto moto, double valorTotal, String tipoPagamento) {
		this.pessoa = pessoa;
		this.moto = moto;
		this.valorTotal = valorTotal;
		this.tipoPagamento = tipoPagamento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Moto getMoto() {
		return moto;
	}
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public static double totNota(double valorTotal, double desconto) {
		return (valorTotal - desconto);
	}
	
	public void gerarVenda() {
		System.out.println("---- Dados do Cliente ----");
		System.out.println("Nome do Cliente: " + pessoa.getNome());
		System.out.println("CPF do Cliente: " + pessoa.getCpf());
		System.out.println("---- Dados do Veiculo ----");
		System.out.println("Número de Chassi: " + moto.getNumeroChassi());
		System.out.println("Estado: " + moto.getEstado());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Valor: " + moto.getValor());
		System.out.println("Quilometragem: " + moto.getKm());
		System.out.println("Valor total da Nota: " + this.valorTotal);
		System.out.println("Tipo de pagamento: " + this.tipoPagamento);
	}
	
	public void gerarVenda(double desconto) {
		System.out.println("---- Dados do Cliente ----");
		System.out.println("Nome do Cliente: " + pessoa.getNome());
		System.out.println("CPF do Cliente: " + pessoa.getCpf());
		System.out.println("---- Dados do Veiculo ----");
		System.out.println("Número de Chassi: " + moto.getNumeroChassi());
		System.out.println("Estado: " + moto.getEstado());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Valor: " + moto.getValor());
		System.out.println("Quilometragem: " + moto.getKm());
		System.out.println("Valor total da Nota: " + totNota(valorTotal, desconto));
		System.out.println("Tipo de pagamento: " + this.tipoPagamento);
	}
}