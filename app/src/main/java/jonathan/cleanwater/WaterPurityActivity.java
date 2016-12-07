package jonathan.cleanwater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WaterPurityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_purity);
    }

    private void submitWaterPurityReport(View view) {
        Intent intent = new Intent(this, WaterPuritySubmitActivity.class);
        startActivity(intent);
    }
}
