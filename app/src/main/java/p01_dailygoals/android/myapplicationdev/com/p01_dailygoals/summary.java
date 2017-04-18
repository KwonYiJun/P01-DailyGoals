package p01_dailygoals.android.myapplicationdev.com.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();

        String[] info1 = i.getStringArrayExtra("info1");
        String et = i.getStringExtra("info4");
        // Get the TextView object
        TextView tv1 = (TextView) findViewById(R.id.textView8);
        TextView tv2 = (TextView) findViewById(R.id.textView9);
        TextView tv3 = (TextView) findViewById(R.id.textView10);
        TextView tv4 = (TextView) findViewById(R.id.textView11);
        // Display the name and age on the TextView
        tv1.setText("Read up on materials before class: " + info1[0]);
        tv2.setText("Arrive on time so as not to miss important part of the lesson: " + info1[1]);
        tv3.setText("Attempt the problem myself: " + info1[2]);
        tv4.setText("Reflection: " + et);


    }
}
