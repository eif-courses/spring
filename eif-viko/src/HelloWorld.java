import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marius on 11/27/2016.
 */
public class HelloWorld extends HttpServlet {

    private String message;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello World";
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        List<String> cityList = new ArrayList<String>();
        cityList.add("Washington DC");
        cityList.add("Delhi");
        cityList.add("Berlin");
        cityList.add("Paris");
        cityList.add("Rome");

        request.setAttribute("cityList", cityList);




      //  request.setAttribute("data", data);
        request.getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);

    }
}
