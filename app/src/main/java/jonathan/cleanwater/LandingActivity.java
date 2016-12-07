package jonathan.cleanwater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void handleViewSourceReports(View view) {
        Intent intent = new Intent(this, WaterSourceActivity.class);
        startActivity(intent);
    }

    public void handleViewPurityReports(View view) {
        Intent intent = new Intent(this, WaterPurityActivity.class);
        startActivity(intent);
    }

    public void handleMap(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
