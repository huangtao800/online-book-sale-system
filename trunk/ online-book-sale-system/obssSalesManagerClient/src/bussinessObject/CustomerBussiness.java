package bussinessObject;

import po.BookPO;
import po.CustomerPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;

public class CustomerBussiness {
	private CustomerPO customerPO;
	
	public CustomerBussiness(CustomerPO po){
		setMemberPO(po);
	}

	public ResultMessage addFavority(BookPO bookPO){
		if(isFavorityFull()){
			return ResultMessage.FULL;
		}else {
			customerPO.getFavority().addBook(bookPO);
			return ResultMessage.SUCCEED;
		}
	}
	
	public ResultMessage removeFavority(BookPO bookPO){
		if(isFavorityEmpty()){
			return ResultMessage.EMPTY;
		}
		
		return customerPO.getFavority().removeBook(bookPO);
	}
	
	public boolean checkIsOrderSigned(){
		for(int i=0;i<customerPO.getOrderList().size();i++){
			if(customerPO.getOrderList().get(i).getOrderState()!=OrderState.SIGNED){
				return false;
			}
		}
		
		return true;
	}
	
	public void addOrder(OrderPO order){
		customerPO.getOrderList().add(order);
	}
	
	public CustomerPO getMemberPO() {
		return customerPO;
	}

	public void setMemberPO(CustomerPO customerPO) {
		this.customerPO = customerPO;
	}
	
	private boolean isFavorityFull(){
		return customerPO.getFavority().judgeFull();
	}
	
	private boolean isFavorityEmpty(){
		return customerPO.getFavority().isEmpty();
	}
}
