package po;
//������
public enum OrderState {
	ORDERDED,DISTRIBUTION,TRASPORTATION,SIGNED;
	
	public String toString(){
		if(this==ORDERDED){
			return "���µ�";
		}else if(this==ORDERDED){
			return "�������";
		}else if(this==ORDERDED){
			return "�����ͻ�";
		}else {
			return "��ǩ��";
		}
	}
}
