package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import contoller.ApplicationController;
import view.ViewResolver;

@WebServlet("/application/*")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationController applicationController;
	private ViewResolver viewResolver;
	
	public FrontController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("get");
		System.out.println("===========================FrontController================================");
		System.out.println("Path info: " + request.getPathInfo());
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post");
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		String view = applicationController.processRequest(request.getPathInfo(), request);
		String page = viewResolver.getPage(view);
		request.getRequestDispatcher(page).forward(request, response);
	}

	@Override
	public void init() throws ServletException {

		super.init();
		applicationController = new ApplicationController();
		viewResolver = new ViewResolver();
		System.out.println("Application Controller created");
	}
}
