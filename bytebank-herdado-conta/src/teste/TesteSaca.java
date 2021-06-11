package teste;

public class TesteSaca {

	public static void main(String[] args) {
		
		modelo.Conta conta = new modelo.ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
		conta.saca(210.0);
		} catch(modelo.SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}

}
