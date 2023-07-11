package com.example.actionbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = (TextView) findViewById(R.id.tv_name);
    }
    public void OnEdit(View view)
    {
        Intent intent = new Intent(this, MessageActivity.class);
        startActivityForResult(intent, 1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null){
            return;
        } String name = data.getStringExtra("name");
        tvName.setText(name);
    }
    public void OnMessage(View view)
    {
        Toast toast = Toast.makeText(this, tvName.getText().toString(),Toast.LENGTH_LONG);
        toast.show();
    }
}