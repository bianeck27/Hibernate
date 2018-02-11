package br.com.bianeck.financas.teste;


import javax.persistence.EntityManager;

import br.com.bianeck.financas.modelo.Cliente;
import br.com.bianeck.financas.modelo.Conta;
import br.com.bianeck.financas.util.JPAUtil;

public class TestaContaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Leandro");
		cliente.setEndereco("Rua Ciclano, 123");
		cliente.setProfissao("Professor");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Douglas");
		cliente2.setEndereco("Rua Ciclano, 234");
		cliente2.setProfissao("Professor");
		
		Conta conta = new Conta();
		conta.setId(2);
		
		cliente.setConta(conta);
		cliente2.setConta(conta);
		
		EntityManager em = new JPAUtil().geEntityManagerPostgres();
		
		em.getTransaction().begin();
		
		em.persist(cliente);
//		em.persist(cliente2);
		
		em.getTransaction().commit();
		em.close();
		
	}
	
}
