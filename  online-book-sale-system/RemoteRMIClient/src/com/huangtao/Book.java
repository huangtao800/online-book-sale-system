package com.huangtao;

import java.io.Serializable;

public class Book implements Serializable{
	String name;
	double price;
	
	
	public Book(String name){
		this.name=name;
	}
}

