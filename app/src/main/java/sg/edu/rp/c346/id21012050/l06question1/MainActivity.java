package sg.edu.rp.c346.id21012050.l06question1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textViewFruits);

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        fruits.add(3, "durian");

        fruits.set(3, "dragon fruit");

        tv.setText("Fruits \n ===== \n");

        for (int i = 0; i < fruits.size(); i++) {
            tv.append(fruits.get(i) + "\n");
        }



    }
}