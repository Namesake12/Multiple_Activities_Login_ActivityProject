package multipleactivitiesproject.com.multipleactivitiesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t1 = (TextView) findViewById(R.id.textView2);
        t1.setText(getIntent().getStringExtra("message"));
    }
}
