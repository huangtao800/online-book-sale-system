//»ÆÌÎ
package presentation;

import po.CouponPO;
import bussinessLogic.controller.*;
import bussinessLogicService.*;

public class MemberView {

	MemberManagerBLService memberBL=new MemberManagerBLService_Stub();
	public void start(){
		memberBL.addCoupon(new CouponPO());
	}
	
	public static void main(String[] args){
		new MemberView().start();
	}
}
