package com.example.lamoboos223.notificationapp;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //after 10 seconds the user will get notified
        new CountDownTimer(10000, 1000) {

            /*public void onTick(long millisUntilFinished) {
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }
            */

            @Override
            public void onTick(long l) {

            }

            public void onFinish() {
                notify2();
            }
        }.start();

    }

    public void notify2() {

        NotificationCompat.Builder notificationBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setSmallIcon(R.drawable.ll)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ll))
                        .setContentTitle("نادي كتاب الطفل")
                        .setContentText("يرجى تجديد الحساب لإستلام مزيد من الكتب.");

        NotificationManager notificationManger =
                (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManger.notify(1, notificationBuilder.build());


    }
}
