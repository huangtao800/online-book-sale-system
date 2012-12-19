package vo;

import java.util.ArrayList;

import po.FavorityPO;

public class FavorityVO {

	public ArrayList<BookVO> bookVOList=new ArrayList<BookVO>();
	
	public FavorityVO(FavorityPO favorityPO){
		for(int i=0;i<favorityPO.getSize();i++){
			BookVO bookVO=new BookVO(favorityPO.getFavorities().get(i));
			bookVOList.add(bookVO);
		}
	}
}
