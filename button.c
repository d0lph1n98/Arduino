const int buttonPin = 4;     // the number of the pushbutton pin
const int ledPin_1 =  13;      // the number of the LED pin
const int ledPin_2 = 12;
const int ledPin_3 = 11;

// variables will change:
int buttonState = 0;         // variable for reading the pushbutton status

void setup() {
  // initialize the LED pin as an output:
  pinMode(ledPin_1, OUTPUT);   
pinMode(ledPin_2, OUTPUT);   
pinMode(ledPin_3, OUTPUT);   
  // initialize the pushbutton pin as an input:
  pinMode(buttonPin, INPUT);     
}

void loop(){
  // read the state of the pushbutton value:
  buttonState = digitalRead(buttonPin);

  // check if the pushbutton is pressed.
  // if it is, the buttonState is HIGH:
  if (buttonState == LOW) {     
    // turn LED on:    
    digitalWrite(ledPin_1, HIGH);
  delay(100);
digitalWrite(ledPin_1, LOW);
delay(100);
digitalWrite(ledPin_2, HIGH);
  delay(100);
digitalWrite(ledPin_2, LOW);
delay(100);
digitalWrite(ledPin_3, HIGH);
  delay(100);
digitalWrite(ledPin_3, LOW);
delay(100);
  } 
  else {
    // turn LED off:
    digitalWrite(ledPin_1, HIGH); 
    delay(1000);
    digitalWrite(ledPin_1, LOW);
    delay(100);
    digitalWrite(ledPin_2, HIGH);
  delay(1000);
digitalWrite(ledPin_2, LOW);
delay(100);
digitalWrite(ledPin_3, HIGH);
  delay(1000);
digitalWrite(ledPin_3, LOW);
delay(1000);
  }
}
