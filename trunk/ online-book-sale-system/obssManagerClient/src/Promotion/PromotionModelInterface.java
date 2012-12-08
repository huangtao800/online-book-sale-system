package Promotion;

public interface PromotionModelInterface {
	public void registerObserver();
	public void removeObserver();
	public void notifyObserver();
	
    public PromotionPO promotionPORead();
    public void promotionPOWrite(PromotionPO proPO);
    
    public void presentPOWrite(PresentPO proPO);
}
