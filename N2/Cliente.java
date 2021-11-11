
public class Cliente extends Pessoa {
	
	private String tipoCnh;
	private String endereco;
	
	public Cliente(String nome, String cpf, int idade, String sexo, String tipoCnh, String endereco) {
		super(nome, cpf, idade, sexo);
		this.tipoCnh = tipoCnh;
		this.endereco = endereco;
	}
	
	public String getTipoCnh() {
		return tipoCnh;
	}
	public void setTipoCnh(String tipoCnh) {
		this.tipoCnh = tipoCnh;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Tipo de CNH: " + this.tipoCnh);
		System.out.println("Endereço: " + this.endereco);
	}
}