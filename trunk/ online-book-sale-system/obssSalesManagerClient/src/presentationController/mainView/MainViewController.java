package presentationController.mainView;

import java.util.ArrayList;

import bussinessLogic.controller.BookController;
import bussinessLogic.controller.PresentController;
import bussinessLogic.controller.SalesManagerController;
import bussinessLogicService.BookBLService;
import bussinessLogicService.PresentBLService;
import bussinessLogicService.SalesManagerService;
import po.BookPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.ResultMessage;
import po.SalesManagerPO;
import presentation.MainView;


public class MainViewController implements MainViewControllerInterface{
//    SalesManagerModelInterface model;
    MainView mainView;
    ArrayList<Present_Equivalent> present_EquivalentList;
    ArrayList<Present_Coupon> present_CouponList;
    
    private PresentBLService presentController=PresentController.getInstance();
    private BookBLService bookController=BookController.getInstance();
    private SalesManagerService salesManagerController=SalesManagerController.getInstance();
   

    private SalesManagerPO userPO;
    
    
    public MainViewController(SalesManagerPO userPO){
    	this.userPO=userPO;
    	mainView=new MainView(this);
    	mainView.createMainView();
    }
    
//从数据层获取礼券赠送信息列表
    public ArrayList<Present_Equivalent> getPresent_EquivalentList(){
    	this.present_EquivalentList=presentController.getPresent_EquivalentList();
    	return present_EquivalentList;
    }
    public ArrayList<Present_Coupon> getPresent_CouponList(){
    	this.present_CouponList=presentController.getPresent_CouponList();
    	return present_CouponList;
    }

//礼券总送命令
    public ResultMessage sendPresent(){
    	return  presentController.sendPresent();
    }
    
//添加图书
    public ResultMessage addBook(BookPO bookPO){
    	return bookController.addBook(bookPO);
    }
    
//删除图书 
    public ResultMessage deleteBook(String s){
    	return bookController.deleteBook(s);
    }

//    //修改图书时，先检查是否存在此书
//    public int indexOfBook(String s){
//    	return bookController.indexOfBook(s);
//    }
    
  //修改图书时，返回原图书信息
    public BookPO getBookPO(String s){
    	return bookController.findByISBN(s);
    }
    
    //
    public ResultMessage changeBookPO(BookPO bookPO){
    	return bookController.modifyBook(bookPO);
    }

    // //传入顾客ID，获取此顾客对象
    public MemberPO getMemberPO(String s){
    	return salesManagerController.getMemberPO(s);
    }
    
    ////取得未完成的订单列表
    public ArrayList<OrderPO> getUncompletedOrderPOList(){
    	return salesManagerController.getOrderPOList();      //getUncompletedOrderPOList();
    }
    
    //修改某订单后，修该UncompletedOrderPOList
    public ResultMessage writeUncompletedOrderPOList(OrderPO orderPO){
    	return salesManagerController.updateOrder(orderPO);   //.writeUncompletedOrderPOList();
    	
    }
    
    //修改某订单后，相应修改其顾客的订单信息
    public ResultMessage updateMember_Order(String memberID,OrderState state,long orderNum){
    	return salesManagerController.updateMember_Order(memberID, state, orderNum);   //.updateMember_Order(memberID, state, orderNum);
    }
    
	public SalesManagerPO getUserPO(){
		return this.userPO;
	}

	@Override
	public ArrayList<String> getTypeList() {
		// TODO Auto-generated method stub
		return bookController.getBookType();
	}

	@Override
	public ResultMessage addBookType(String newType) {
		// TODO Auto-generated method stub
		return bookController.addBookType(newType);
	}

	@Override
	public ResultMessage changeBookType(String oldType, String newType) {
		// TODO Auto-generated method stub
		return bookController.changeBookType(oldType, newType);
	}

	@Override
	public ResultMessage deleteBookType(String type) {
		// TODO Auto-generated method stub
		return bookController.changeBookType(type, "其他");
	}

	@Override
	public void freshName(String name) {
		// TODO Auto-generated method stub
		mainView.freshName(name);
	}
	public void freshPassword(String newPW){
		mainView.freshPassword(newPW);
	}

}
