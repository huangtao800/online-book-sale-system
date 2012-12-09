package po;

//董仁广
public class PromotionPO implements PO{
	private static final int line=10;//界面上默认有十行关于等价券的信息
	private static final int column=2;//第一列表示等价券额度，第二列表示等价券的最低消费

	private double exchangeOfScore;//消费额与积分的兑换比例
	private double[][] equivalent=new double [line][column];//二维数组，第一列表示等价券额度，
	                                                                                                         //第二列表示使用该等价券的最低消费
	private double discount;//打折券的打折率
	
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
