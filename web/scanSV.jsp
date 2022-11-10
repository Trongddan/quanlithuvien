<%-- 
    Document   : scanSV
    Created on : Nov 4, 2022, 3:30:49 PM
    Author     : DanDT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý thư viện</title>
        <link rel="stylesheet" href="css/scanSV.css"/>
    </head>
    <body>
         <jsp:include page="header.jsp"></jsp:include>
         <div class="container_scanner">
             <div class="input_area">
                 <form class="form_maSV">
                     <label>Nhập mã Sinh viên</label>
                     <input class="form-control"/>
                     <button class="btn btn-primary mt-5 float-left" type="submit">Xác nhận</button>
                 </form>
             </div>
         </div>
    </body>
</html>
