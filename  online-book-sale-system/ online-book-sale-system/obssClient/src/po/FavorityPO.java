package po;

/*
 * 收藏夹类
 * */

import java.util.ArrayList;

public class FavorityPO implements PO{
	ArrayList<BookPO> favorities;    //保存收藏夹中的书籍

	public ArrayList<BookPO> getFavorities() {
		return favorities;
	}

	public void setFavorities(ArrayList<BookPO> favorities) {
		this.favorities = favorities;
	}
	
	//判断收藏夹是否已满
	public boolean judgeFull(){
		return favorities.size()==20;
	}
	
}
