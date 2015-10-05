'use strict';

angular.module('myApp.chat', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/Chat', {
    templateUrl: 'chat/chat.html',
    controller: 'chatCtrl'
  });
}])

.controller('chatCtrl', [function() {

}]);