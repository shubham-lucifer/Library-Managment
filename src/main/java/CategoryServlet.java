import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cdac.model.*;
import com.cdac.service.*;
/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String catname=request.getParameter("catname");
		
		Category cat=new Category();
		cat.setCatname(catname);
		CategoryServiceImpl ctiml=new CategoryServiceImpl();
		ctiml.createCategory(cat);*/
		
		
		 String action = request.getServletPath();

	        try {
	            switch (action) {
	                case "/new":
	                    showNewForm(request, response);
	                    break;
	                case "/insert":
	                	insertCategory(request, response);
	                    break;
	                case "/delete":
	                	deleteCategory(request, response);
	                    break;
	                case "/edit":
	                    showEditForm(request, response);
	                    break;
	                case "/update":
	                	updateCategory(request, response);
	                    break;
	                default:
	                	listCategory(request, response);
	                    break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String catname=request.getParameter("catname");
		
		
	}
	 private void listCategory(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException, ServletException {
		 System.out.println("entrrrrrrrrrrr");
		          CategoryServiceImpl ctiml=new CategoryServiceImpl();
		 
			        ArrayList <Category > catlist = ctiml.getCategory();
			        System.out.println(catlist.size());
			        request.setAttribute("catlist", catlist);
			        RequestDispatcher dispatcher = request.getRequestDispatcher("categorylist.jsp");
			        dispatcher.forward(request, response);
			    }

			    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        RequestDispatcher dispatcher = request.getRequestDispatcher("addcategory.jsp");
			        dispatcher.forward(request, response);
			    }

			    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, ServletException, IOException {
			    	CategoryServiceImpl ctiml=new CategoryServiceImpl();
			    	
			    	
			        int id = Integer.parseInt(request.getParameter("id"));
			        Category cat = ctiml.findById(id);
			        RequestDispatcher dispatcher = request.getRequestDispatcher("updatecategory.jsp");
			        request.setAttribute("catobj", cat);
			        dispatcher.forward(request, response);

			    }

			    private void insertCategory(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
			    {
			      String catname=request.getParameter("catname");
				
				Category cat=new Category();
				cat.setCatname(catname);
				CategoryServiceImpl ctiml=new CategoryServiceImpl();
				ctiml.createCategory(cat);
				  RequestDispatcher dispatcher = request.getRequestDispatcher("categorylist.jsp");
			        dispatcher.forward(request, response);
			    }

			    private void updateCategory(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException {
			    	
			    	System.out.println("entrrrrrrrrrr"+request.getParameter("id"));
			        int id = Integer.parseInt(request.getParameter("id"));
			        String name = request.getParameter("catname");
			        System.out.println("entrrrrrrrrrr"+request.getParameter("catname"));
			    	CategoryServiceImpl ctiml=new CategoryServiceImpl();
			    	ctiml.update(id, name);
			      
			        response.sendRedirect("categorylist.jsp");
			    }

			    private void deleteCategory(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException {
			        int id = Integer.parseInt(request.getParameter("id"));
			        CategoryServiceImpl ctiml=new CategoryServiceImpl();
			    	ctiml.deletetCategoryById(id);
			        response.sendRedirect("categorylist.jsp");
			    }

}
