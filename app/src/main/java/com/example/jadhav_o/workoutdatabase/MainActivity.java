package com.example.jadhav_o.workoutdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView displayData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayData = (TextView)findViewById(R.id.displayData);
        DBHelper db = new DBHelper(this);

        db.addShop(new WorkoutClass(1,1,"PUSH UP"));
        db.addShop(new WorkoutClass(2,1,"PUSH UPpp"));
        db.addShop(new WorkoutClass(3,1,"PUSH UPpppppp"));



        displayData.setText(db.getWorkout(9).getWorkout_Name());

    }
}
