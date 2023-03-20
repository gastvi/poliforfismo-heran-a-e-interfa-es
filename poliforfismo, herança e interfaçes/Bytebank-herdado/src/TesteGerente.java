
public class TesteGerente {
	
	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setCpf("111222333-44");
		g1.setNome("Marco");
		g1.setSalario(5000.00);
		g1.setSenha(2222);
		
		System.out.println(g1.getSalario());
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		
		boolean autenticou = g1.autenticacao(2222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
