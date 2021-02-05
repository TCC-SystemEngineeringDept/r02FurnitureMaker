package r02Furniture.admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import r02Furniture.jdbc.Bui;

/**
 * Servlet implementation class BuiListServlet
 */
@WebServlet("/admin/bui/list")
public class BuiListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuiListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Bui> list = Bui.find();
			request.setAttribute("buiList", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/admin/BuiList.jsp");
			rd.forward(request, response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(response.getWriter());
		} catch (SQLException e) {
			e.printStackTrace(response.getWriter());
		}
	}

}
