//����
package bussinessLogic.domain;

import java.util.ArrayList;

import po.*;


public class Member {
//	private MemberPO memberPO;

	public Member() {
//		this.memberPO = memberPO;
	}

	public ResultMessage addFavorities(BookPO bookPO,String memberID){
		
		return null;
	}
	
	
	public ResultMessage addFavorities(String id){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage removeFavorities(String id){
		return ResultMessage.SUCCEED;
	}
	
	
	
	public ResultMessage register(String name,String password){
		return ResultMessage.SUCCEED;
	}
	
	
	public ResultMessage cancel(String id,String password){
		return ResultMessage.SUCCEED;
	}
	
	//���س��еĴ���ȯ�б�
	public ArrayList<CouponPO> getCouponList(){
		return null;
	}
	
	//���س��еĵȼ�ȯ�б�
	public ArrayList<EquivalentPO> getEquivalentList(){
		return null;
	}
	
	//����һ��������¼
	public ResultMessage addOrder(OrderPO order){
		return ResultMessage.SUCCEED;
	}
	
	//�޸Ķ���״̬
	//Ŀǰ��ȱ��״̬�࣡������



	// �޸Ķ���״̬
	// Ŀǰ��ȱ��״̬��������
	/*�����á��������Ҿ��ã���ȻsetOrderState��order�Ĺ��ܣ�����Ҫ�޸�ʱ��
	   ֻ�õ���order��setOrderState�����͹���,member�಻���ṩ�������   */
//	public ResultMessage setOrderState(OrderPO orderPO) {
//>>>>>>> .r132
//		return ResultMessage.SUCCEED;
//	}
}
