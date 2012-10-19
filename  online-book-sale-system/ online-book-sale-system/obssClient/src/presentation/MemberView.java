//»ÆÌÎ
package presentation;

import po.CouponPO;
import bussinessLogic.controller.*;
import bussinessLogicService.MemberBLService;

public class MemberView {

	MemberBLService memberBL=new MemberBLService_Stub("111111", "huangtao");
	public void start(){
		memberBL.addCoupon(new CouponPO());
		memberBL.addFavorities("111111");
	}
	
	public static void main(String[] args){
		new MemberView().start();
	}
}
