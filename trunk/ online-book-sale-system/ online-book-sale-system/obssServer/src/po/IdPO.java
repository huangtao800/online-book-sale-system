package po;

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
