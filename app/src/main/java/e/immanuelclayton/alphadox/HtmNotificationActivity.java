package e.immanuelclayton.alphadox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HtmNotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htm_notification);

        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
            if(bundle.getString("some12")!=null);
            Toast.makeText(getApplicationContext(),"AlphaDox:"+ bundle.getString("some12"),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
