package com.jpaIntro.dao;

import com.jpaIntro.entity.Author;

public interface IAuthorDao {
	
	public abstract Author addAuthor(Author author);

	public abstract Author updateAuthor(Author author);

	public abstract Author deleteAuthor(Author author);

	public abstract Author getAuthorById(int aid);


}
