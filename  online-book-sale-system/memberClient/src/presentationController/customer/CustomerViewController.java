package presentationController.customer;


import java.util.ArrayList;

import bussinessLogic.controller.CustomerController;
import bussinessLogicService.CustomerBLService;
import po.BookPO;
import po.LineItemPO;
import po.CustomerPO;
import po.ResultMessage;
import presentation.CustomerView;
import presentationController.Sales.SalesViewController;
import presentationController.book.BookViewController;
import presentationController.book.BookViewService;
import vo.KeywordVO;
import vo.CustomerVO;


public class CustomerViewController implements CustomerViewService{
	
	private CustomerView customerView;
	private static CustomerViewService instance;
	private CustomerPO customerPO;
	private CustomerVO customerVO;
	private CustomerBLService memberController;
	
	private CustomerViewController(CustomerPO customerPO){

		this.customerPO=customerPO;
		this.customerVO=new CustomerVO(customerPO);
		
		CustomerController.setMember(customerPO);
		this.memberController=CustomerController.getInstance();
		customerView=new CustomerView(this,customerVO,customerPO);
		customerView.setVisible(true);
	}
	

	@Override
	public void searchKeyword(KeywordVO keywordVO) {
		// TODO Auto-generated method stub
		BookViewService bookViewController=new BookViewController(keywordVO, null);
	}

	public static CustomerViewService getInstance(CustomerPO customerPO){
		
		instance=new CustomerViewController(customerPO);
		
		return instance;
		
	}

	@Override
	public void searchType(String type) {
		// TODO Auto-generated method stub
		 BookViewService bookViewController=new BookViewController(null, type);
	}
	
	public void setViewVisible(){
		customerView.setVisible(true);
	}

	@Override
	public ResultMessage removeFavority(int selectedRow) {
		// TODO Auto-generated method stub
		BookPO bookPO=customerPO.getFavority().getFavorities().get(selectedRow);
		return memberController.removeFavorities(bookPO);
	}

	@Override
	public ResultMessage changeName(String newName) {
		// TODO Auto-generated method stub
		return memberController.changeName(newName);
	}

	@Override
	public boolean checkPassword(String password) {
		// TODO Auto-generated method stub
		return this.customerPO.getUserPassword().equals(password);
	}

	@Override
	public ResultMessage changePassword(String password) {
		// TODO Auto-generated method stub
		return memberController.changePassword(password);
	}

	@Override
	public ResultMessage putInCart(int selectedRow,int number) {
		// TODO Auto-generated method stub
		BookPO bookPO=customerPO.getFavority().getFavorities().get(selectedRow);
//		LineItemPO lineItemPO=new LineItemPO(bookPO, number);
		return memberController.putInCart(bookPO,number);
	}

	@Override
	public void enterCart() {
		// TODO Auto-generated method stub
		SalesViewController salesViewController=SalesViewController.getInstance();
		salesViewController.initCartView();
	}

	@Override
	public ResultMessage changeAddress(String newAddress) {
		// TODO Auto-generated method stub
		return memberController.changeAddress(newAddress);
	}

	@Override
	public ResultMessage cancel(String password) {
		// TODO Auto-generated method stub
		return memberController.cancel(password);
	}

	@Override
	public CustomerPO freshMemberPO(String memberID) {
		// TODO Auto-generated method stub
		CustomerPO newMemberPO = memberController.freshMemberPO(memberID);
		this.customerPO=newMemberPO;
		this.customerVO=new CustomerVO(newMemberPO);
		
		freshMemberVO();
		return newMemberPO;
	}

	public void changeToAnotherUser(){
		customerView.setVisible(false);
		customerView.dispose();
	}
	
	@Override
	public ArrayList<String> getBookType() {
		// TODO Auto-generated method stub
		return memberController.getBookType();
	}

	private void freshMemberVO() {
		// TODO Auto-generated method stub
		customerView.setMemberVO(new CustomerVO(customerPO));
	}


	@Override
	public void setOnFalse() {
		// TODO Auto-generated method stub
		memberController.setOnFalse();
	}
	
}
