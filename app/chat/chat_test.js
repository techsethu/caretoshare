'use strict';

describe('myApp.chat module', function() {

  beforeEach(module('myApp.chat'));

  describe('chat controller', function(){

    it('should ....', inject(function($controller) {
      //spec body
      var chatCtrl = $controller('chatCtrl');
      expect(chatCtrl).toBeDefined();
    }));

  });
});