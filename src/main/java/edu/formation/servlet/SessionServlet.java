package edu.formation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/session")
public class SessionServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        // si le logout est demandé
        if (
            (request.getParameter("logout") != null)
                    && request.getParameter("logout").equals("true")
        )
        {
            // destruction de la session (invalidation)
            session.invalidate();
            response.sendRedirect("session.jsp");
            return;
        }
        response.sendRedirect("session.jsp");

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        String userName = request.getParameter("id");
        // si pas de nom
        if (userName.equals(""))
        {
            userName = "Anonymous";
        }
        session.setAttribute("id", userName);
        // forward vers nous-mêmes
        response.sendRedirect("session");
    }

}
