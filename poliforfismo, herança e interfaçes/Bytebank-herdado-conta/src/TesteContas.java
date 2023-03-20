
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.depositar(100);

		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.depositar(200);

		cc.transferir(10.0, cp);
		
		System.out.println("o saldo atual da conta cc e:"+cc.getSaldo());
		System.out.println("o saldo atual da conta cp e:"+cp.getSaldo());
	}

}
