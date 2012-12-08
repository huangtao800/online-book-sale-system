package bussinessObject;

import po.BookPO;
import po.FavorityPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;

public class Customer {
	private MemberPO memberPO;
	
	public Customer(MemberPO po){
		setMemberPO(po);
	}

	public ResultMessage addFavority(BookPO bookPO){
		if(isFavorityFull()){
			return ResultMessage.FULL;
		}else {
			memberPO.getFavority().addBook(bookPO);
			return ResultMessage.SUCCEED;
		}
	}
	
	public ResultMessage removeFavority(BookPO bookPO){
		if(isFavorityEmpty()){
			return ResultMessage.EMPTY;
		}
		
		return memberPO.getFavority().removeBook(bookPO);
	}
	
	public boolean checkIsOrderSigned(){
		for(int i=0;i<memberPO.getOrderList().size();i++){
			if(memberPO.getOrderList().get(i).getOrderState()!=OrderState.SIGNED){
				return false;
			}
		}
		
		return true;
	}
	
	public void addOrder(OrderPO order){
		memberPO.getOrderList().add(order);
	}
	
	public MemberPO getMemberPO() {
		return memberPO;
	}

	public void setMemberPO(MemberPO memberPO) {
		this.memberPO = memberPO;
	}
	
	private boolean isFavorityFull(){
		return memberPO.getFavority().judgeFull();
	}
	
	private boolean isFavorityEmpty(){
		return memberPO.getFavority().isEmpty();
	}
}
