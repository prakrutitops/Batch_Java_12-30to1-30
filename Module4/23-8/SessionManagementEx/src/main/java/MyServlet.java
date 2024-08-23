import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        HttpSession sess = req.getSession();
        
        if(sess.getAttribute("mylogin")!=null)
        {
        	resp.sendRedirect("DashboardServlet");
        }
        else
        {
        	  try {
                  out.println("<!DOCTYPE html>");
                  out.println("<html lang=\"en\">");
                  out.println("<head>");
                  out.println("    <title>Login V1</title>");
                  out.println("    <meta charset=\"UTF-8\">");
                  out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">");
                  out.println("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">");
                  out.println("    <!--===============================================================================================-->");
                  out.println("</head>");
                  out.println("<body>");
                  out.println("    <div class=\"limiter\">");
                  out.println("        <div class=\"container-login100\">");
                  out.println("            <div class=\"wrap-login100\">");
                  out.println("                <div class=\"login100-pic js-tilt\" data-tilt>");
                  out.println("                    <img src=\"images/img-01.png\" alt=\"IMG\">");
                  out.println("                </div>");
                  out.println("                <form action=\"LoginServlet\" method=\"post\" class=\"login100-form validate-form\">");
                  out.println("                    <span class=\"login100-form-title\">");
                  out.println("                        Member Login");
                  out.println("                    </span>");
                  out.println("                    <div class=\"wrap-input100 validate-input\" data-validate=\"Valid email is required: ex@abc.xyz\">");
                  out.println("                        <input class=\"input100\" type=\"text\" name=\"email\" placeholder=\"Email\">");
                  out.println("                        <span class=\"focus-input100\"></span>");
                  out.println("                        <span class=\"symbol-input100\">");
                  out.println("                            <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>");
                  out.println("                        </span>");
                  out.println("                    </div>");
                  out.println("                    <div class=\"wrap-input100 validate-input\" data-validate=\"Password is required\">");
                  out.println("                        <input class=\"input100\" type=\"password\" name=\"password\" placeholder=\"Password\">");
                  out.println("                        <span class=\"focus-input100\"></span>");
                  out.println("                        <span class=\"symbol-input100\">");
                  out.println("                            <i class=\"fa fa-lock\" aria-hidden=\"true\"></i>");
                  out.println("                        </span>");
                  out.println("                    </div>");
                  out.println("                    <div class=\"container-login100-form-btn\">");
                  out.println("                        <input type=\"submit\" value=\"Login\" class=\"login100-form-btn\"/>");
                  out.println("                    </div>");
                  out.println("                    <div class=\"text-center p-t-12\">");
                  out.println("                        <span class=\"txt1\">");
                  out.println("                            Forgot");
                  out.println("                        </span>");
                  out.println("                        <a class=\"txt2\" href=\"#\">");
                  out.println("                            Username / Password?");
                  out.println("                        </a>");
                  out.println("                    </div>");
                  out.println("                    <div class=\"text-center p-t-136\">");
                  out.println("                        <a class=\"txt2\" href=\"#\">");
                  out.println("                            Create your Account");
                  out.println("                            <i class=\"fa fa-long-arrow-right m-l-5\" aria-hidden=\"true\"></i>");
                  out.println("                        </a>");
                  out.println("                    </div>");
                  out.println("                </form>");
                  out.println("            </div>");
                  out.println("        </div>");
                  out.println("    </div>");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <script src=\"vendor/bootstrap/js/popper.js\"></script>");
                  out.println("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <script src=\"vendor/select2/select2.min.js\"></script>");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <script src=\"vendor/tilt/tilt.jquery.min.js\"></script>");
                  out.println("    <script>");
                  out.println("        $('.js-tilt').tilt({");
                  out.println("            scale: 1.1");
                  out.println("        })");
                  out.println("    </script>");
                  out.println("    <!--===============================================================================================-->");
                  out.println("    <script src=\"js/main.js\"></script>");
                  out.println("</body>");
                  out.println("</html>");
              } finally {
                  out.close();
              }
        }
        
        
      
    }
}
