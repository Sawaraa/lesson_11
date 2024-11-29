<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Magazines</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.19.4/dist/css/uikit.min.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.19.4/dist/css/uikit.min.css" />
    <link rel="stylesheet" href="css/magazine.css">
    <script> src= "https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"</script>

</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>

   <div class="container">
   <div class="row">
    <div id="productContainer"></div>
   </div>
   </div>

    <jsp:include page="footer.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" defer></script>
    <script src="js/product.js" defer></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.19.4/js/uikit.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.19.4/js/uikit-icons.min.js"></script>
</body>
</html>
