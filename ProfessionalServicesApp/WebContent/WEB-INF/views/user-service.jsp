<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.tushar.model.ServiceProvider" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>

<head>
    <!-- Basic -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <!-- Site Metas -->
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <link rel="shortcut icon" href="./resources/images/fevicon.png" type="image/x-icon">
    <title>Service</title>

    <!-- bootstrap core css -->
    <link rel="stylesheet" type="text/css" href="./resources/css/bootstrap.css" />

    <!-- fonts style -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700&display=swap" rel="stylesheet">
    <!--owl slider stylesheet -->
    <link rel="stylesheet" type="text/css"
        href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />
    <!-- nice select -->
    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css"
        integrity="sha256-mLBIhmBvigTFWPSCtvdu6a76T+3Xyt+K571hupeFLg4=" crossorigin="anonymous" />
    <!-- font awesome style -->
    <link href="./resources/css/font-awesome.min.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="./resources/css/style.css" rel="stylesheet" />
    <!-- responsive style -->
    <link href="./resources/css/responsive.css" rel="stylesheet" />
    
    
    <style>
    form {
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        align-items: center;
        max-width: 600px;
        margin: 0 auto;
        margin-bottom: 20px;
        /* Added margin-bottom to create space below the form */
    }

    label {
        flex: 1;
        margin-right: 5px;
        margin-left: 20px;
    }

    input[type="text"],
    select {
        flex: 2;
        padding: 8px;
        margin-right: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        flex: 1;
        padding: 10px 20px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>



<body class="sub_page">
    <div class="hero_area">
        <div class="hero_bg_box">
            <img src="./resources/images/hero-bg.jpg" alt="">
        </div>
        <!-- header section strats -->
        <header class="header_section">
            <div class="header_top">
                <div class="container-fluid header_top_container">
			<%String userName = (String) request.getAttribute("userName"); 
 			String userCity = (String) request.getAttribute("userCity");
 			String userEmail = (String) request.getAttribute("userEmail");%>
  
                    <div class="contact_nav">
                        <a href="">
                            <i class="fa fa-map-marker" aria-hidden="true"></i>
                            <span>
                                <%=userCity %>
                            </span>
                        </a>
                       
                        <a href="">
                            <i class="fa fa-envelope" aria-hidden="true"></i>
                            <span>
                                <%=userEmail %>
                            </span>
                        </a>
                    </div>
                    <div class="social_box">
                        <a href="">
                            <i class="fa fa-facebook" aria-hidden="true"></i>
                        </a>
                        <a href="">
                            <i class="fa fa-twitter" aria-hidden="true"></i>
                        </a>
                        <a href="">
                            <i class="fa fa-linkedin" aria-hidden="true"></i>
                        </a>
                        <a href="">
                            <i class="fa fa-instagram" aria-hidden="true"></i>
                        </a>
                    </div>
                </div>
            </div>
            <div class="header_bottom">
                <div class="container-fluid">
                    <nav class="navbar navbar-expand-lg custom_nav-container ">
                        <a class="navbar-brand " href="user-panel">User :  <%=userName %></a>

                        <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                            <span class=""> </span>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav">
                                <li class="nav-item active">
                                    <a class="nav-link" href="user-panel">Home <span
                                            class="sr-only">(current)</span></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="user-about"> About</a>
                                </li>


                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink"
                                        role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        View
                                    </a>
                                    <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                        <a class="dropdown-item" href="user-pending-service">Pending Order</a>
                                        <a class="dropdown-item" href="user-approve-service">Approved Order</a>
                                        <a class="dropdown-item" href="user-disapprove-service">Disapproved
                                            Order</a>
                                    </div>
                                </li>

                                <li class="nav-item">
                                    <a class="nav-link" href="user-service">Services</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="user-contact">Contact Us</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="index">Logout</a>
                                </li>

                                <form class="form-inline justify-content-center">
                                    <button class="btn my-2 my-sm-0 nav_search-btn" type="submit">
                                        <i class="fa fa-search" aria-hidden="true"></i>
                                    </button>
                                </form>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
        </header>
        <!-- end header section -->
    </div>

 


    <!-- about section -->

    <section class="about_section layout_padding">
        <div class="container">
        
         <form action="searchService" method="post">
                <label for="serviceSelect">Category </label>
                <select name="service" id="serviceSelect">
                     <option value="Home Cleaning">Home Cleaning</option>
			        <option value="Electrical">Electrical</option>
			        <option value="Carpentry">Carpentry</option>
			        <option value="Lock Installation">Lock Installation</option>
			        <option value="Security System">Security System Installation</option>
			        <option value="Plumbing">Plumbing</option>
                </select>

                <label for="city">City</label>
                <input type="text" id="city" name="city" placeholder="Enter City" required>
                <input type="submit" value="Search">
            </form>
        
            <div class="row">



                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Name</th>
                            <th scope="col">Gender</th>
                            <th scope="col">Category</th>
                             <th scope="col">Service Type</th>
                             <th scope="col">Details</th>
                             <th scope="col">Book Order</th>
                        </tr>
                    </thead>
                    <tbody>
                    <% List<ServiceProvider> serviceProviders = (List<ServiceProvider>) request.getAttribute("serviceProviders");
                   	int i = 0;
                    for(ServiceProvider service : serviceProviders)
                    {
                    	if(service.getSerStatus().equals("Approved"))
                    	{
                    	i++;
                    	%>
                    	 <tr>
                            <th scope="row"><%=i %></th>
                            <td><%=service.getSerName()%></td>
                            <td><%=service.getSerGen() %></td>
                            <td><%=service.getSerCat() %></td>
                            <td><%=service.getSerSer() %></td>
                            <td><a href="service-detail/<%=service.getSerCont()%>">Click</a></td>
                            <td><a href="user-order/<%=service.getSerCont()%>">Click</a></td>

                        </tr>
                    	<%
                    }
                    }
					%>
                    
                       

                    </tbody>
                </table>


            </div>
        </div>
    </section>

    <!-- about section ends -->


   










      <!-- info section -->
  <section class="info_section ">
    <div class="container">
      <div class="info_top">
        <div class="row">
          <div class="col-md-3 ">
            <a class="navbar-brand" href="index">
               Professional Services
            </a>
          </div>
          <div class="col-md-5 ">
            <div class="info_contact">
              <a href="">
                <i class="fa fa-map-marker" aria-hidden="true"></i>
                <span>
                  Location
                </span>
              </a>
              
            </div>
          </div>
          <div class="col-md-4 ">
            <div class="social_box">
              <a href="">
                <i class="fa fa-facebook" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-twitter" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-linkedin" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-instagram" aria-hidden="true"></i>
              </a>
            </div>
          </div>
        </div>
      </div>
      <div class="info_bottom">
        <div class="row">
          <div class="col-lg-3 col-md-6">
            
          </div>
          <div class="col-lg-3 col-md-6">
            <div class="info_form">
              <h5>
                NEWSLETTER
              </h5>
              <form action="">
                <input type="text" placeholder="Enter Your Email" />
                <button type="submit">
                  Subscribe
                </button>
              </form>
            </div>
          </div>
          <div class="col-lg-4 col-md-6">
            <div class="info_detail">
              <h5>
                Services
              </h5>
              <p>
               Expert services for societies, encompassing legal guidance, financial
                consultancy, and strategic community solutions.
              </p>
            </div>
          </div>
          <div class="col-lg-2 col-md-6">
            <div class="">
              <h5>
                Useful links
              </h5>
              <ul class="info_menu">
                <li>
                  <a href="user-panel">
                    Home
                  </a>
                </li>
                <li>
                  <a href="user-about">
                    About
                  </a>
                </li>
                 <li>
                  <a href="user-service">
                    Services
                  </a>
                </li>
                  <li class="mb-0">
                        <a href="user-contact">
                            Contact Us
                        </a>
                   </li>
              
                              
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- end info_section -->

  <!-- footer section -->
  <footer class="footer_section">
    <div class="container">
      <p>
        &copy; <span id="displayYear"></span> Clean India Professional Services. All rights reserved.      
      </p>
    </div>
  </footer>
  <!-- footer section -->
    <!-- jQery -->
    <script src="./resources/js/jquery-3.4.1.min.js"></script>
    <!-- popper js -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
    <!-- bootstrap js -->
    <script src="./resources/js/bootstrap.js"></script>
    <!-- owl slider -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
    <!-- nice select -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js"
        integrity="sha256-Zr3vByTlMGQhvMfgkQ5BtWRSKBGa2QlspKYJnkjZTmo=" crossorigin="anonymous"></script>
    <!-- custom js -->
    <script src="./resources/js/custom.js"></script>
    <!-- Google Map -->
    <script
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap"></script>
    <!-- End Google Map -->
</body>




</html>