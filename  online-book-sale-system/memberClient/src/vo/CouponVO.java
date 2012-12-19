package vo;

import java.util.Calendar;

import po.CouponPO;

public class CouponVO {
	public long id;
	public double rate;
	public String date;

	public CouponVO(CouponPO couponPO) {
		id = couponPO.getID();
		rate = couponPO.getRate();
		Calendar calendar = couponPO.getEndDate();
		date = calendar.get(Calendar.YEAR) + "Äê"
				+ (1 + calendar.get(Calendar.MONTH)) + "ÔÂ"
				+ calendar.get(Calendar.DAY_OF_MONTH) + "ÈÕ";
	}
}
