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
                <ol class="carousel-indicators" style="margin-left: 300px; ;align-items: center; justify-content: center;">
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
                    <span>Ng??i nh?? Vi???t Nam c???a Qu?? kh??ch</span> 
                </h2>
                <p class="p1">
                    <span>
                        Tr???i qua bao nhi??u n??m th??ng, Rex Hotel Saigon ???? ch???ng ki???n nh???ng thay ?????i trong l???ch s??? c??ng nh?? s??? ph??t tri???n c???a S??i G??n. 
                        Sau bao nhi??u n??? l???c v?? c??? g???ng, kh??ch s???n Rex tr??? th??nh m???t kh??ch s???n ?????t ti??u chu???n 5 sao v???i ch???t l?????ng c??c 
                        d???ch v??? v?? s???n ph???m lu??n ???????c qu?? kh??ch h??ng ????nh gi?? cao.
                    </span>
                </p>
                <br/>
                <p class="p2">
                    <span>
                        T???a l???c ngay gi???a tr??i tim Th??nh ph???, tr??n ?????i l??? Nguy???n Hu??? ??? ph??? ??i b??? l???n nh???t hi???n nay. 
                        V???i h??n 90 n??m h??nh th??nh v?? ph??t tri???n, Rex Hotel Saigon ng??y nay l?? m???t kh??ch s???n sang tr???ng v???i 286 ph??ng ng???, 
                        5 nh?? h??ng v?? bar, h??? th???ng 8 ph??ng h???p ???????c trang b??? hi???n ?????i, khu mua s???m v???i nh???ng th????ng hi???u n???i ti???ng Th??? gi???i, 
                        hai h??? b??i, s??n tennis v?? CLB ch??m s??c s???c kh???e h??ng ?????u.
                    </span>
                </p>
                <p class="p3">
                    <span>
                        Rex Hotel Saigon t??? h??o l?? kh??ch s???n 5 sao do ng?????i Vi???t qu???n l??, 
                        cung c???p s???n ph???m ??? d???ch v??? mang b???n s???c Vi???t ?????n du kh??ch trong v?? ngo??i n?????c v???i l??ng t???n t??m, hi???u kh??ch Vi???t Nam.
                    </span>
                </p>
            </div>
            <div class="col-sm-2"></div>
        </div> 
        <div class="container-fluid">
            <div class="parent">
                <div class="col-sm-3" style="width: 327px;">
                    <div class="item" style="width: 327px;">
                        <a href="">
                            <img class="list-img" src="${root}/image/hoinghi.jpg"/>
                            <div class="carousel-caption">
                                <p style="text-align: center">H???I NGH???-TI???C C?????I</p>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="col-sm-3" style="width: 327px;">
                    <div class="item" style="width: 327px;">
                        <a href="">
                            <img class="list-img" src="${root}/image/amthuc.jpg"/>
                            <div class="carousel-caption">
                                <p style="text-align: center">???M TH???C</p>
                            </div>
                        </a>

                    </div>
                </div>
                <div class="col-sm-3" style="width: 327px;">
                    <div class="item" style="width: 327px;">
                        <a href="">
                            <img class="list-img" src="${root}/image/phongngu.jpg"/>
                            <div class="carousel-caption">
                                <p style="text-align: center">PH??NG NG???</p>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="col-sm-3" style="width: 327px;">
                    <div class="item" style="width: 327px;">
                        <a href="">
                            <img class="list-img" src="${root}/image/khoedep.jpg"/>
                            <div class="carousel-caption">
                                <p style="text-align: center">KH???E ?????P</p>
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
                                NH?? H??NG HO??NG SA
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
        </div>

        <div class="col-sm-12">
            <div class="item">
                <img src="${root}/image/background.png" style="height: 600px; width: 100%; padding: 0;"/>
                <div class="carousel-caption" style="margin-bottom: 50px;">
                    <h1 style="font-weight: bold; font-size: 40px;margin-bottom: 35px; color: black; font-weight: 400;">Our Special Offers </h1>
                    <div class="col-sm-4">
                        <div class="tab" style="height: 400px;width: 320px; background-color: white;">
                            <a href="" style="text-decoration: none; color: black;"><h2 style="font-weight: 300;padding-top: 40px;">NOW OR NEVER !!!</h2></a>      
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="tab" style="height: 400px;width: 320px; background-color: white;">
                            <a href="" style="text-decoration: none;color: black;"><h2 style="font-weight: 300;padding-top: 40px;">NOW OR NEVER !!!</h2></a>      
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="tab" style="height: 400px;width: 320px; background-color: white;">
                            <a href="" style="text-decoration: none;color: black;"><h2 style="font-weight: 300;padding-top: 40px; ">NOW OR NEVER !!!</h2></a>      
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

