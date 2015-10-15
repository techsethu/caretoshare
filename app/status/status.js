'use strict';

var statusModule = angular.module('myApp.status', ['ngRoute']);

statusModule.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/status', {
    templateUrl: 'status/status.html',
    controller: 'statusCtrl'
  });
}]);

statusModule.factory("statusService", ['$resource', function ($resource) {
    return {
        getStatus : function(requestID) {
            return $resource('http://localhost:8080/c2s/status/'+ requestID).query(); 
        }
    };
}]);

statusModule.controller('statusCtrl', ['$scope', '$timeout', 'statusService',  function($scope, $timeout, statusService) {
    
    var timeout;
    $scope.$watch('requestID', function(newVal) {
      
        if (newVal) {
          
        if (timeout) $timeout.cancel(timeout);
        timeout = $timeout(function() {
          
            statusService.getStatus(newVal)
            .$promise.then(
             function(data) {
                $scope.statuses = data;
             },
             function(error) {

             });
        }, 350);
      }
    });
  }]);