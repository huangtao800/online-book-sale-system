//»ÆÌÎ
package presentation;

import javax.swing.JFrame;

import po.CouponPO;
import bussinessLogic.controller.*;
import bussinessLogic.domain.MemberManager;
import bussinessLogicService.*;

public class MemberView extends JFrame{

	MemberManagerBLService memberBL=new MemberManagerBLService_Stub(new MemberManager());
	
	
	public MemberView(){
	}
	
	
	
	public void start(){
		memberBL.addCoupon(new CouponPO());
	}
	
	public static void main(String[] args){
		new MemberView().start();
	}
	
	private void initComponents(){
		
	}
}
