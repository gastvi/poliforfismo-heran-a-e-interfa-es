
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return 0;
	}

}