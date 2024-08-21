package computador;

public class objetofornecedor {

	public static void main(String[] args) {
		fornecedor fornecedor1 = new fornecedor();
		fornecedor1.setId(1);
		fornecedor1.setRazaoSocial("Gabyson");
		fornecedor1.setNomefantasia("TSteyce");
		fornecedor1.setCnpj("13.576.234/00091-90");
		fornecedor1.setEndereço("Av. Paulista, 1000 - São Paulo, SP");
		fornecedor1.setFone("(11) 000000000");
		fornecedor1.setEmail("stece@gmail.com.br");
		fornecedor1.setInscricaoEstadual("123.456.789.123");
		System.out.println("ID: " + fornecedor1.getId());
		System.out.println("Razão Social: " + fornecedor1.getRazaoSocial());
		System.out.println("Nome Fantasia: " + fornecedor1.getNomeFantasia());
		System.out.println("CNPJ: " + fornecedor1.getCnpj());
		System.out.println("Endereço: " + fornecedor1.getEndereço());
		System.out.println("Telefone: " + fornecedor1.getFone());
		System.out.println("Email: " + fornecedor1.getEmail());
		System.out.println("Inscrição Estadual: " + fornecedor1.getInscricaoEstadual());
		}
		}
