package presentationController.Member;


import java.util.ArrayList;

import bussinessLogic.controller.MemberController;
import bussinessLogicService.MemberBLService;
import po.BookPO;
import po.LineItemPO;
import po.MemberPO;
import po.ResultMessage;
import presentation.MemberView;
import presentationController.Sales.SalesViewController;
import presentationController.book.BookViewController;
import presentationController.book.BookViewService;


public class MemberViewController implements MemberViewService{
	
	private MemberView memberView;
	private static MemberViewService instance;
	private MemberPO memberPO;
	private MemberBLService memberController;
	
	private MemberViewController(MemberPO memberPO){

		this.memberPO=memberPO;
		
		MemberController.setMember(memberPO);
		this.memberController=MemberController.getInstance();
		memberView=new MemberView(this,memberPO);
		memberView.setVisible(true);
	}

	@Override
	public void searchKeyword(KeywordVO keywordVO) {
		// TODO Auto-generated method stub
		BookViewService bookViewController=new BookViewController(keywordVO, null);
	}

	public static MemberViewService getInstance(MemberPO memberPO){
		if(instance==null){
			instance=new MemberViewController(memberPO);
		}
		
		return instance;
	}

	@Override
	public void searchType(String type) {
		// TODO Auto-generated method stub
		 BookViewService bookViewController=new BookViewController(null, type);
	}
	
	public void setViewVisible(){
		memberView.setVisible(true);
	}

	@Override
	public ResultMessage removeFavority(BookPO bookPO) {
		// TODO Auto-generated method stub
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
		return this.memberPO.getUserPassword().equals(password);
	}

	@Override
	public ResultMessage changePassword(String password) {
		// TODO Auto-generated method stub
		return memberController.changePassword(password);
	}

	@Override
	public ResultMessage putInCart(BookPO bookPO,int number) {
		// TODO Auto-generated method stub
		LineItemPO lineItemPO=new LineItemPO(bookPO, number);
		return memberController.putInCart(lineItemPO);
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
	public MemberPO freshMemberPO(String memberID) {
		// TODO Auto-generated method stub
		return memberController.freshMemberPO(memberID);
	}

	@Override
	public ArrayList<String> getBookType() {
		// TODO Auto-generated method stub
		return memberController.getBookType();
	}
	
}
