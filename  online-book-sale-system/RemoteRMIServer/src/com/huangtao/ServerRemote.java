package com.huangtao;
import java.rmi.*;

public interface ServerRemote extends Remote{
	public Book getBook() throws RemoteException;
}
