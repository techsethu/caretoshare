'use strict';

var discussion = angular.module('myApp.discussion', ['ngRoute'])

discussion.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/Discussion', {
    templateUrl: 'discussion/discussion.html',
    controller: 'discussionCtrl'
  });
}]);

discussion.factory("discussionService", ['$resource',function ($resource){
    return {
        getDiscussions: function() {
            return $resource('http://localhost:8080/c2s/discussions').query(); 
        }
    };
}]);

discussion.controller('discussionCtrl',  ['$scope','discussionService', function($scope, discussionService) {
    
   $scope.initDiscussion = function() {
        
     discussionService.getDiscussions()
     .$promise.then(
         
         function(data) {
            $scope.discussions = data;
         },
         function(error) {
            
         });
    };
}]);


