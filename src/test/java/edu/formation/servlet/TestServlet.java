package edu.formation.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(urlPatterns =
{ "/test" }, initParams =
{ @WebInitParam(name = "test", value = "test", description = "valeur de test") })
public class TestServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet()
    {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().append("<p>Type mime de la requête :" + request.getContentType() + "</p>");
        response.getWriter().append("<p>Protocole de la requête :" + request.getProtocol() + "</p>");
        response.getWriter().append("<p>liste des parametres de la requete : </p>");
        for (Enumeration<String> e = request.getParameterNames(); e.hasMoreElements();)
        {
            Object p = e.nextElement();
            response.getWriter()
                    .append("<p>&nbsp;&nbsp;nom : " + p + " valeur : " + request.getParameter("" + p) + "</p>");
        }

        ServletConfig srvCfg = getServletConfig();
        for (Enumeration<String> e = srvCfg.getInitParameterNames(); e.hasMoreElements();)
        {
            String p = (String) e.nextElement();
            response.getWriter().append("<p>" + p + " : " + srvCfg.getInitParameter(p) + "<br>");
        }
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }

}
