package po;

import java.util.Calendar;

import javax.tools.Diagnostic;

public class PresentPO implements PO {
	public static final int line = 10;
	public static final int column4 = 4;
	private VIPRank vipLevel;// ��Ա�ȼ�

	private String equivalent[][] = new String[line][column4];// 10��,ÿ��ֱ��ʾ:�ȼ�ȯ��ȣ���������Ч��ֹ���ڣ��������
	/*
	 * ���������硰YYYY-MM-DD����String�����ַ������硰2013-01-20��
	 */
	private int amountOfCoupon;// ����ȯ����
	private double discount;// ����ȯ�Ĵ�����
	private String endDateOfCoupon;// ����ȯ����Ч��ֹ���ڣ��͹�����ȯ�������ã�

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
