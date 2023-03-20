
public class TestaAutenticacao {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Adiministrador a = new Adiministrador();
		a.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);

		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(a);
		si.autentica(cliente);
	}

}
