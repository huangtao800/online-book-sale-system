package po;
//������
public enum OrderState {
	ORDERDED,DISTRIBUTION,TRASPORTATION,SIGNED;
	
	public String toString(){
		if(this==ORDERDED){
			return "���µ�";
		}else if(this==DISTRIBUTION){
			return "�������";
		}else if(this==TRASPORTATION){
			return "��������";
		}else {
			return "��ǩ��";
		}
	}
}
