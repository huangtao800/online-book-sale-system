package bussinessLogic.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.Present_Coupon;
import po.Present_Equivalent;
import po.ResultMessage;
import bussinessLogic.domain.Present;

import bussinessLogicService.PresentBLService;

public class PresentController implements PresentBLService{
	
    private static PresentBLService controller;
    private static Present present=new Present();
    
    private PresentController(){

    }
    
	public static PresentBLService getInstance(){//µ¥¼üÄ£Ê½
		if(controller==null){
			controller=new PresentController();
		}
		return controller;
	}

	public ArrayList<Present_Equivalent> getPresent_EquivalentList() {
		return present.getPresent_EquivalentList();
	}
	
	public ArrayList<Present_Coupon>     getPresent_CouponList() {
		return present.getPresent_CouponList();
	}
	
	public ResultMessage sendPresent(){
		return present.sendPresent();	
	}

}
