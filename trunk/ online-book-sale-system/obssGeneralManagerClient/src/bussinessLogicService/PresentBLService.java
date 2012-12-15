package bussinessLogicService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.ResultMessage;

public interface PresentBLService {
	public ArrayList<Present_Equivalent> getPresent_EquivalentList();
	public ArrayList<Present_Coupon> getPresent_CouponList();
	public ResultMessage sendPresent();
	public ResultMessage writePresnet_Equivalent(Present_Equivalent present_equivalent);
	public ResultMessage writePresent_Coupon(Present_Coupon present_coupon) ;
}
