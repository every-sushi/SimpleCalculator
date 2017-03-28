 package rlaskfud0515.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {
     EditText edit_first, edit_second;
     TextView textresult;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         edit_first = (EditText) findViewById(R.id.edit_first);
         edit_second = (EditText) findViewById(R.id.edit_second);

         Button but1 = (Button) findViewById(R.id.but_plus);
         Button but2 = (Button) findViewById(R.id.but_minus);
         Button but3 = (Button) findViewById(R.id.but_multiply);
         Button but4 = (Button) findViewById(R.id.but_devision);
         textresult = (TextView) findViewById(R.id.text_result);
         but1.setOnClickListener(butHandler);
         but2.setOnClickListener(butHandler);
         but3.setOnClickListener(butHandler);
         but4.setOnClickListener(butHandler);

        /*but1.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());

                result.setText(Integer.toString(num1+num2));
                }

        });

        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());

                result.setText(Integer.toString(num1-num2));
            }

        });

        but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());

                result.setText(Integer.toString(num1*num2));
            }

        });

        but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1 = Integer.parseInt(edit_first.getText().toString());
                int num2 = Integer.parseInt(edit_second.getText().toString());

                result.setText(Integer.toString(num1/num2));
            }

        });*/

     }

   /*  @Override
     public void onClick(View view) {
         int num1 = Integer.parseInt(edit_first.getText().toString());
         int num2 = Integer.parseInt(edit_second.getText().toString());
         int result =0;

         switch(view.getId()){
             case R.id.but_plus:
                 result =num1 +num2; break;

             case R.id.but_minus:
                 result =num1 -num2; break;

             case R.id.but_multiply:
                 result =num1 *num2; break;

             case R.id.but_devision:
                 result =num1 /num2; break;
         }

         textresult.setText(result+" ");

     }*/

     View.OnClickListener butHandler = new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             int num1 = Integer.parseInt(edit_first.getText().toString());
             int num2 = Integer.parseInt(edit_second.getText().toString());
             int result = 0;

             switch (view.getId()) {
                 case R.id.but_plus:
                     result = num1 + num2;
                     break;

                 case R.id.but_minus:
                     result = num1 - num2;
                     break;

                 case R.id.but_multiply:
                     result = num1 * num2;
                     break;

                 case R.id.but_devision:
                     result = num1 / num2;
                     break;
             }


             textresult.setText(result + " ");

         }
     };
 }

