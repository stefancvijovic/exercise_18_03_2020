package action.factory;

import action.AbstractAction;
import action.impl.AllAction;


public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action =null;
		
		if(actionName.equalsIgnoreCase("/all")) {
			action = new AllAction();
		}
		
		return action;
	}

}
