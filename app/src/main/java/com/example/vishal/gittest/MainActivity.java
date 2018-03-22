package com.example.vishal.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle newTest) {
        super.onCreate(newTest);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "test toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "test toast 2 added", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "test toast 3 added", Toast.LENGTH_SHORT).show();
        //comment from user1
        //comment added for new branch "test-branch"
        //new line added in branch "master"
    }
}
