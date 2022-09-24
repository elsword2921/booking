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
        <script src="${root}/JavaScript/layout.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container-fluid" style="padding: 0;">
            <div class="topnav" id="myTopnav">
                <div class="col-sm" style="background-color: black">
                    <a href="<c:url value="/home/index.do"/>">
                        <img src="${root}/image/logo.jpg" style="height: 40px; margin-bottom: 0; border: none"/>
                    </a>
                </div>
                <div class="col-sm">
                    <a href="<c:url value="/home/index.do"/>">Home</a>
                </div>
                <div class="col-sm">
                    <a href="<c:url value="/booking/booking.do"/>">Booking</a>
                </div>
                <div class="col-sm">
                    <a href="#contact"></a>
                </div>
                <div class="col-sm">
                    <a href="#about"</a>
                </div>
                <div class="col-sm">

                </div>
                <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="myFunction()">&#9776;</a>
            </div>
            <div style="padding-left:16px">
                <p></p>
            </div> 
        </div>

        <div>
            <jsp:include page="/WEB-INF/view/${controller}/${action}.jsp"/>
        </div>

    </body>
    <!--    <footer>
            From Booking Master 
        </footer>-->
</html>
