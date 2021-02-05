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
import r02Furniture.jdbc.Hinmoku;

/**
 * Servlet implementation class BuiListServlet
 */
@WebServlet("/admin/hinmoku/list")
public class HinmokuListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HinmokuListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			List<Hinmoku> hinmokuList = Hinmoku.find();
			request.setAttribute("hinmokuList", hinmokuList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/admin/HinmokuList.jsp");
			rd.forward(request, response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(response.getWriter());
		} catch (SQLException e) {
			e.printStackTrace(response.getWriter());
		}
	}

}
