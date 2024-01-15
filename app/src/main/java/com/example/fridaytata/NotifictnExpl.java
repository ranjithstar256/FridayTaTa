package com.example.fridaytata;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;

public class NotifictnExpl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifictn_expl);

        ActivityCompat.requestPermissions(NotifictnExpl.this,
                new String[]{Manifest.permission.POST_NOTIFICATIONS},
                1);

    }

    public void showvnfn(View view) {


        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        String channelId = "channel-01";
        String channelName = "Channel Name";
        int importance = NotificationManager.IMPORTANCE_HIGH;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);
            notificationManager.createNotificationChannel(mChannel);
        }


        Intent intent = new Intent(NotifictnExpl.this, MainActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(NotifictnExpl.this, 0,
                intent, PendingIntent.FLAG_MUTABLE);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(NotifictnExpl.this,channelId)
                .setSmallIcon(android.R.drawable.ic_media_play)
                .setContentTitle("New message received")
                .setContentIntent(pendingIntent)
                .setContentText("message from Ragu");


        notificationManager.notify(6, mBuilder.build());

    }


    public void shownfn(View view) {
        NotificationManager notificationManager = (NotificationManager) NotifictnExpl.this.getSystemService(Context.NOTIFICATION_SERVICE);

        int notificationId = 1;
        String channelId = "channel-01";
        String channelName = "Channel Name";
        int importance = NotificationManager.IMPORTANCE_HIGH;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(NotifictnExpl.this, channelId)
                .setLargeIcon(BitmapFactory.decodeResource(NotifictnExpl.this.getResources(), android.R.drawable.ic_media_play))
                .setSmallIcon(android.R.drawable.ic_media_play).setContentTitle("You can also 'Learn Android'")
                //.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(NotifictnExpl.this.getResources(), android.R.drawable.ic_media_play)))
                .setContentText("Contact AndroidManifester today!!");

        Intent intent = new Intent(NotifictnExpl.this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(NotifictnExpl.this, 0, intent, PendingIntent.FLAG_MUTABLE);
        mBuilder.setContentIntent(pendingIntent);

        notificationManager.notify(notificationId, mBuilder.build());
    }
}