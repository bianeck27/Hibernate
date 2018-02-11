package br.com.bianeck.financas.teste;

import javax.persistence.EntityManager;
import br.com.bianeck.financas.modelo.Conta;
import br.com.bianeck.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {
		
		
		EntityManager em = new JPAUtil().geEntityManagerPostgres();
			
		
		Conta conta = new Conta();
		conta.setId(1);
		conta.setTitular("Danilo");
		conta.setBanco("Banco do Brasil");
		conta.setAgencia("123");
		conta.setNumero("456");
		
		//persiste em bancos
				
		em.getTransaction().begin(); //abre a transação
		
		conta = em.find(Conta.class, 1);
		em.remove(conta);
		
		conta.setBanco("Bradesco");
		
		em.getTransaction().commit();//realiza o commit
		em.close(); //fecha a EntityManager
			
	}
}
