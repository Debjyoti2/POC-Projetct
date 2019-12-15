var app = angular.module("uppApp",[]);
app.controller("uppCntrl",function($scope){
	$scope.myName= "Kittu";
});

app.directive("myDirCustom",function(){
	return{
		template:"Hi Im a custom made directive"
	};
		
});