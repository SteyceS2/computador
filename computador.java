package computador;

public class computador {
	String modelo;
	String marca;
	String teclado;
	String cor;

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTeclado() {
		return teclado;
	}
	public void setTeclado(String Teclado) {
		this.teclado = Teclado;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String ligar() {
		return "ligando";
	}
		public String ajustar() {
			return "desligando";
	}
}



