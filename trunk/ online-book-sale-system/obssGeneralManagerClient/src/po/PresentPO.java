package po;

import java.util.Calendar;

import javax.tools.Diagnostic;

public class PresentPO implements PO {
	public static final int line = 10;
	public static final int column4 = 4;
	private VIPRank vipLevel;// 会员等级

	private String equivalent[][] = new String[line][column4];// 10组,每组分别表示:等价券额度，张数，有效截止日期，最低消费
	/*
	 * 日期是形如“YYYY-MM-DD”的String类型字符串，如“2013-01-20”
	 */
	private int amountOfCoupon;// 打折券数量
	private double discount;// 打折券的打折率
	private String endDateOfCoupon;// 打折券的有效截止日期（送过后，礼券立即可用）

	public PresentPO() {
		for (int i = 0; i < line; i++)
			for (int j = 0; j < column4; j++)
				equivalent[i][j] = "0.0";
	}

	public VIPRank getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(VIPRank vip) {
		this.vipLevel = vip;
	}

	public String getVipLevel_String() {
		if (this.vipLevel == VIPRank.VIP1)
			return "VIP1";
		else if (this.vipLevel == VIPRank.VIP2)
			return "VIP2";
		else if (this.vipLevel == VIPRank.VIP3)
			return "VIP3";
		else if (this.vipLevel == VIPRank.VIP4)
			return "VIP4";
		else
			return "VIP5";
	}

	public String[][] getEquivalent() {
		return equivalent;
	}

	public void setEquivalent(String ob, int cow, int column) {// unused
		equivalent[cow][column] = ob;
	}

	public int getAmountOfCoupon() {
		return amountOfCoupon;
	}

	public void setAmountOfCoupon(int amount) {
		this.amountOfCoupon = amount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getEndDateOfCoupon() {
		return endDateOfCoupon;
	}

	public void setEndDateOfCoupon(String endDate) {
		this.endDateOfCoupon = endDate;
	}

}
