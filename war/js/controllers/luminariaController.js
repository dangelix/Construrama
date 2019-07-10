app.service('clientesLuminaria', [
	'$http',
	'$q',
	'$location',
	'$rootScope',
	'$window',
	function($http, $q, $location,$rootScope, $window) {
		
	}]);
app.controller("LuminariaController",[
	'$scope',
	'clientesService',
	'$routeParams',
	'$location',
	'$window',
	function($scope, clientesLuminaria, $routeParams,$location, $window){
		$scope.algo2 = null;
		$scope.folio = 616564622;
}]);