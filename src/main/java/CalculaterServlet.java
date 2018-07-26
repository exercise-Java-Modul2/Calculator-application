import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "CalculaterServlet", urlPatterns = "/simple_calculater")
public class CalculaterServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float firstNumber = Float.parseFloat(request.getParameter("firstnumber"));
        float secondNumber = Float.parseFloat(request.getParameter("secondnumber"));
        char operator = request.getParameter("operator").charAt(0);

        PrintWriter writer = response.getWriter();

        writer.println("<h1>result:</h1>");
        float result;
        try {
            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    writer.println(firstNumber + " + " + secondNumber + " = " + result);
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    writer.println(firstNumber + " - " + secondNumber + " = " + result);
                    break;
                case '*':
                case 'x':
                    result = firstNumber * secondNumber;
                    writer.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
                    break;
                case ':':
                case '/':
                    result = firstNumber / secondNumber;
                    writer.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
                    break;
                default:
                    writer.println(operator + " does not exist!");
            }
        } catch (Exception e) {
            writer.println("Error: " + e.getMessage());
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
