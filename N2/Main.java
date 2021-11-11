
public class Main {

	public static void main(String[] args) {
		
		Moto m1 = new Moto(12999, "Nova", "Honda Biz 125", "Vermelha", 2018, 7899, 12000);
		
		Vendedor v1 = new Vendedor("Carlos", "2549856", 27, "Masculino", "12/01/2007", 2);
		
		Pessoa c1 = new Cliente("Joao", "29876541", 18, "Masculino", "AB", "Av. das Amoreiras 12");
		
		System.out.println("");
		Venda venda1 = new Venda(c1, m1, 7899, "Parcelado");
		venda1.gerarVenda();
		System.out.println("");
		venda1.gerarVenda(1345);
		System.out.println("---------------------------------");
		v1.calcularComissao();

	}

}
