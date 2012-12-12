package po;
//张雅婷
public enum OrderState {
	ORDERDED,DISTRIBUTION,TRASPORTATION,SIGNED;
	
	public String toString(){
		if(this==ORDERDED){
			return "刚下单";
		}else if(this==ORDERDED){
			return "正在配货";
		}else if(this==ORDERDED){
			return "正在送货";
		}else {
			return "已签收";
		}
	}
}
