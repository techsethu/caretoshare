'use strict';

var dashboard = angular.module('myApp.dashboard', ['ngRoute']);

dashboard.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/dashboard', {
    templateUrl: 'dashboard/dashboard.html',
    controller: 'dashboardCtrl'
  });
}]);

dashboard.factory("dashboardService", ['$resource', function ($resource) {
    return {
        getDashboard: function() {
            return $resource('http://localhost:8080/c2s/dashboard').query(); 
        }
    };
}]);

dashboard.controller('dashboardCtrl', ['$scope','dashboardService', function($scope, dashboardService) {
    
    $scope.initDashboard = function() {
        
     dashboardService.getDashboard()
    .$promise.then(
         function(data) {
            $scope.menuItems = data;
         },
         function(error) {
           
         });
    };
}]);