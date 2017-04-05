package multipleactivitiesproject.com.multipleactivitiesproject;

//created by neeraj shukla
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("activity","Activity Started");
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showActivity2();
            }
        });
    }

    public void showActivity2(){
        Intent i1 = new Intent(MainActivity.this,
                Main2Activity.class);
        i1.putExtra("message","Everything is working");
        startActivity(i1);
    }
}
