package aulas_abstracao_interfaces;

public class Cliente implements Autenticavel {
	private String usuario;
	private String senha;
	
	public Cliente() {
		this.usuario = "sara";
		this.senha = "@123";
	}

	@Override
	public String login(String usuario, String senha) {
		if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
            return "Cliente logado com sucesso!";
        } else {
            return "Falha no login do Cliente.";
        }

	}

	@Override
	public void logout() {
        System.out.println("Cliente saiu.");

	}

}
