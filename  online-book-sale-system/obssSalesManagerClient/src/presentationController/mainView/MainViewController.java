package presentationController.mainView;

import java.util.ArrayList;

import bussinessLogic.controller.BookController;
import bussinessLogic.controller.MemberController;
import bussinessLogic.controller.PresentController;
import bussinessLogic.controller.SalesController;
import bussinessLogic.controller.SalesManagerController;
import bussinessLogic.controller.UserController;
import bussinessLogicService.BookBLService;
import bussinessLogicService.MemberBLService;
import bussinessLogicService.PresentBLService;
import bussinessLogicService.SalesBLService;
import bussinessLogicService.SalesManagerService;
import bussinessLogicService.UserBLService;

import po.BookPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.PresentPO;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import presentation.MainView;


public class MainViewController implements MainViewControllerInterface{
//    SalesManagerModelInterface model;
    MainView mainView;
    ArrayList<PresentPO> presentPOList;
    private PresentBLService presenController=PresentController.getInstance();
    private BookBLService bookController=BookController.getInstance();
    private SalesManagerService salesManagerController=SalesManagerController.getInstance();
    private UserBLService userController=UserController.getInstance();

    private SalesManagerPO userPO;
    
    
    public MainViewController(SalesManagerPO userPO){
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

//    //�޸�ͼ��ʱ���ȼ���Ƿ���ڴ���
//    public int indexOfBook(String s){
//    	return bookController.indexOfBook(s);
//    }
    
  //�޸�ͼ��ʱ������ԭͼ����Ϣ
    public BookPO getBookPO(String s){
    	return bookController.findByISBN(s);
    }
    
    //
    public ResultMessage changeBookPO(BookPO bookPO){
    	return bookController.modifyBook(bookPO);
    }

    // //����˿�ID����ȡ�˹˿Ͷ���
    public MemberPO getMemberPO(String s){
    	return salesManagerController.getMemberPO(s);
    }
    
    ////ȡ��δ��ɵĶ����б�
    public ArrayList<OrderPO> getUncompletedOrderPOList(){
    	return salesManagerController.getOrderPOList();      //getUncompletedOrderPOList();
    }
    
    //�޸�ĳ�������޸�UncompletedOrderPOList
    public ResultMessage writeUncompletedOrderPOList(OrderPO orderPO){
    	return salesManagerController.updateOrder(orderPO);   //.writeUncompletedOrderPOList();
    	
    }
    
    //�޸�ĳ��������Ӧ�޸���˿͵Ķ�����Ϣ
    public ResultMessage updateMember_Order(String memberID,OrderState state,long orderNum){
    	return salesManagerController.updateMember_Order(memberID, state, orderNum);   //.updateMember_Order(memberID, state, orderNum);
    }
    
    public ResultMessage  changeUser(String userName, String id,String password,UserRole userRole){
    	return userController.changeUser(userName, id, password, userRole);
    }
    
	public SalesManagerPO getUserPO(){
		return this.userPO;
	}

}
