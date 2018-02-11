package br.com.bianeck.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private final static String MYSQL = "financas-mysql";
	private final static String POSTGRESQL = "financas-postgresql";

	private static EntityManagerFactory emMySql = Persistence.createEntityManagerFactory(MYSQL);
	private static EntityManagerFactory emPostgres = Persistence.createEntityManagerFactory(POSTGRESQL);

	public EntityManager geEntityManagerMySql() {

		return emMySql.createEntityManager();
	}

	public EntityManager geEntityManagerPostgres() {

		return emPostgres.createEntityManager();
	}

}
