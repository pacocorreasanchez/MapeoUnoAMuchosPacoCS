package es.albarregas.controllers;

import es.albarregas.beans.Libro;
import es.albarregas.beans.PersonaList;
import es.albarregas.beans.PersonaSet;
import es.albarregas.daofactory.DAOFactory;
import es.albarregas.dao.IGenericoDAO;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

        HttpSession sesion = request.getSession();

        String url = null;

        switch (request.getParameter("op")) {
            case "update":
                finActualizar(sesion, gdao, request);
                url = "JSP/subIndex.jsp";
                break;
        }

        request.getRequestDispatcher(url).forward(request, response);
    }
    
    public void finActualizar(HttpSession sesion, IGenericoDAO gdao, HttpServletRequest request){
        Libro libro = new Libro();
        
        if(sesion.getAttribute("tipoModelo").equals("list")){
            List<Libro> libros = new ArrayList<>();
            PersonaList personaList = new PersonaList();
            personaList = (PersonaList)gdao.getOne(personaList.getClass(), Long.parseLong(request.getParameter("id")));
            personaList.setNombre(request.getParameter("nombre"));
            if (request.getParameter("libro1") != null) {
                libro.setTitulo(request.getParameter("libro1"));
                libros.add(libro);
            }

            if (request.getParameter("libro2") != null) {
                libro = new Libro();
                libro.setTitulo(request.getParameter("libro2"));
                libros.add(libro);
            }

            if (request.getParameter("libro3") != null) {
                libro = new Libro();
                libro.setTitulo(request.getParameter("libro3"));
                libros.add(libro);
            }
            
            personaList.setLibros(libros);
            gdao.update(personaList);
        }else{
            Set<Libro> libros = new HashSet<>();
            PersonaSet personaSet = new PersonaSet();
            personaSet = (PersonaSet)gdao.getOne(personaSet.getClass(), Long.parseLong(request.getParameter("id")));
            personaSet.setNombre(request.getParameter("nombre"));
            if (request.getParameter("libro1") != null) {
                libro.setTitulo(request.getParameter("libro1"));
                libros.add(libro);
            }

            if (request.getParameter("libro2") != null) {
                libro = new Libro();
                libro.setTitulo(request.getParameter("libro2"));
                libros.add(libro);
            }

            if (request.getParameter("libro3") != null) {
                libro = new Libro();
                libro.setTitulo(request.getParameter("libro3"));
                libros.add(libro);
            }
            
            personaSet.setLibros(libros);
            gdao.update(personaSet);
        }
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
