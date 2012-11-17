package bussinessLogicService;
//’≈—≈Ê√

import po.ResultMessage;

public interface SalesBLService {
	public ResultMessage putInCart(String isbn, int number);
	public ResultMessage enterCart();
	public ResultMessage removeFrromCart(String itemID);	
	public ResultMessage purchase();	
	public double calucalte();
	public ResultMessage showSpecial();
	public double calculateByEquivalent();
    public double calculateByCupon();
	public ResultMessage endSale();
}
