var app = angular.module("uppApp",[]);

app.controller("uppCntrl",function($scope,uppMathFactory){
	$scope.myName= "Kittu";
	
	$scope.result =uppMathFactory.uppMultiply(2,5);
	alert("Hi "+ $scope.result);
});

app.directive("myDirCustom",function(){
	return{
		restrict : "A",
		template:"<h1>Hi Im a custom made directive</h1>"
	};
		
}); 

app.directive("myDirCustomScope",function(){
	return{
		restrict : "A",
		templateUrl:"templete/mytemplate.jsp"
	};
		
}); 

app.factory("uppMathFactory",function(){
	var c =0;
	factory.uppMultiply = function(a,b){
		c= a*b;
		return c;
	}
});


