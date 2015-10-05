'use strict';

angular.module('myApp.discussion', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/Discussion', {
    templateUrl: 'discussion/discussion.html',
    controller: 'discussionCtrl'
  });
}])

.controller('discussionCtrl', [function() {

}]);