package com.example.progmod2;

import Model.Book;
import Model.LanguageEnum;
import Service.BookServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import Controller.Controller;

import javax.naming.ldap.Control;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackageClasses= Controller.class)
public class Progmod2Application {

	public static void main(String[] args) {
		SpringApplication.run(Progmod2Application.class, args);

		BookServiceImpl start=new BookServiceImpl();
        Book test = new Book();


		List<Book> asd= start.getBooks();



	}

}
