
package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;

/**
 *
 * @author Hanin
 */
public class ShoppingListServlet extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession();
         String name = (String) session.getAttribute("name");
       
        
         
         if (name== null){
             getServletContext().getRequestDispatcher("/WEB-INF/register.jsp")
                    .forward(request,response);
         }

        String logout = request.getParameter("logout"); 
          request.setAttribute("logout", logout);
//           getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp")
//                    .forward(request,response); 
          if (logout != null){
               session.invalidate();
              getServletContext().getRequestDispatcher("/WEB-INF/register.jsp")
                    .forward(request,response);
          }
       
                
        
             getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp")
                    .forward(request,response); 
         }
//        String logout = request.getParameter("logout");
//        request.setAttribute("logout", logout);
//        if(logout == null || action.equals(""))

//        String action = request.getParameter("action");
//        
//        else if(action.equals("logout"))
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
  User user = (User) session.getAttribute("user");
//         User user = new User();
        String action = request.getParameter("action");
        request.setAttribute("action", action);
        
           if (action.equals("register")){
                user = new User();
               String userName = request.getParameter("userName");
               user.setUserName(userName);
               session.setAttribute("user", user);
               if (userName == null||userName.equals("")){
                   request.setAttribute("msg","Enter Your name"); 
               }
                
//               user.setUserName(name);
//                 session.setAttribute("user",user ); 
               

           }
                 if (action.equals("add")){
                     String item = request.getParameter("item");
                   ArrayList<String> listItem = user.getListItem();
                     user.getListItem().add(item);
                     session.setAttribute("user", user);
                      
     
               
         
           }
                 if (action.equals("delete")){
                     String item =  request.getParameter("item");
                     user.getListItem().remove(item); 
                       session.setAttribute("user", user);
                 }
                 getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp")
                    .forward(request,response); 
          
           

    
    }
    }
    

