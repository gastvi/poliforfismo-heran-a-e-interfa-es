
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		valor += 0.20;
		return super.saca(valor);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
