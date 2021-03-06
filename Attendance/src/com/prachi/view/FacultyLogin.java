package com.prachi.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacultyLogin
 */
@WebServlet("/FacultyLogin")
public class FacultyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html lang='en'>");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/font-awesome.min.css' media='all'>");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/simple-line-icons.css' media='all'>");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/style.css' media='all'>");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/revslider.css' >");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/owl.carousel.css'>");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/owl.theme.css'>");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/flexslider.css'>");
        out.println("<link rel='stylesheet' type='text/css' href='home2/css/jquery.mobile-menu.css'>");
        out.println("<!-- Google Fonts -->");
        out.println("<link href='https://fonts.googleapis.com/css?family=Open+Sans:700,600,800,400' rel='stylesheet' type='text/css'>");
        out.println("<link href='https://fonts.googleapis.com/css?family=Poppins:400,300,500,600,700' rel='stylesheet' type='text/css'>");
        out.println("</head>");
        out.println("<body class='shopping-cart-page'>");
        out.println("<div id='page'> ");
        out.println(" <header>");
        out.println("    <div class='header-container'>");
        out.println("      <div class='container'>");
        out.println("        <div class='row'>");
        out.println("          <div class='col-lg-2 col-md-2 col-sm-3 col-xs-12 logo-block'> ");
        out.println("            <!-- Header Logo -->");
        out.println("            <div class='logo'> <a title='Magento Commerce' href='#'><img alt='Magento Commerce' src='home2/images/logo.png'> </a> </div>");
        out.println("            <!-- End Header Logo --> ");
        out.println("          </div>");
        out.println("        </div>");
        out.println("      </div>");
        out.println("    </div>");
        out.println("  </header>");
        out.println("  <nav>");
        out.println("    <div class='container'>");
        out.println("      <div class='mm-toggle-wrap'>");
        out.println("        <div class='mm-toggle'><i class='fa fa-align-justify'></i><span class='mm-label'>Menu</span> </div>");
        out.println("      </div>");
        out.println("      <div class='nav-inner'> ");
        out.println("        <!-- BEGIN NAV -->");
        out.println("        <ul id='nav' class='hidden-xs'>");
        out.println("          <li class='level0 parent drop-menu' id='nav-home'><a href='AdminLogin' class='level-top'><span>Admin Login</span></a></li>");
        out.println("          <li class='level0 nav-6 level-top drop-menu'> <a class='level-top' href='FacultyLogin'> <span>Faculty Login</span> </a></li>");
        out.println("          <li class='mega-menu'> <a class='level-top active' href='StudentLogin'><span>Student Login</span></a></li>");
        out.println("          <li class='mega-menu'> <a class='level-top' href='AboutUs.jsp'><span>About Us</span></a> </li>");
        out.println("        </ul>");
        out.println("          </div>");
        out.println("        </div>");
        out.println("      </div>");
        out.println("    </div>");
        out.println("  </nav>");
        out.println("  <section class='main-container col1-layout'>");
        out.println("    <div class='main container'>");
        out.println("      <div class='account-login'>");
        out.println("        <div class='page-title'>");
        out.println("          <h2>Login or Create an Account</h2>");
        out.println("        </div>");
        out.println("        <fieldset class='col2-set'>");
        out.println("          <div class='col-1'>");
        out.println("            <div class='content'>");
        out.println("<img src='home2/images/faculty.png' class='img-thumbnail'>");
        out.println("            </div>");
        out.println("          </div>");
        out.println("          <div class='col-2 registered-users'><strong>Faculty Login</strong>");
        out.println("<form action=FacultyChkPwd method=post");
        out.println("            <div class='content'>");
        out.println("              <ul class='form-list'>");
        out.println("                <li>");
        out.println("                  <label for='#'>Faculty ID <span class='required'>*</span></label>");
        out.println("                  <input type='text' name=fid class='input-text required-entry'>");
        out.println("                </li>");
        out.println("                <li>");
        out.println("                  <label for='#'>Password <span class='required'>*</span></label>");
        out.println("                  <input type='password' name=fpass class='input-text required-entry validate-password'>");
        out.println("                </li>");
        out.println("              </ul>");
        out.println("              <p class='required'>* Required Fields</p>");
        out.println("              <div class='buttons-set'>");
        out.println("                <button type='submit' class='button login'><span>Login</span></button>");
        out.println("</div></form>");
        out.println("            </div>");
        out.println("          </div>");
        out.println("        </fieldset>");
        out.println("      </div>");
        out.println("      <br>");
        out.println("      <br>");
        out.println("      <br>");
        out.println("      <br>");
        out.println("      <br>");
        out.println("    </div>");
        out.println("  </section>");
        out.println("  <!-- Footer -->  <footer class='footer'>");
        out.println("    <div class='newsletter-wrap'>");
        out.println("      <div class='container'>");
        out.println("        <div class='row'>");
        out.println("          <div class='col-xs-12'>");
        out.println("          </div>");
        out.println("        </div>");
        out.println("      </div>");
        out.println("    </div>");
        out.println("  <footer class='footer'> ");
        out.println("    <div class='footer-middle'>");
        out.println("      <div class='container'>");
        out.println("        <div class='row'>");
        out.println("        </div>");
        out.println("      </div>");
        out.println("    </div>");
        out.println("  </footer> ");
        out.println("</div>");
        out.println("<script type='text/javascript' src='home2/js/jquery.min.js'></script> ");
        out.println("<script type='text/javascript' src='home2/js/bootstrap.min.js'></script> ");
        out.println("<script type='text/javascript' src='home2/js/revslider.js'></script> ");
        out.println("<script type='text/javascript' src='home2/js/common.js'></script> ");
        out.println("<script type='text/javascript' src='home2/js/jquery.bxslider.min.html'></script> ");
        out.println("<script type='text/javascript' src='home2/js/owl.carousel.min.js'></script> ");
        out.println("<script type='text/javascript' src='home2/js/jquery.mobile-menu.min.js'></script>");
        out.println("</body>");
        out.println("</html>");
		
	       out.flush();

}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
