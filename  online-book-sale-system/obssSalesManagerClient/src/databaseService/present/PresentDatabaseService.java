package databaseService.present;

import java.util.ArrayList;

import po.PresentPO;
import po.ResultMessage;

import databaseService.DatabaseService;

public interface PresentDatabaseService extends DatabaseService{
	public ArrayList<PresentPO> getPresentPOList();
	public ResultMessage sendPresent();
	

}
