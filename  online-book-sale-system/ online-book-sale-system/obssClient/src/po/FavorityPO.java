package po;

/*
 * �ղؼ���
 * */

import java.util.ArrayList;

public class FavorityPO implements PO{
	ArrayList<BookPO> favorities;    //�����ղؼ��е��鼮

	public ArrayList<BookPO> getFavorities() {
		return favorities;
	}

	public void setFavorities(ArrayList<BookPO> favorities) {
		this.favorities = favorities;
	}
	
	//�ж��ղؼ��Ƿ�����
	public boolean judgeFull(){
		return favorities.size()==20;
	}
	
}
