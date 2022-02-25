package com.example.exceptionhandling;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
   ListView list ;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       try {
           String[] HEROS = new String[]{"Spiderman", "Batman", "Captian", "Superman", "Minnal murali", "Hulk", "Iron Man", "Wonder Woman"};
           ArrayAdapter<String> arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, HEROS);
           list.setAdapter(arrayAdapter);
       }
       catch(Exception e){
           Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
       }
   }
}
