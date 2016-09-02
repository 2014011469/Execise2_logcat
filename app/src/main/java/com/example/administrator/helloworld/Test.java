package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Test extends AppCompatActivity {
    private static final String tag="MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(tag, "Verbose Message");
        Log.d(tag, "Debug Message");
        Log.i(tag, "Info Message");
        Log.w(tag, "Warning Message");
        Log.e(tag, "Error Message");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button btnDelete = (Button)findViewById(R.id.buttonDelete);
        btnDelete.setOnClickListener(new View.OnClickListener(){
                                         @Override
                                         public void onClick(View v) {
                                             EditText textResult = (EditText)findViewById(R.id.editTextUserId);
                                             textResult.setText("");
                                         }
                                     }
        );

        }



    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox)view).isChecked();
     //   TextView textView = (TextView)findViewById(R.id.textView);//
        switch (view.getId()){
            case R.id.checkbosChinese:
                if(checked){
                    final TextView textViewUserId = (TextView)findViewById(R.id.textViewUserId);
                    textViewUserId.setText("账号");
                    final TextView textViewPwd = (TextView)findViewById(R.id.textViewPwd);
                    textViewPwd.setText("密码");
                }
                else {
                    final TextView textViewUserId = (TextView)findViewById(R.id.textViewUserId);
                    textViewUserId.setText("User Id:");
                    final TextView textViewPwd = (TextView)findViewById(R.id.textViewPwd);
                    textViewPwd.setText("Password:");
                }

        }
    }

}
