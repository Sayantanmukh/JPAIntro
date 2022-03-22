package com.jpaIntro.dao;

import javax.persistence.EntityManager;

import com.jpaIntro.entity.Author;




public class AuthorDao implements IAuthorDao{
	
	private EntityManager entityManager;

	public AuthorDao() {
		entityManager = JpaUtil.getEntityManager();
	}

	@Override
	public Author addAuthor(Author author) {
		entityManager.getTransaction().begin();
		entityManager.persist(author);
		entityManager.getTransaction().commit();
		return author;
	}

	@Override
	public Author updateAuthor(Author author) {
		//return entityManager.merge(author);
		
		entityManager.getTransaction().begin();
		Author t= entityManager.merge(author);
		entityManager.getTransaction().commit();
		return t;
		
	}

	@Override
	public Author deleteAuthor(Author auth) {
		entityManager.getTransaction().begin();
		Author temp = entityManager.find(Author.class, auth.getAuthorId());
		entityManager.remove(temp);
		entityManager.getTransaction().commit();
		return auth;
	}

	@Override
	public Author getAuthorById(int aid) {
		entityManager.getTransaction().begin();
		Author aut = entityManager.find(Author.class, aid);
		entityManager.getTransaction().commit();
		return aut;
	}

}
