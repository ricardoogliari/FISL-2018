var five = require("johnny-five"),
board = new five.Board();

var firebase = require('firebase');
var config = {
    apiKey: "AIzaSyBOTL56TVrnSRE-k5A_sua_api_key",
    authDomain: "fisl-poa-2018.firebaseapp.com",
    databaseURL: "https://fisl-poa-2018.firebaseio.com",
    projectId: "fisl-poa-2018",
    storageBucket: "fisl-poa-2018.appspot.com",
    messagingSenderId: "744772420018"    
};
firebase.initializeApp(config);

var rootRef = firebase.database().ref("/lamp");
var name = null;

board.on("ready", function() {
  var rele = new five.Led(7);
  
  rootRef.on('value', function(snapshot) {
    if (snapshot.val()){
        rele.on();
    } else {
        rele.off();
    }        
  });

});
