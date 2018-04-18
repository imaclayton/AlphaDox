package e.immanuelclayton.alphadox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import e.immanuelclayton.alphadox.R;

public class ItStPaulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_st_paul);

        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
            if(bundle.getString("some3")!=null);
            Toast.makeText(getApplicationContext(),"AlphaDox:"+ bundle.getString("some3"),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
