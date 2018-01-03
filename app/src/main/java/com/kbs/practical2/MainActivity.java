package com.kbs.practical2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

   // Button btnJoin,btnClear;
    EditText etFname,etLname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   btnJoin=(Button)findViewById(R.id.btnJoin);
     //   btnClear=(Button)findViewById(R.id.buttonClear);
        etFname=(EditText)findViewById(R.id.editTextFname);
        etLname=(EditText)findViewById(R.id.editTextLname);
   //     etFname=(EditText)findViewById(R.id.editTextFname);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "onpause called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "onresume called", Toast.LENGTH_SHORT).show();
    }

    public void JoinName(View v)
    {
            Log.d("hi","test");
            Toast.makeText(MainActivity.this, etFname.getText()+" "+etLname.getText(), Toast.LENGTH_SHORT).show();
    }
    public void clearName(View v)
    {
        etLname.setText("");
        etFname.setText("");
    }
    public void closeapp(View v)
    {
        finish();
    }
}
