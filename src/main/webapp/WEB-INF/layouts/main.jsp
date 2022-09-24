<%-- 
    Document   : main
    Created on : Sep 20, 2022, 1:28:14 PM
    Author     : quckh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link href="${root}/css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>                        
                </button>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar" style="margin-top: -10px;" >
                <ul class="nav navbar-nav" style="display: inline;">
                    <li><a style="padding: 0px; padding-right: 5px;" class="navbar-collapse">
                            <img src="${root}/image/logo.jpg" height="50"/>
                        </a></li>
                    <li><a href=<c:url value="/home/index.do"/>> Home page</a></li>
                    <li><a href=<c:url value="/booking/booking.do"/>>Booking</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <body>
        <div>
            <jsp:include page="/WEB-INF/view/${controller}/${action}.jsp"/>
        </div>
    </body>
    <!--    <footer>
            From Booking Master 
        </footer>-->
</html>
