/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dataaccess.DataMapper;

/**
 *
 * @author JNE
 */
@WebServlet(name = "FrontControl", urlPatterns = {"/FrontControl"})
public class FrontControl extends HttpServlet {
    DataMapper dm = new DataMapper();
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

        String origin = request.getParameter("origin");
        String valg = request.getParameter("valg");
        if(origin == null || valg == null){
            request.getRequestDispatcher("menu.jsp").forward(request, response);
        }
        
        switch (origin) {
            case "menu": //Vi kom fra menu.jsp
                switch (valg){
                    case "list_plader":
                    request.setAttribute("allplader", dm.getAllPlader()); //data mapper klassen bruges til at køre GET_ALL_PLADER() som returnerer en liste af users som sættes fast på request objektet og sendes til viewet: showplader.jsp
                    request.getRequestDispatcher("showplader.jsp").forward(request, response);
                    break;
                    case "list_kunstner":
                    request.setAttribute("allkunstner", dm.getAllKunstner()); //data mapper klassen bruges til at køre GET_ALL_KUNSTNER() som returnerer en liste af users som sættes fast på request objektet og sendes til viewet: showkunster.jsp
                    request.getRequestDispatcher("showkunstner.jsp").forward(request, response);
                    break;
                   
                default:
                throw new AssertionError();
                }
                break;
            case "createkunstner": //vi kom fra createkunstner.jsp
                String input = request.getParameter("kunstner_navn");
                String input2 = request.getParameter("country");
                dm.addKunstner(input, input2);
                System.out.println(input + input2);
                break;
            default:
                throw new AssertionError();
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
