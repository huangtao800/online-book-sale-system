package vo;

import java.util.Calendar;

import po.EquivalentPO;

public class EquivalentVO {
	public long id;
	public double deno;// 面额
	public double min;// 使用该面额的等价券所需的最低消费
	public String endDate;

	public EquivalentVO(EquivalentPO equivalentPO) {
		id = equivalentPO.getID();
		deno = equivalentPO.getDeno();
		min = equivalentPO.getMin();

		Calendar calendar = equivalentPO.getEndDate();
		endDate = calendar.get(Calendar.YEAR) + "年"
				+ (1 + calendar.get(Calendar.MONTH)) + "月"
				+ calendar.get(Calendar.DAY_OF_MONTH) + "日";
	}
}
