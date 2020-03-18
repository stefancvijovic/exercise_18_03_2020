package contoller;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import action.factory.ActionFactory;
import constants.ViewConstants;

public class ApplicationController {

	public String processRequest(String pathInfo, HttpServletRequest request) {
		/*
		 * U zavisnosti od toga koji je pathinfo prosledjen, kreirati odgovarajucu klasu
		 * koja je zaduzena za obradu zahteva
		 */
		String view = ViewConstants.DEFAULT_ERROR;
		AbstractAction action = ActionFactory.createActionFactory(pathInfo);
		
		if (action != null) {
			view = action.execute(request);
		}else {
			request.setAttribute("error", "Action " + pathInfo + " is not mapped.");
		}
		return view;
	}

}
