package view;

import java.util.HashMap;
import java.util.Map;

import constants.PageConstants;
import constants.ViewConstants;

public class ViewResolver {
	
	private Map<String, String> pages;

	public ViewResolver() {
		pages=new HashMap<String, String>(){
			{
				put(ViewConstants.ALL_USERS, PageConstants.PAGE_ALL_USERS);
				put(ViewConstants.DEFAULT_ERROR, PageConstants.DEFAULT_ERROR);
				
			}
		};
	}
	
	public String getPage(String view) {
		if(pages.containsKey(view))
			return pages.get(view);
		return null;
	}
	
}
