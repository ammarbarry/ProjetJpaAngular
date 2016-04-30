'use strict';

/**
 * @ngdoc function
 * @name yeomanTestApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the yeomanTestApp
 */
var app = angular.module('yeomanTestApp');

//app.controller('MainCtrl', function ($scope, $log) {
//    
//    $scope.send = function(user){
//    	$log.log($scope.user);
//    }
//  });

app.factory('yeo', function($resource){
	return $resource('/rest/personne/:id', {id: '@id'}, {
		  query: {method: 'get', isArray: false, cancellable: true}
		});
});

app.controller('MainCtrl', function ($scope, $http, yeo, $log) {
	$scope.persons = [];
	/*$http.get('http://localhost:8080/rest/residence/api/get/personne/id/1')
		.success(function(response){
			$scope.result=response;*/
	$scope.send = function(user){
		yeo.save(user, function(data){
			$log.log(data);
			yeo.query(function(data){
				if(data.personne !== undefined)
		        {
		            $log.log(data);
					if(data.personne.length > 1){
		                $scope.persons=data.personne;
		            }
		            else{
		                $scope.persons.push(data.personne);
		            }
		        }
			});
		});
	};
	
	yeo.query(function(data){
		if(data.personne !== undefined)
        {
            $log.log(data);
			if(data.personne.length > 1){
                $scope.persons=data.personne;
            }
            else{
                $scope.persons.push(data.personne);
            }
        }
	});
})
;

//app.factory('yeo', function($resource){
//return $resource('/personne/api/get/id/:id', {id: '@id'}, {
//	  query: {method: 'get', isArray: true, cancellable: true}
//	});
//});<tr ng-repeat="response in result">

