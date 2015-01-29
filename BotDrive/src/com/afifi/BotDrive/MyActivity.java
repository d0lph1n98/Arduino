package com.afifi.BotDrive;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button forward = (Button) findViewById(R.id.forward);
        Button backward = (Button) findViewById(R.id.backward);
        Button left = (Button) findViewById(R.id.left);
        Button right = (Button) findViewById(R.id.right);
        Button stop = (Button) findViewById(R.id.stop);

        // Sent a lot of HTTP request to Dragino Webserver and caused the shield to overheated
        /*HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port4/0");

        try {
            HttpResponse response = httpclient.execute(httppost);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // Putting the HTTP request into a loop causing the webserver to overload and
        // shield to overheated

        // OnTouchListener send multiple request if the user still touching the button
        // It will increase the load for the Arduino Yun Web server
	
	// do not return false from ontouch return true so that it will listen next motion event

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port0/255");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        /*forward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port0/255");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            }
        });*/

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port1/127");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        /*backward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port0/255");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            }
        });*/

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port2/127");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        /*left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port0/255");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            }
        });*/

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port3/127");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        /*right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port0/255");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            }
        });*/

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port4/0");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        /*stop.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.240.1/arduino/port0/255");

                try {
                    HttpResponse response = httpclient.execute(httppost);
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            }
        });*/
    }
}
