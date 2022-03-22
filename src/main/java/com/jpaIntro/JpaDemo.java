package com.jpaIntro;

import com.jpaIntro.dao.AuthorDao;
import com.jpaIntro.entity.Author;

public class JpaDemo {
	
	public static void main(String[] args) {

		/*System.out.println("Start");

		AuthorDao dao = new AuthorDao();
		Author aut = new Author(101, "Saurav","Kumar","Agarwal", "7896541231");
/*		dao.addAuthor(aut);
		Author aut1 = new Author(102, "Anusriti","Devi","Choudhuri", "7896541231");
		dao.addAuthor(aut1);
		*/
		//Author aut2 = new Author(103, "Sayantan","Kumar","Mukherjee", "1236547899");
		//dao.addAuthor(aut2);
		
		/*
		Author aut3 = new Author(103, "Sayantan","Kumar","Mukherjee", "1236547899");
		dao.updateAuthor(aut3);
		System.out.println(dao.getAuthorById(103));
		
		//System.out.println(dao.getAuthorById(102));

		System.out.println("End");*/
		
		
		System.out.println("Start");
		Author auth = new Author(103, "Saurav", "Kumar", "Barnwal", "7896541236");
		Author upauth = new Author(103, "Saurav", "Nath", "Agarwal", "1236547899");
		AuthorDao ad = new AuthorDao();
		
		Author aut1 = new Author(102, "Anusriti","Devi","Choudhuri", "7896541231");
		ad.addAuthor(aut1);
		
		Author aut2 = new Author(101, "Sayantan","Kumar","Mukherjee", "8569741236");
		ad.addAuthor(aut2);
		ad.addAuthor(auth);
		System.out.println(ad.getAuthorById(103));
		//;
		ad.updateAuthor(upauth);
		//System.out.println(ad.getAuthorId(upauth.getAuthorId()));
		System.out.println(ad.getAuthorById(103));
		ad.deleteAuthor(upauth);
		//System.out.println(ad.getAuthorId(upauth.getAuthorId()));
		System.out.println("End");
		
	}

}
