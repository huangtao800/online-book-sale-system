package vo;

import po.LineItemPO;

public class LineItemVO {
	public int number;
	public double sumPrice;
	public BookVO bookVO;
	
	public LineItemVO(LineItemPO lineItemPO){
		number=lineItemPO.getNumber();
		sumPrice=lineItemPO.getSumPrice();
		bookVO=new BookVO(lineItemPO.getBook());
	}
}
