package po;
//董仁广
public class PromotionPO implements PO{

	private double exchangeOfScore;//消费额与积分的兑换比例
	private int valueOfCoupons;//等价券的额度
	private double proportionOfCoupons;//等价券的最大使用比例
	private double discount;//打折券的打折率
	
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
