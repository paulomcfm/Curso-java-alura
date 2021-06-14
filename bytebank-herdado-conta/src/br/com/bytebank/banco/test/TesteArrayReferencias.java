package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(222, 111);
		referencias[1] = cp2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		Object referenciaGenerica = referencias[1];
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		//System.out.println(referencias[1].getNumero());
		System.out.println(cp2.getNumero());
		System.out.println(ref.getNumero());
	}

}
