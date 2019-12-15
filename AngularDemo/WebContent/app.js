var app = angular.module("uppApp",[]);
app.controller("uppCntrl",function($scope){
	$scope.myName= "Kittu";
});

app.directive("myDirCustom",function(){
	return{
		restrict : "A",
		template:"Hi Im a custom made directive"
	};
		
});