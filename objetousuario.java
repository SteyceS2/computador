package computador;

import classe.cliente;

public class objetousuario {

	public static void main(String[] args) {
		usuario usuario11 = new usuario ();
	
		
		
		
		usuario11.setId(6540);
		usuario11.setNome("Marcus");
		usuario11.setPassword("21988402289");
		usuario11.setPermissao("permitido");
		usuario11.setUsuario("marcus.l");
		
	
		
		
		System.out.println("----- usuario-----");
		System.out.println("ID: " + usuario11.getId());
		System.out.println("NOME: "+ usuario11.getNome());
		System.out.println("PASSWORD: " + usuario11.getPassword());
		System.out.println("PERMISSAO: " + usuario11.getPermissao());
		System.out.println("USUARIO: " + usuario11.getUsuario());
	
		System.out.println(usuario11.entrar());
		
	
		}

	private static void setId(int i) {
		// TODO Auto-generated method stub
		
	}
		


	



	}


