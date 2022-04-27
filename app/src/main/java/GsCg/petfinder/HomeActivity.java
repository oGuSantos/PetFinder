package GsCg.petfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    }

    public void opnRegistrar(View V){
        Intent myIntent = new Intent(HomeActivity.this, RegistrarActivity.class);
        HomeActivity.this.startActivity(myIntent);
    }

    public void opnFeed(View V){
        try {
            //Toast.makeText(this, "Foi", Toast.LENGTH_SHORT).show();
            this.startActivity(new Intent(HomeActivity.this, FeedActivity.class));
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}