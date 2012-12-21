package vo;

import java.util.ArrayList;

import po.CustomerPO;
import presentationController.Sales.OrderVO;

public class CustomerVO {
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
	
	public CustomerVO(CustomerPO customerPO){
		userID=customerPO.getUserID();
		userName=customerPO.getUserName();
		userPassword=customerPO.getUserPassword();
		address=customerPO.getAddress();
		rank=customerPO.getRank().toString();
		
		initOrderVOList(customerPO);
		favorityVO=new FavorityVO(customerPO.getFavority());
		initCouponVOList(customerPO);
		initEquivalentVOList(customerPO);
		
		points=customerPO.getPoints();
	}
	
	private void initOrderVOList(CustomerPO customerPO){
		for(int i=0;i<customerPO.getOrderList().size();i++){
			NewOrderVO orderVO=new NewOrderVO(customerPO.getOrderList().get(i));
			orderVOList.add(orderVO);
		}
	}
	
	private void initCouponVOList(CustomerPO customerPO){
		for(int i=0;i<customerPO.getCouponList().size();i++){
			CouponVO couponVO=new CouponVO(customerPO.getCouponList().get(i));
			couponVOList.add(couponVO);
		}
	}
	
	private void initEquivalentVOList(CustomerPO customerPO){
		for(int i=0;i<customerPO.getEquivalentList().size();i++){
			EquivalentVO equivalentVO=new EquivalentVO(customerPO.getEquivalentList().get(i));
			equivalentVOList.add(equivalentVO);
		}
	}
}
