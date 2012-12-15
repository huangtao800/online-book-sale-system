package databaseService.present;

import java.rmi.RemoteException;
import java.util.ArrayList;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface PresentDatabaseService extends DatabaseService{
	public ArrayList<Present_Equivalent> getEquivalentList() throws RemoteException;
	public ArrayList<Present_Coupon>     getCouponList() throws RemoteException;
	public ResultMessage writePresnet_Equivalent(Present_Equivalent present_equivalent) throws RemoteException;
	public ResultMessage writePresent_Coupon(Present_Coupon present_coupon) throws RemoteException;
	public ResultMessage sendPresent() throws RemoteException;
}
