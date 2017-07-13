package edu.formation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
        // sortie du navigateur
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        // si l'attribut identifiant est initialisé
        if (session.getAttribute("id") != null)
        {
            out.append("Utilisateur identifié : " + session.getAttribute("id"));
        }
        else
        {
            // out.append("Pas d'utilisateur authentifié");
            response.sendRedirect("session.jsp");
        }

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
        session.setAttribute("id", "toto");
        // forward vers nous-mêmes
        response.sendRedirect("session");
    }

}
