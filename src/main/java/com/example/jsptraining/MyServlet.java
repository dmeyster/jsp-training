package com.example.jsptraining;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(urlPatterns = "/printAll", loadOnStartup=1)
public class MyServlet extends HttpServlet {
    /**<a href="http://localhost:8080/?command=printAll">...</a>**/
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException, ServletException {
        String myArrayStr = request.getParameter("myArray");
        String[] myArrayStrArr = myArrayStr.split(",");
        int[] array = new int[myArrayStrArr.length];
        for (int i = 0; i < myArrayStrArr.length; i++) {
            array[i] = Integer.parseInt(myArrayStrArr[i]);
        }
        String command = request.getParameter("command");
        if (command.equals("printAll")) {
            request.setAttribute("array100", array);
            RequestDispatcher dispatcher = request.getRequestDispatcher("printAll.jsp");
            dispatcher.forward(request, response);
        }
        if (command.startsWith("search")) {
            request.setAttribute("value", Integer.parseInt(command.substring(7)));
            request.setAttribute("index", search(array, Integer.parseInt(command.substring(7))));
            RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
            dispatcher.forward(request, response);
        }
        if (command.startsWith("getElement")) {
            int index = Integer.parseInt(command.substring(11));
            int element = getElement(array, index);
            request.setAttribute("index", index);
            request.setAttribute("element", element);
            RequestDispatcher dispatcher = request.getRequestDispatcher("getElement.jsp");
            dispatcher.forward(request, response);
        }
    }
    private int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    private int getElement(int[] array, int index) {
        return array[index];
    }

}