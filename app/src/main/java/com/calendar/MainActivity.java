package com.calendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView data;
    private TextView time;
    private Button view_calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = findViewById(R.id.date);
        view_calendar = findViewById(R.id.view_calendar);
        time = findViewById(R.id.time);

        Calendar c = Calendar.getInstance();

        String sDate = c.get(Calendar.DAY_OF_MONTH) + "."
                + c.get(Calendar.MONTH)
                + "." + c.get(Calendar.YEAR);

        String sTime = c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" +
                c.get(Calendar.SECOND);

        data.setText(sDate);
        time.setText(sTime);

        view_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });
    }
}
