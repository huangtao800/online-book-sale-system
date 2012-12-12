package bussinessLogic.controller;

import java.util.ArrayList;

import po.PresentPO;
import po.ResultMessage;
import bussinessLogic.domain.Present;

import bussinessLogicService.PresentBLService;

public class PresentController implements PresentBLService{
	
    private static PresentBLService controller;
    private static Present present=new Present();
    
    private PresentController(){

    }
    
	public static PresentBLService getInstance(){//µ¥¼üÄ£Ê½
		if(controller==null){
			controller=new PresentController();
		}
		return controller;
	}

	public ArrayList<PresentPO> getPresentPOList(){
		return present.getPresentPOList();
	}
	public ResultMessage sendPresent(){
		return present.sendPresent();	
	}

}
