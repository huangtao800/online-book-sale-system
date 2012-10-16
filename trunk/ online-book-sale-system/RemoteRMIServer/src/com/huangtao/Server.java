package com.huangtao;
import java.io.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements ServerRemote{
	
	public Server() throws RemoteException{
	}
	
	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return new Book("Java");
	}
	
	public static void main(String[] args){
		try {
			ServerRemote server=new Server();
			Naming.rebind("Remote", server);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
