package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class TrainerActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3;
    Button sub;
    String msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer);

        cb1 = findViewById(R.id.checkBoxCP);
        cb2 = findViewById(R.id.checkSS);
        cb3 = findViewById(R.id.checkAV);
        sub = findViewById(R.id.buttonSubmit);


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Selected Trainer";
                if(cb1.isChecked()){
                    result += "\nMr.Chandan Prasad";
                }
                if(cb2.isChecked()){
                    result += "\nMr.Sagar Sawant";
                }
                if(cb3.isChecked()){
                    result += "\nMr Anish Vargis";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBoxCP:
                str = checked ? "Mr.Chandan Prasad Selected" : "Mr.Chandan Prasad Deselected";
                break;
            case R.id.checkSS:
                str = checked ? "Mr.Sagar Sawant Selected" : "Mr.Sagar Sawant Deselected";
                break;
            case R.id.checkAV:
                str = checked ? "Mr.Anish Vargis Selected" : "Mr.Anish Vargis Deselected";
                break;
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
