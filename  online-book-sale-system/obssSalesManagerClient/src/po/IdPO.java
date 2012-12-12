package po;
//由于每张礼券的ID都不相同，所以需要存储之前用过的ID，再递增之
public class IdPO implements PO{
	private long id;
	
	public IdPO(long id){
		this.id=id;
	}
	
	public long getID(){
		return id;
	}

	public void setID(long id){
		this.id=id;
		
	}
}
