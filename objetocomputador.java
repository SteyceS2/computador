package computador;

public class objetocomputador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computador computador = new computador();

		computador.setModelo("pc");
		computador.setMarca("samsung");
		computador.setTeclado("preto");
		computador.setCor("Preto");
		System.out.println("----- Computador -----");
		System.out.println("Modelo: " + computador.getModelo());
		System.out.println("Marca: " + computador.getMarca());
		System.out.println("Teclado: " + computador.getTeclado());
		System.out.println("Cor: " + computador.getCor());
		System.out.println(computador.ligar());
	}
		

	


	}


