
public class Cliente implements AutenticandoFuncionario{

	private Autenticador autenticacao;
	
	public Cliente() {
		this.autenticacao = new Autenticador();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticacao.setSenha(senha);
	}
	
	@Override
	public boolean autenticacao(int senha) {
		return this.autenticacao.autenticacao(senha);
	}

}
