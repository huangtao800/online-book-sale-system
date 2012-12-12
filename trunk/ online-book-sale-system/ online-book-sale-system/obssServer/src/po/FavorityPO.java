package po;

/*
 * 收藏夹类
 * */

import java.util.ArrayList;

public class FavorityPO implements PO{
	public static int MAX_NUMBER=20;
	
	private ArrayList<BookPO> favorities;    //保存收藏夹中的书籍

	public FavorityPO(){
		favorities=new ArrayList<BookPO>();
	}
	
	public ArrayList<BookPO> getFavorities() {
		return favorities;
	}

	public void setFavorities(ArrayList<BookPO> favorities) {
		this.favorities = favorities;
	}
	
	//向收藏夹中添加图书
	public void addBook(BookPO bookPO){
		favorities.add(bookPO);
	}
	
	//从收藏夹中删除图书
	public ResultMessage removeBook(BookPO bookPO){
		String bookISBN=bookPO.getISBN();
		int index=searchIndexOfBook(bookISBN);
		
		if(index==-1){
			return ResultMessage.NOTEXIST;
		}
		
		favorities.remove(index);
		return ResultMessage.SUCCEED;
		
	}
	
	private int searchIndexOfBook(String ISBN){
		for(int i=0;i<favorities.size();i++){
			if(ISBN.equals(favorities.get(i).getISBN())){
				return i;
			}
		}
		
		return -1;
	}
	
	//判断收藏夹是否已满
	public boolean judgeFull(){
		return favorities.size()==20;
	}
	
	
	public boolean isEmpty(){
		return favorities.isEmpty();
	}
	
	public int getSize(){
		return favorities.size();
	}
	
	public boolean isExist(BookPO po){
		for(int i=0;i<favorities.size();i++){
			if(po.getISBN().equals(favorities.get(i).getISBN())){
				return true;
			}
		}
		return false;
	}
}