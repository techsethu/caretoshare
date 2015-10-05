'use strict';

angular.module('myApp.dashboard', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/dashboard', {
    templateUrl: 'dashboard/dashboard.html',
    controller: 'dashboardCtrl'
  });
}])

.controller('dashboardCtrl', ['$scope', function($scope) {
    
    $scope.menuItems = ['Discussion','Chat','Survey','Event','Ads','Exchange'];
}]);