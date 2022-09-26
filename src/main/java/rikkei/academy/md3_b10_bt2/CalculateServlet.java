package rikkei.academy.md3_b10_bt2;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

@WebServlet(name = "CalculateServlet", value = "/CalculateServlet")
public class CalculateServlet extends HttpServlet {
    private String message;
    public void init(){
        message = "Hello world!";
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(req.getParameter("first-operand"));
        float secondOperand = Float.parseFloat(req.getParameter("second-operand"));
        char operator = req.getParameter("operator").charAt(0);
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result</h1>");
        try {
            float result = Calculator.calculate(firstOperand, secondOperand, operator);
            writer.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
        }catch (Exception ex) {
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }
    public void destroy(){

    }
}
