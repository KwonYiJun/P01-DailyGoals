package p01_dailygoals.android.myapplicationdev.com.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static android.R.attr.checked;
import static android.support.v7.appcompat.R.id.info;

public class DailyGoal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the button and set the OnClickListener
        Button btnOk = (Button) findViewById(R.id.buttonOk);
        btnOk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                RadioButton rd1 = (RadioButton)findViewById(R. id. radio0);

                RadioGroup rg1 = (RadioGroup)findViewById(R.id.radioGroup1);
                RadioGroup rg2 = (RadioGroup)findViewById(R. id. radioGroup2);
                RadioGroup rg3 = (RadioGroup)findViewById(R. id. radioGroup3);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);

                String info4 = ((EditText)findViewById(R.id.editText)).getText().toString();

                String[] info1 = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString()};

                Intent i = new Intent(DailyGoal.this,
                        summary.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("info1", info1);
                i.putExtra("info4", info4);
                // Start the new activity
                startActivity(i);
            }});

    }
}
