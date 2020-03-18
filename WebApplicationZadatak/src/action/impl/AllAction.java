package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;


public class AllAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		request.setAttribute("users", request.getAttribute("users"));
		return ViewConstants.ALL_USERS;
	}

}
