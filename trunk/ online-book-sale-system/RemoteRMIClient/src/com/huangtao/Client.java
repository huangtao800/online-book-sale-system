package com.huangtao;

import java.rmi.*;

public class Client {
	ServerRemote server;
	Book book;
	
	public Client(ServerRemote server){
		this.server=server;
	}
	
	public Book getBookFromServer(){
		try {
			book=server.getBook();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			return book;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerRemote server=(ServerRemote)Naming.lookup("rmi://127.0.0.1/Remote");
			Client client=new Client(server);
			Book book=client.getBookFromServer();
			System.out.println(book.name);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
