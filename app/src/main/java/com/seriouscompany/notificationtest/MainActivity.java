package com.seriouscompany.notificationtest;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Notification notification = new Notification(R.drawable.icon_notification, "테스트", System.currentTimeMillis());
        notification.setLatestEventInfo(getApplicationContext(), "영업지원 모바일 시스템",  "에 중요 첨언이 등록되었습니다", null);


    }
}
