package com.example.noelpaulino.appapprevenge;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button image_btn1 = (Button) findViewById(R.id.imageTextButton1);
        image_btn1.setOnClickListener(btnListener);

        Button image_btn2 = (Button) findViewById(R.id.imageTextButton2);
        image_btn2.setOnClickListener(btnListener);

        Button image_btn3 = (Button) findViewById(R.id.imageTextButton3);
        image_btn3.setOnClickListener(btnListener);

        Button image_btn4 = (Button) findViewById(R.id.imageTextButton4);
        image_btn4.setOnClickListener(btnListener);
    }
    public void onClickImageButton(View view){
        setContentView(R.layout.cp24);
    }

    private View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View view)
        {
            Toast.makeText(getBaseContext(),
                    ("BEST SUBJECT EVER"),
                    Toast.LENGTH_LONG).show();
        }
    };
    public void onToggle(View view) {
        ToggleButton btn = (ToggleButton) view;
        Toast.makeText(this, "Toggle mode: " + btn.isChecked(),
                Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
