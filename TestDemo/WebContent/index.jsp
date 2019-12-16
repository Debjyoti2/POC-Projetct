<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Angular  Demo</title>
<script src="lib/angular.js"></script>
<script src="app.js"></script>
</head>
<body ng-app="uppApp">

<div  ng-controller="uppCntrl">
<p1>My Name is :   {{myName}}</p1>

 <div my-dir-custom></div>
 <div my-dir-custom-scope></div>
 
 <div upp-factory></div>
 Result is : {{result}}


</div>

</body>
</html>