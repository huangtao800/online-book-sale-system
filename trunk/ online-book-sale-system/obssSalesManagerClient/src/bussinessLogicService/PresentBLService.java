package bussinessLogicService;

import java.util.ArrayList;

import po.PresentPO;
import po.ResultMessage;

public interface PresentBLService {
	public ArrayList<PresentPO> getPresentPOList();
	public ResultMessage sendPresent();
}
