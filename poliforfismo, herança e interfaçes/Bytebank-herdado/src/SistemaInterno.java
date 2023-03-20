
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(AutenticandoFuncionario af) {
		boolean autenticou = af.autenticacao(this.senha);
		if(autenticou) {
			System.out.println("pode entrar");
		}else {
			System.out.println("nao pode entrar");
		}
	}

}
