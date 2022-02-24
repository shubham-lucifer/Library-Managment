

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.model.AddBook;

import com.cdac.service.AddBookImpl;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/AddBook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();

        try {
            switch (action) {
                case "/insert":
                	insertBook(request, response);
                    break;
                
                	
            }
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void insertBook(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
      String c=request.getParameter("bname");
	
      AddBook cat=new AddBook();
      cat.setBname(c);
      AddBookImpl ad=new AddBookImpl();
      ad.createBook(cat);
	  RequestDispatcher dispatcher = request.getRequestDispatcher("booklist.jsp");
      dispatcher.forward(request, response);
    }

}
