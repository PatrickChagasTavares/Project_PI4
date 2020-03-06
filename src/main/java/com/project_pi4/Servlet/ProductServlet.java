/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project_pi4.Servlet;

import com.project_pi4.DAO.ProductDAO;
import com.project_pi4.Model.Product;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giraw
 */
public class ProductServlet {
    @WebServlet (name="Produtos", urlPatterns = {"/product"})
    public class productServlet extends HttpServlet {
        String INSERT_OR_EDIT = "/update.jsp";
        String LIST_USER= "/index.jsp";
        ProductDAO dao; 
        Product produto;
        
        public productServlet() {
            super();
            dao= new ProductDAO();
        }
        
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("UTF-8");   
            doGet(req, resp);
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String forward="";
            String action= req.getParameter("action");
            
            if(action.equalsIgnoreCase("delete")){
                try{
                dao.Delete(Integer.parseInt(req.getParameter("id")));
                      resp.sendRedirect("index.jsp");
                }catch(Exception error){
                    throw new RuntimeException("delete_exec Error: "+ error);
                }
            }
            
            else if(action.equalsIgnoreCase("edit")){
                forward = INSERT_OR_EDIT;
                 try{
                    Product prod = new Product();

                    if(req.getParameter("nome").equals("") || req.getParameter("desc").equals("") || req.getParameter("preco").equals("")){
                        resp.sendRedirect("index.jsp");
                    }else{
                        prod.setId(Integer.parseInt( req.getParameter("id")));
                        prod.setNome(req.getParameter("nome"));
                        prod.setDesc(req.getParameter("desc"));
                        prod.setPreco(Double.parseDouble( req.getParameter("preco")));
                        prod.setCategoria("");
                        dao.Update(prod);
                    }
                }catch(Exception error){
                    throw new RuntimeException("update_exec Error: "+ error);
                }
            }
            
            else if (action.equalsIgnoreCase("listProducts")){
                forward = LIST_USER;
                req.setAttribute("products", dao.GetAll());
            }
            
            else if (action.equalsIgnoreCase("insert")){
                try{
                Product prod = new Product();
                
                if(req.getParameter("nome").equals("") || req.getParameter("desc").equals("") || req.getParameter("preco").equals("")){
                    resp.sendRedirect("index.jsp");
                }else{
                    forward = LIST_USER;
                    prod.setNome(req.getParameter("nome"));
                    prod.setDesc(req.getParameter("desc"));
                    prod.setPreco(Double.parseDouble( req.getParameter("preco")));
                    prod.setCategoria("");
                    dao.Insert(prod);
                }
                
            }catch(Exception error){
                throw new RuntimeException("insert_exec Error: "+ error);
            }
            }
            else{
                forward = INSERT_OR_EDIT;
            }
            RequestDispatcher view = req.getRequestDispatcher(forward);
            view.forward(req, resp);
        }
        
    }
}
