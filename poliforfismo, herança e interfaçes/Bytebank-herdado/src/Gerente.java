
public class Gerente extends Funcionario implements AutenticandoFuncionario {

	private Autenticador autenticacao;

	public double getBonificacao() {
		return super.getSalario();
	}

	public Gerente() {
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
