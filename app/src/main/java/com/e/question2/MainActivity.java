package com.e.question2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Integer num;
    private EditText txt;
    private String[] ones={"zero","one","two","three","four","five","six","seven","eight","nine","ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] tens={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
    private Button a;
    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    txt=findViewById(R.id.edit);
    txt1=findViewById(R.id.txt);
    a=findViewById(R.id.get);
        a.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num=Integer.parseInt(txt.getText().toString());
            if(num<20){
                txt1.setText(ones[num]);
                Toast.makeText(MainActivity.this,ones[num],Toast.LENGTH_SHORT).show();
            }else if(num<100){
                int num1=num/10;
                int num2=num%10;
                if(num2==0) {
                    txt1.setText(tens[num1]);
                    Toast.makeText(MainActivity.this, tens[num1] , Toast.LENGTH_SHORT).show();
                }else{
                    txt1.setText(tens[num1] + " " + ones[num2]);
                    Toast.makeText(MainActivity.this, tens[num1] + " " + ones[num2], Toast.LENGTH_SHORT).show();
                }
            }else if(num<1000){
                int num10=num/100;
                int num12=num%100;
                int num1=num12/10;
                int num2=num12%10;
                if(num12==0) {
                    txt1.setText(ones[num10]+" Hundred "+ tens[num1]);
                    Toast.makeText(MainActivity.this,ones[num10]+" Hundred "+ tens[num1] , Toast.LENGTH_SHORT).show();
                }else {
                    if(num2==0) {
                        txt1.setText(ones[num10]+" Hundred "+tens[num1]);
                        Toast.makeText(MainActivity.this, ones[num10]+" Hundred "+tens[num1], Toast.LENGTH_SHORT).show();
                    }else{
                        txt1.setText(ones[num10]+" Hundred "+tens[num1] + " " + ones[num2]);
                        Toast.makeText(MainActivity.this, ones[num10]+" Hundred "+tens[num1] + " " + ones[num2], Toast.LENGTH_SHORT).show();
                    }




                }
            }
        }
    });

}
}
