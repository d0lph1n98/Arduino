/*
 Control motor using built-in Arduino YUN REST API

 
 */

#include <Bridge.h>
#include <YunServer.h>
#include <YunClient.h>

// Listen on default port 5555, the webserver on the Yun
// will forward there all the HTTP requests for us.
YunServer server;

String startString;

void setup() {
  Bridge.begin();
  server.listenOnLocalhost();
  server.begin();
}

void loop() {

  // Get clients coming from server
  YunClient client = server.accept();

  // There is a new client?
  if (client) {
    //readStringUntil() "consumes" the string.
    //this means that if command was led/20, now
    //it's just 20.
    String command = client.readStringUntil('/');
    if (command == "port0") {
      //convert the value from string to int.
      int value = client.parseInt();	// motorValue = map(potValue, 0, 1023, 0, 255);
      analogWrite(11, value);
      analogWrite(10, value);
    }
    if (command == "port1") {		// the value received is half of the full wave value
      int value = client.parseInt();
      analogWrite(11, value);
      delay(90);
      analogWrite(11, 0);
    }
    if (command == "port2") {    // left
      int value = client.parseInt();
      analogWrite(10, value);
      //analogWrite(10, -value);
      delay(10);
      analogWrite(10, 0);
    }
    if (command == "port3") {    // right
      int value = client.parseInt();
      //analogWrite(11, -value);
      analogWrite(11, value);
      delay(10);
      analogWrite(11, 0);
    }
    if (command == "port4") {
      int value = client.parseInt();
      analogWrite(11, value);
      analogWrite(10, value);
    }
    client.stop();
  }
}
