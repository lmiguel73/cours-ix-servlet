package edu.formation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // sortie du navigateur
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        // si pas de cookies
        if (cookies == null || cookies.length == 0)
        {
            out.append("Pas de cookies\n");
            // Création d'un cookie
            Cookie cookie = new Cookie("id", "564987qsd");
            // définition de la limite de validité (24h)
            cookie.setMaxAge(24 * 3600);
            // ajout du cookie dans la réponse
            response.addCookie(cookie);

            // Création d'un cookie
            Cookie cookie2 = new Cookie("name", "toto");
            // définition de la limite de validité (24h)
            cookie2.setMaxAge(24 * 3600);
            // ajout du cookie dans la réponse
            response.addCookie(cookie2);
        }
        else
        {
            for (int i = 0; i < cookies.length; ++i)
            {
                String name = cookies[i].getName();
                String value = cookies[i].getValue();
                out.append("Cookie n" + i + " : " + name + "=" + value + "\n");

            }
        }

        out.append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
