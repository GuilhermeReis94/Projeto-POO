
public class Moto {
	
	private final int numeroChassi;
	private String estado;
	private String modelo;
	private String cor;
	private int ano;
	private double valor;
	private int km;
	
	public Moto(int numeroChassi, String estado, String modelo, String cor, int ano, double valor, int km) {
		this.numeroChassi = numeroChassi;
		this.estado = estado;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
		this.km = km;
	}
	
	public int getNumeroChassi() {
		return numeroChassi;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	public void consultaMoto() {
		System.out.println("Chassi: " + this.numeroChassi);
		System.out.println("Estado: " + this.estado);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Valor: " + this.valor);
		System.out.println("Km: " + this.km);
	}
}