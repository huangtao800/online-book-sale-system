package vo;

import java.util.ArrayList;

import po.MemberPO;
import presentationController.Sales.OrderVO;

public class MemberVO {
	public String userID;
	public String userName;
	public String userPassword;
	public String address;
	public String rank;
	public ArrayList<NewOrderVO> orderVOList=new ArrayList<NewOrderVO>();
	public FavorityVO favorityVO;
	public ArrayList<CouponVO> couponVOList=new ArrayList<CouponVO>();
	public ArrayList<EquivalentVO> equivalentVOList=new ArrayList<EquivalentVO>();
	public int points;
	
	public MemberVO(MemberPO memberPO){
		userID=memberPO.getUserID();
		userName=memberPO.getUserName();
		userPassword=memberPO.getUserPassword();
		address=memberPO.getAddress();
		rank=memberPO.getRank().toString();
		
		initOrderVOList(memberPO);
		favorityVO=new FavorityVO(memberPO.getFavority());
		initCouponVOList(memberPO);
		initEquivalentVOList(memberPO);
		
		points=memberPO.getPoints();
	}
	
	private void initOrderVOList(MemberPO memberPO){
		for(int i=0;i<memberPO.getOrderList().size();i++){
			NewOrderVO orderVO=new NewOrderVO(memberPO.getOrderList().get(i));
			orderVOList.add(orderVO);
		}
	}
	
	private void initCouponVOList(MemberPO memberPO){
		for(int i=0;i<memberPO.getCouponList().size();i++){
			CouponVO couponVO=new CouponVO(memberPO.getCouponList().get(i));
			couponVOList.add(couponVO);
		}
	}
	
	private void initEquivalentVOList(MemberPO memberPO){
		for(int i=0;i<memberPO.getEquivalentList().size();i++){
			EquivalentVO equivalentVO=new EquivalentVO(memberPO.getEquivalentList().get(i));
			equivalentVOList.add(equivalentVO);
		}
	}
}
