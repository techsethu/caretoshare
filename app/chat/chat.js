'use strict';

angular.module('myApp.chat', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/Chat', {
    templateUrl: 'chat/chat.html',
    controller: 'chatCtrl'
  });
}])

.controller('chatCtrl', ['$scope', function($scope) {
    
    var ws = new WebSocket("ws://127.0.0.1:8080/");

    ws.onopen = function() {

    };

    ws.onmessage = function (evt) {
        
        var values = evt.data.split('\#\#\#');
        angular.forEach(values, function(key, value) {
            document.getElementById('chatHistory').innerHTML = document.getElementById('chatHistory').innerHTML + "<p>" + key + "<p>";
        })
    };

    ws.onclose = function() {
        alert("Closed!");
    };

    ws.onerror = function(err) {
        alert("Error: " + err);
    };

    $scope.sendMessage = function() {
        ws.send(document.getElementById('message').value);
    };
}]);