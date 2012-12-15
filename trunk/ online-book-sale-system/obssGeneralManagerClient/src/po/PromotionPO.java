package po;
import java.util.ArrayList;

//董仁广
public class PromotionPO implements PO{
//	private static final int line=10;//界面上默认有十行关于等价券的信息
//	private static final int column=2;//第一列表示等价券额度，第二列表示等价券的最低消费

	private double exchangeOfScore;//消费额与积分的兑换比例
	//private double[][] equivalent=new double [line][column];//二维数组，第一列表示等价券额度，
	                                                                                                         //第二列表示使用该等价券的最低消费
	//private double discount;//打折券的打折率
		
	private ArrayList<ArrayList<Double>> equivalentList;
	private ArrayList<Double> couponRateList;
	
	public PromotionPO(){
		
	}
	
	public PromotionPO(double ex,ArrayList<ArrayList<Double>> equivalentList,ArrayList<Double> couponRateList){
		this.exchangeOfScore=ex;
		this.equivalentList=equivalentList;
		this.couponRateList=couponRateList;		
	}
	
	public double getExchangeOfScore(){
		return exchangeOfScore;
	}
	public void setExchangeOfScore(double e){
		this.exchangeOfScore=e;
	}
	
	public ArrayList<ArrayList<Double>> getEquivalentList(){
		return equivalentList;
	}
	public void setEquivalentList(ArrayList<ArrayList<Double>> equivalentList){
		this.equivalentList=equivalentList;
	}
	
	public ArrayList<Double> getCouponrateList(){
		return couponRateList;
	}
	public void setCouponList(ArrayList<Double> couponRateList){
		this.couponRateList=couponRateList;
	}

	
}
