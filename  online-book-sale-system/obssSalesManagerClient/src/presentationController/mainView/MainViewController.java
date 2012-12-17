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
    
//�����ݲ��ȡ��ȯ������Ϣ�б�
    public ArrayList<Present_Equivalent> getPresent_EquivalentList(){
    	this.present_EquivalentList=presentController.getPresent_EquivalentList();
    	return present_EquivalentList;
    }
    public ArrayList<Present_Coupon> getPresent_CouponList(){
    	this.present_CouponList=presentController.getPresent_CouponList();
    	return present_CouponList;
    }

//��ȯ��������
    public ResultMessage sendPresent(){
    	return  presentController.sendPresent();
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
		return bookController.changeBookType(type, "����");
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
