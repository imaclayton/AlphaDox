package e.immanuelclayton.alphadox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import e.immanuelclayton.alphadox.R;

public class ItNotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_notification);

        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
            if(bundle.getString("some6")!=null);
            Toast.makeText(getApplicationContext(),"AlphaDox:"+ bundle.getString("some6"),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
