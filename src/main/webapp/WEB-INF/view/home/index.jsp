<%-- 
    Document   : index
    Created on : Sep 20, 2022, 1:36:02 PM
    Author     : quckh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${root}/css/home.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="myCarousel" class="carousel slide" data-ride="carousel" style="position: absolute;">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
                <li data-target="#myCarousel" data-slide-to="4"></li>
                <li data-target="#myCarousel" data-slide-to="5"></li>
                <li data-target="#myCarousel" data-slide-to="6"></li>
            </ol>
            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="${root}/image/c1.png" class="img"/>
                    <div class="carousel-caption"> 
                        <p></p>
                    </div>      
                </div>
                <div class="item">
                    <img src="${root}/image/c2.png" class="img"/>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>      
                </div>
                <div class="item">
                    <img src="${root}/image/c3.png" class="img"/>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>      
                </div>
                <div class="item">
                    <img src="${root}/image/c4.png" class="img"/>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>      
                </div>
                <div class="item">
                    <img src="${root}/image/c5.png" class="img"/>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>      
                </div>
                <div class="item">
                    <img src="${root}/image/c6.png" class="img"/>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>      
                </div>
                <div class="item">
                    <img src="${root}/image/c7.png" class="img"/>
                    <div class="carousel-caption">
                        <h3></h3>
                        <p></p>
                    </div>      
                </div>
            </div>
            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
            <div class="">
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
            </div>
        </div>
    </body>
</html>

