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
        <title>Home page</title>
        <link href="${root}/css/home.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link href="${root}/css/home.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container-fluid" style="padding: 0;">
            <div id="myCarousel" class="carousel slide carousel-fade" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators" style="position: absolute; margin-left: 250px;">
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
        </div>
        <div>
            <div class="col-sm-2"> </div>
            <div class="col-sm-8 text-left">
                <h2  style="text-align: center">
                    <span>Ngôi nhà Việt Nam của Quý khách</span> 
                </h2>
                <p class="p1">
                    <span>
                        Trải qua bao nhiêu năm tháng, Rex Hotel Saigon đã chứng kiến những thay đổi trong lịch sử cũng như sự phát triển của Sài Gòn. 
                        Sau bao nhiêu nỗ lực và cố gắng, khách sạn Rex trở thành một khách sạn đạt tiêu chuẩn 5 sao với chất lượng các 
                        dịch vụ và sản phẩm luôn được quý khách hàng đánh giá cao.
                    </span>
                </p>
                <br/>
                <p class="p2">
                    <span>
                        Tọa lạc ngay giữa trái tim Thành phố, trên đại lộ Nguyễn Huệ – phố đi bộ lớn nhất hiện nay. 
                        Với hơn 90 năm hình thành và phát triển, Rex Hotel Saigon ngày nay là một khách sạn sang trọng với 286 phòng ngủ, 
                        5 nhà hàng và bar, hệ thống 8 phòng họp được trang bị hiện đại, khu mua sắm với những thương hiệu nổi tiếng Thế giới, 
                        hai hồ bơi, sân tennis và CLB chăm sóc sức khỏe hàng đầu.
                    </span>
                </p>
                <p class="p3">
                    <span>
                        Rex Hotel Saigon tự hào là khách sạn 5 sao do người Việt quản lý, 
                        cung cấp sản phẩm – dịch vụ mang bản sắc Việt đến du khách trong và ngoài nước với lòng tận tâm, hiếu khách Việt Nam.
                    </span>
                </p>
            </div>
            <div class="col-sm-2"></div>
        </div> 
        <div class="parent">
            <div class="col-sm-3" style="width: 327px;">
                <div class="item" style="width: 327px;">
                    <a href="">
                        <img class="list-img" src="${root}/image/hoinghi.jpg"/>
                        <div class="carousel-caption">
                            <p style="text-align: center">HỘI NGHỊ-TIỆC CƯỚI</p>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-sm-3" style="width: 327px;">
                <div class="item" style="width: 327px;">
                    <a href="">
                        <img class="list-img" src="${root}/image/amthuc.jpg"/>
                        <div class="carousel-caption">
                            <p style="text-align: center">ẨM THỰC</p>
                        </div>
                    </a>

                </div>
            </div>
            <div class="col-sm-3" style="width: 327px;">
                <div class="item" style="width: 327px;">
                    <a href="">
                        <img class="list-img" src="${root}/image/phongngu.jpg"/>
                        <div class="carousel-caption">
                            <p style="text-align: center">PHÒNG NGỦ</p>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-sm-3" style="width: 327px;">
                <div class="item" style="width: 327px;">
                    <a href="">
                        <img class="list-img" src="${root}/image/khoedep.jpg"/>
                        <div class="carousel-caption">
                            <p style="text-align: center">KHỎE ĐẸP</p>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-sm-6" style="width: 654px;">
                <div class="item"style="width: 654px;">
                    <a href="">
                        <img class="list-img2" src="${root}/image/nhahanghoangsa.jpg" alt=""/>
                    </a>
                    <div class="carousel-caption">
                        <p>
                            NHÀ HÀNG HOÀNG SA
                        </p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6" style="width: 706.33px;">
                <div class="item" style="width: 706.33px;">
                    <a href="">
                        <img class="list-img2" src="${root}/image/rexhotel.jpg" alt=""/>
                    </a>
                    <div class="carousel-caption">
                        <p>
                            REX HOTEL
                        </p>
                    </div>
                </div>
            </div>  
        </div>
    </body>
</html>

