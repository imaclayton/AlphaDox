package e.immanuelclayton.alphadox;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("AlphaDox");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_share:
                //Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                Intent shareIntent = new Intent();

                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, ("Hello, kindly share AlphaDox app from your Xender or FlashShare.\n Thank you!"));
                shareIntent.setType("text/plain");
                startActivity(Intent.createChooser(shareIntent, "Share via Xender/FlashShare..."));
                return true;
            case R.id.nav_feedback:
                sendEmail();
                return true;
            default:
        }
        //return false;
        return super.onOptionsItemSelected(item);
    }

    //Send Email
    protected void sendEmail() {
        Log.i("Send email", "Hallo developer...");

        String[] TO = {"manuelclayton@outlook.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        //  emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Android Board App Enquiry");
        //emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            // finish();
            Log.i("email sent...", "Thank you for your feedback");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        if (id == R.id.nav_home) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content, new HomeFragment());
            ft.addToBackStack(String.valueOf(R.id.content));
            ft.commit();
        } else if (id == R.id.nav_ict) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content, new IctFragment());
            ft.addToBackStack(String.valueOf(R.id.content));
            ft.commit();
        } else if (id == R.id.nav_media) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content, new MediaFragment());
            ft.addToBackStack(String.valueOf(R.id.content));
            ft.commit();
        } else if (id == R.id.nav_htm) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content, new HtmFragment());
            ft.addToBackStack(String.valueOf(R.id.content));
            ft.commit();
        } else if (id == R.id.nav_business) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content, new BusinessFragment());
            ft.addToBackStack(String.valueOf(R.id.content));
            ft.commit();
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
