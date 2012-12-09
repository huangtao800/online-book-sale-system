package po;

//���ʹ�
public class PromotionPO implements PO{
	private static final int line=10;//������Ĭ����ʮ�й��ڵȼ�ȯ����Ϣ
	private static final int column=2;//��һ�б�ʾ�ȼ�ȯ��ȣ��ڶ��б�ʾ�ȼ�ȯ���������

	private double exchangeOfScore;//���Ѷ�����ֵĶһ�����
	private double[][] equivalent=new double [line][column];//��ά���飬��һ�б�ʾ�ȼ�ȯ��ȣ�
	                                                                                                         //�ڶ��б�ʾʹ�øõȼ�ȯ���������
	private double discount;//����ȯ�Ĵ�����
	
	public PromotionPO(){
		for(int i=0;i<line;i++)
			for(int j=0;j<column;j++)
				equivalent[i][j]=0.0;
		
	}
	public PromotionPO(double ex,double [][] equ,double di){
		this.exchangeOfScore=ex;
		this.discount=di;
		for(int i=0;i<line;i++)
			for(int j=0;j<column;j++)
				equivalent[i][j]=equ[i][j];
				
			
	}
	
	public double getExchangeOfScore(){
		return exchangeOfScore;
	}
	public void setExchangeOfScore(double e){
		this.exchangeOfScore=e;
	}
	
	public double[][] getEquivalentList(){
		return equivalent;
	}
	
	public  double getEquivalent(int i,int j) {
		return equivalent[i][j];
	}
	
	public void setEquivalent(int i,int j,double equ){
		equivalent[i][j]=equ;
	}
	
	public double getDiscount(){
		return discount;
	}
	public void setDiscount(double d){
		this.discount=d;
	}
	
}
