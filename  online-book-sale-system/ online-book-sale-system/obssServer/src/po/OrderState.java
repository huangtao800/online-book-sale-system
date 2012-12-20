package po;

public enum OrderState {
	ORDERDED,DISTRIBUTION,TRASPORTATION,SIGNED;
	public String toString(){
		if(this==ORDERDED){
			return "刚下单";
		}else if(this==DISTRIBUTION){
			return "正在配货";
		}else if(this==TRASPORTATION){
			return "物流配送";
		}else {
			return "已签收";
		}
	}
}
