package es.albarregas.controllers;

import es.albarregas.beans.Libro;
import es.albarregas.beans.PersonaList;
import es.albarregas.beans.PersonaSet;
import es.albarregas.daofactory.DAOFactory;
import es.albarregas.dao.IGenericoDAO;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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

/**
 *
 * @author paco
 */
@WebServlet(name = "Controlador", urlPatterns = {"/control"})
public class Controlador extends HttpServlet {

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
        
        HttpSession sesion = request.getSession();
        String url = null;
        
        switch (request.getParameter("op")) {
            case "add":
                insertar(sesion, gdao, request);
                url = "JSP/subIndex.html";
                break;
            case "delete":
                /*puerto = (Puerto) gdao.getOne(puerto.getClass(), Long.parseLong(request.getParameter("registro")));
                gdao.delete(puerto);*/
                url = "JSP/subIndex.html";
                break;
            case "update":
                /*puerto = (Puerto) gdao.getOne(puerto.getClass(), Long.parseLong(request.getParameter("registro")));
                request.setAttribute("puerto", puerto);*/
                url = "JSP/formularioActualizar.jsp";
                break;
                
                
        }
        
        request.getRequestDispatcher(url).forward(request, response);
    }
    
    public void insertar(HttpSession sesion, IGenericoDAO gdao, HttpServletRequest request){
        Libro libro = new Libro();
        
        if(sesion.getAttribute("tipoModelo").equals("list")){
            List<Libro> libros = new ArrayList<>();
            PersonaList persona = new PersonaList();
            persona.setNombre(request.getParameter("nombre"));
            libro.setTitulo(request.getParameter("libro1"));
            libros.add(libro);
            
            libro = new Libro();
            libro.setTitulo(request.getParameter("libro2"));           
            libros.add(libro);
            
            libro = new Libro();
            libro.setTitulo(request.getParameter("libro3"));
            libros.add(libro);
            
            persona.setLibros(libros);
            gdao.add(persona);
        }else{
            Set<Libro> libros = new HashSet<>();
            PersonaSet persona = new PersonaSet();
            persona.setNombre(request.getParameter("nombre"));
            libro.setTitulo(request.getParameter("libro1"));
            libros.add(libro);
            
            libro = new Libro();
            libro.setTitulo(request.getParameter("libro2"));           
            libros.add(libro);
            
            libro = new Libro();
            libro.setTitulo(request.getParameter("libro3"));
            libros.add(libro);
            
            persona.setLibros(libros);
            gdao.add(persona);
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
