

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.name);
        edt2 = findViewById(R.id.email);
        edt3 = findViewById(R.id.add);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sf=getSharedPreferences("pref",MODE_PRIVATE);
                SharedPreferences.Editor edt=sf.edit();
                edt.putString("key1",edt1.getText().toString());
                edt.putString("key2",edt2.getText().toString());
                edt.putString("key3",edt3.getText().toString());
                edt.apply();

                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                String str1="name :         "+edt1.getText().toString();
                String str2="email :        "+edt2.getText().toString();
                String str3="address :      "+edt3.getText().toString();

                i.putExtra("value1",str1);
                i.putExtra("value2",str2);
                i.putExtra("value3",str3);
                startActivity(i);

            }
        });
        SharedPreferences shared=getSharedPreferences("pref",MODE_PRIVATE);
        String value1=shared.getString("key1","");
        String value2=shared.getString("key2","");
        String value3=shared.getString("key3","");
        edt1.setText((value1));
        edt2.setText((value2));
        edt3.setText((value3));

    }

}

