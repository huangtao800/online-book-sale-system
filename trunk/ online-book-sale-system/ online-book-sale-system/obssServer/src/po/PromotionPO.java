package po;
import java.util.ArrayList;

//���ʹ�
public class PromotionPO implements PO{
//	private static final int line=10;//������Ĭ����ʮ�й��ڵȼ�ȯ����Ϣ
//	private static final int column=2;//��һ�б�ʾ�ȼ�ȯ��ȣ��ڶ��б�ʾ�ȼ�ȯ���������

	private double exchangeOfScore;//���Ѷ�����ֵĶһ�����
	//private double[][] equivalent=new double [line][column];//��ά���飬��һ�б�ʾ�ȼ�ȯ��ȣ�
	                                                                                                         //�ڶ��б�ʾʹ�øõȼ�ȯ���������
	//private double discount;//����ȯ�Ĵ�����
		
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
