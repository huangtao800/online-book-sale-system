package vo;

import java.util.Calendar;

import po.EquivalentPO;

public class EquivalentVO {
	public long id;
	public double deno;// ���
	public double min;// ʹ�ø����ĵȼ�ȯ������������
	public String endDate;

	public EquivalentVO(EquivalentPO equivalentPO) {
		id = equivalentPO.getID();
		deno = equivalentPO.getDeno();
		min = equivalentPO.getMin();

		Calendar calendar = equivalentPO.getEndDate();
		endDate = calendar.get(Calendar.YEAR) + "��"
				+ (1 + calendar.get(Calendar.MONTH)) + "��"
				+ calendar.get(Calendar.DAY_OF_MONTH) + "��";
	}
}
