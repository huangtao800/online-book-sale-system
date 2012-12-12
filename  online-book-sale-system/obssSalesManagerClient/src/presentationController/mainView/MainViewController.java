package presentationController.mainView;

import java.util.ArrayList;

import bussinessLogic.controller.BookController;
import bussinessLogic.controller.MemberController;
import bussinessLogic.controller.PresentController;
import bussinessLogicService.BookBLService;
import bussinessLogicService.MemberBLService;
import bussinessLogicService.PresentBLService;

import po.BookPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.PresentPO;
import po.ResultMessage;
import po.UserPO;
import presentation.MainView;


import Model.SalesManagerModelInterface;

public class MainViewController implements MainViewControllerInterface{
//    SalesManagerModelInterface model;
    MainView mainView;
    ArrayList<PresentPO> presentPOList;
    private PresentBLService presenController=PresentController.getInstance();
    private BookBLService bookController=BookController.getInstance();
    private MemberBLService memberController=MemberController.getInstance();
    private UserPO userPO;
    
    
    public MainViewController(UserPO userPO){
    	this.userPO=userPO;
    	mainView=new MainView(this);
    	mainView.createMainView();
    }
    
//从数据层获取礼券赠送信息列表
    public ArrayList<PresentPO> getPresentPOList(){
    	this.presentPOList=presenController.getPresentPOList();
    	return presentPOList;
    }

//礼券总送命令
    public ResultMessage sendPresent(){
    	return  presenController.sendPresent();
    }
    
//添加图书
    public ResultMessage addBook(BookPO bookPO){
    	return bookController.addBook(bookPO);
    }
    
//删除图书 
    public ResultMessage deleteBook(String s){
    	return bookController.deleteBook(s);
    }

    //修改图书时，先检查是否存在此书
    public int indexOfBook(String s){
    	return bookController.indexOfBook(s);
    }
    
  //修改图书时，返回原图书信息
    public BookPO getBookPO(String s){
    	return bookController.getBookPO(s);
    }

    // //传入顾客ID，获取此顾客对象
    public MemberPO getMemberPO(String s){
    	return memberController.getMemberPO(s);
    }
    
    ////取得未完成的订单列表
    public ArrayList<OrderPO> getUncompletedOrderPOList(){
    	return model.getUncompletedOrderPOList();
    }
    
    //修改某订单后，修该UncompletedOrderPOList
    public void writeUncompletedOrderPOList(){
    	model.writeUncompletedOrderPOList();
    }
    
    //修改某订单后，相应修改其顾客的订单信息
    public void updateMember_Order(String memberID,OrderState state,long orderNum){
    	model.updateMember_Order(memberID, state, orderNum);
    }
}
