import java.io.Serializable;

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		total++;
		System.out.println(total + "º conta criada");
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou crinado uma conta com a agencia:" + agencia + " e com o numero:" + numero);
	}

	public abstract void depositar(double valor);
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
}