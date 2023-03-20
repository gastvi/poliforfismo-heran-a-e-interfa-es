
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente gabriel = new Gerente();
		gabriel.setCpf("222222222-22");
		gabriel.setNome("gabriel");
		gabriel.setSalario(5000.00);
		
		System.out.println(gabriel.getNome());
		System.out.println(gabriel.getBonificacao());
		
		gabriel.setSalario(300);
	}
}
