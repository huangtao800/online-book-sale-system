//����
package bussinessLogic.domain;

import po.*;

public class Member {
	private MemberPO memberPO;

	public Member(MemberPO memberPO) {
		this.memberPO = memberPO;
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
