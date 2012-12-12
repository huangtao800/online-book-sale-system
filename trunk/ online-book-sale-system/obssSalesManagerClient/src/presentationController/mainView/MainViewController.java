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
    
//�����ݲ��ȡ��ȯ������Ϣ�б�
    public ArrayList<PresentPO> getPresentPOList(){
    	this.presentPOList=presenController.getPresentPOList();
    	return presentPOList;
    }

//��ȯ��������
    public ResultMessage sendPresent(){
    	return  presenController.sendPresent();
    }
    
//���ͼ��
    public ResultMessage addBook(BookPO bookPO){
    	return bookController.addBook(bookPO);
    }
    
//ɾ��ͼ�� 
    public ResultMessage deleteBook(String s){
    	return bookController.deleteBook(s);
    }

    //�޸�ͼ��ʱ���ȼ���Ƿ���ڴ���
    public int indexOfBook(String s){
    	return bookController.indexOfBook(s);
    }
    
  //�޸�ͼ��ʱ������ԭͼ����Ϣ
    public BookPO getBookPO(String s){
    	return bookController.getBookPO(s);
    }

    // //����˿�ID����ȡ�˹˿Ͷ���
    public MemberPO getMemberPO(String s){
    	return memberController.getMemberPO(s);
    }
    
    ////ȡ��δ��ɵĶ����б�
    public ArrayList<OrderPO> getUncompletedOrderPOList(){
    	return model.getUncompletedOrderPOList();
    }
    
    //�޸�ĳ�������޸�UncompletedOrderPOList
    public void writeUncompletedOrderPOList(){
    	model.writeUncompletedOrderPOList();
    }
    
    //�޸�ĳ��������Ӧ�޸���˿͵Ķ�����Ϣ
    public void updateMember_Order(String memberID,OrderState state,long orderNum){
    	model.updateMember_Order(memberID, state, orderNum);
    }
}
