package po;
//���ʹ�
public class PromotionPO implements PO{

	private double exchangeOfScore;//���Ѷ�����ֵĶһ�����
	private int valueOfCoupons;//�ȼ�ȯ�Ķ��
	private double proportionOfCoupons;//�ȼ�ȯ�����ʹ�ñ���
	private double discount;//����ȯ�Ĵ�����
	
	public double getExchangeOfScore(){
		return exchangeOfScore;
	}
	public void setExchangeOfScore(int e){
		this.exchangeOfScore=e;
	}
	
	public int getValueOfCoupons(){
		return valueOfCoupons;
	}
	public void setValueOfCoupons(int v){
		this.valueOfCoupons=v;
	}
	
	public double getProportionOfCoupons(){
		return proportionOfCoupons;
	}
	public void setProportionOfCoupons(double p){
		this.proportionOfCoupons=p;
	}
	
	public double getDiscount(){
		return discount;
	}
	public void setDiscount(double d){
		this.discount=d;
	}
	
}
