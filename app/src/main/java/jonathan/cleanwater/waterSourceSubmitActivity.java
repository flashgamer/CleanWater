package jonathan.cleanwater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import jonathan.model.WaterCondition;
import jonathan.model.WaterSourceReport;
import jonathan.model.WaterType;

public class WaterSourceSubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_source_submit);

        Spinner condition = (Spinner) findViewById(R.id.condition_spinner);
        condition.setAdapter(new ArrayAdapter<WaterCondition>
                (this, android.R.layout.simple_spinner_item, WaterCondition.values()));

        Spinner type = (Spinner) findViewById(R.id.type_spinner);
        type.setAdapter(new ArrayAdapter<WaterType>
                (this, android.R.layout.simple_spinner_item, WaterType.values()));
    }

    private void onSubmit(View view) {
        WaterSourceReport myReport = new WaterSourceReport();
        String location = ((EditText) findViewById(R.id.location_field)).getText().toString();
    }
}
