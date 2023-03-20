
public class Adiministrador extends Funcionario implements AutenticandoFuncionario {

	private Autenticador autenticacao;
	
	public Adiministrador () {
		this.autenticacao = new Autenticador();
	}

	public double getBonificacao() {
		return super.getSalario() + 50;
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
