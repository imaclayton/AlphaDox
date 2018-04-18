package e.immanuelclayton.alphadox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class BusKnecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_knec);

        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
            if(bundle.getString("some13")!=null);
            Toast.makeText(getApplicationContext(),"AlphaDox:"+ bundle.getString("some13"),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
