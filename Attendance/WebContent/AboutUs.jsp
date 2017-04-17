<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="login.js"></script>
<link href=css/w3.css rel=stylesheet >
<title>Support</title>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<script id="spHTMLFormElementPrototypeScript">(function ()

  {

	  try

	  {

		document.sp_old_HTMLFormElementPrototype = new Object();

		document.sp_old_HTMLFormElementPrototype.submit = HTMLFormElement.prototype.submit;

		HTMLFormElement.prototype.submit = function(AEvent)

		{

		  var spEvent = document.createEvent('Event');

		  spEvent.initEvent('sp_submit', true, true);

		  this.dispatchEvent(spEvent);

		  document.sp_old_HTMLFormElementPrototype.submit.apply(this);

		};

	  }

	  catch(ErrorMessage)

	  {

		alert('Error attaching to HTMLFormElement.prototype.submit: ' + ErrorMessage);

	  }



	  try

	  {

		if (typeof __doPostBack == 'function')

		{

		  (function() {		

			var sp_old__doPostBack = __doPostBack;

			__doPostBack = function(eventTarget, eventArgument)

			{

			  try

			  {

				var spEvent = document.createEvent('Event');

				spEvent.initEvent('sp_submit', true, true);

				window.dispatchEvent(spEvent);

			  }

			  catch(ErrorMessage)

			  {

				alert('Error sending doPostBack event: ' + ErrorMessage);

			  }

			  sp_old__doPostBack(eventTarget, eventArgument);

			};      

		  })();

		}

	  }

	  catch(ErrorMessage)

	  {

		alert('Error attaching to __doPostBack(): ' + ErrorMessage);

	  }

  })();</script>


    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="css/animate.min.css" type="text/css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/creative.css" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">About Us</h2>
                    <hr style='max-width:100%; border-color:#F5F5F5; border-width:1px;'>
                    <p>Attendance Management System developed by <strong> Prachi Gautam </strong></p>
                </div>
                <div class="col-lg-4 col-lg-offset-4 text-center">
                    <i class="fa fa-phone fa-3x wow bounceIn"></i>
                    		 	
					
		


                 	<i><img src=pic/CYMERA_20160217_215837.jpg  class="w3-circle w3-image"></i>
                    <p>Prachi Gautam </p>
                    <p>+91-830-5020989</p>
                    <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay="2s"></i>
               		<p><a href="mailto:emailprachi786@gmail.com">emailprachi786@gmail.com</a></p>
                   
                </div>
              
            </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>

</body>
</html>