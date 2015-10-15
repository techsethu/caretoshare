'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
//    'ngGrid',
    'ngRoute',
    'ngResource',
    'myApp.status',
    'myApp.discussion',
    'myApp.chat',
    'myApp.dashboard',
    'myApp.version'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.otherwise({redirectTo: '/status'});
}]);
