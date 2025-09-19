package aulas_abstracao_interfaces;

public class Administrador implements Autenticavel {

	private String usuario;
    private String senha;

    public Administrador() {
        this.usuario = "admin";
        this.senha = "123@";
    }
	
	@Override
	public String login(String usuario, String senha) {
		if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
            return "Administrador logado com sucesso!";
        } else {
            return "Falha no login do Administrador.";
        }

	}

	@Override
	public void logout() {
		System.out.println("Administrador saiu.");

	}

}
