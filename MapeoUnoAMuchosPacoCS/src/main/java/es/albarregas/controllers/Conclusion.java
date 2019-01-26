package es.albarregas.controllers;

import es.albarregas.beans.Libro;
import es.albarregas.beans.PersonaList;
import es.albarregas.daofactory.DAOFactory;
import es.albarregas.dao.IGenericoDAO;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author paco
 */
@WebServlet(name = "Conclusion", urlPatterns = {"/conclusion"})
public class Conclusion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DAOFactory daof = DAOFactory.getDAOFactory();
        IGenericoDAO gdao = daof.getGenericoDAO();

        Libro libro = new Libro();
        PersonaList persona = new PersonaList();

        String url = null;

        switch (request.getParameter("op")) {
            case "update":
                /*puerto = (Puerto) gdao.getOne(puerto.getClass(), Long.parseLong(request.getParameter("id")));
                servicio = (Servicio) gdao.getOne(servicio.getClass(), Long.parseLong(request.getParameter("id")));
                
                servicio.setNombre(request.getParameter("nombre"));
                servicio.setPath(request.getParameter("path"));
                puerto.setNumero(Integer.parseInt(request.getParameter("numero")));
                puerto.setTipo(request.getParameter("tipo"));
                
                gdao.update(puerto);
                gdao.update(servicio);*/
                url = "index.html";
                break;
        }

        request.getRequestDispatcher(url).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
