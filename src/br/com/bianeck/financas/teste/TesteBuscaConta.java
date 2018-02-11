package br.com.bianeck.financas.teste;

import javax.persistence.EntityManager;

import br.com.bianeck.financas.modelo.Conta;
import br.com.bianeck.financas.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {
		
		boolean buscaMySql = false;
		EntityManager em;
		
		if (buscaMySql) {
			em = new JPAUtil().geEntityManagerMySql();
			System.out.println("Gravando em MySQL");
		}else {
			em = new JPAUtil().geEntityManagerPostgres();
			System.out.println("Gravando em PostgreSql");
		}
		
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class, 1);
		
		conta.setTitular("João Gumercindo");
		
		System.out.println(conta.getTitular());
		
		
		em.getTransaction().commit();
		
		
		
	}
}
