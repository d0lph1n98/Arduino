/*
 Control motor using built-in Arduino YUN REST API
 */

#include <Bridge.h>
#include <YunServer.h>
#include <YunClient.h>

YunServer server;

String startString;

void setup() {
  Bridge.begin();
  server.listenOnLocalhost();
  server.begin();
}

void loop() {

  YunClient client = server.accept();

  if (client) {
    String command = client.readStringUntil('/');
    if (command == "port0") {
      int value = client.parseInt();	
      analogWrite(11, value);
      analogWrite(10, value);
    }
    if (command == "port1") {	
      int value = client.parseInt();
      analogWrite(11, value);
      delay(90);
      analogWrite(11, 0);
    }
    if (command == "port2") {  
      int value = client.parseInt();
      analogWrite(10, value);
      //analogWrite(10, -value);
      delay(10);
      analogWrite(10, 0);
    }
    if (command == "port3") { 
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
