//����
package bussinessLogic.domain;

import po.*;

public class Member {
	private MemberPO memberPO;

	public Member(MemberPO memberPO) {
		this.memberPO = memberPO;
	}

	public ResultMessage addFavorities() {
		return ResultMessage.SUCCEED;
	}

	public ResultMessage addEquivalent(String id) {
		return ResultMessage.SUCCEED;
	}

	// �޸Ķ���״̬
	// Ŀǰ��ȱ��״̬��������
	/*�����á��������Ҿ��ã���ȻsetOrderState��order�Ĺ��ܣ�����Ҫ�޸�ʱ��
	   ֻ�õ���order��setOrderState�����͹���,member�಻���ṩ�������   */
	public ResultMessage setOrderState(OrderPO orderPO) {
		return ResultMessage.SUCCEED;
	}
}
