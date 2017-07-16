package edu.formation.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.formation.dao.FilmDao;
import edu.formation.dao.FilmDaoSql;
import edu.formation.model.Film;

/**
 * Servlet implementation class FilmServlet
 */
@WebServlet("/film")
public class FilmServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmServlet()
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
        // dispatcher
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/home");
        // dao
        FilmDao dao = new FilmDaoSql();
        // si un id est renseigné
        String id = request.getParameter("id");
        if (id != null)
        {
            // un seul film demandé
            Film film = dao.findById(Integer.parseInt(id));
            request.setAttribute("film", film);
            rd = this.getServletContext().getRequestDispatcher("/film.jsp");
        }
        else
        {
            // tous les films
            List<Film> films = dao.findAll();
            request.setAttribute("films", films);
            // dispatch
            rd = this.getServletContext().getRequestDispatcher("/films.jsp");
        }

        // patate chaude
        rd.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // TODO Auto-generated method stub
        this.doGet(request, response);
    }

}
