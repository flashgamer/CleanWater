package jonathan.cleanwater;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.support.v7.appcompat.R.styleable.View;

public class WaterSourceActivity extends AppCompatActivity {

    private FirebaseStorage storage = FirebaseStorage.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_source);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_water_source);
        ListView listView = (ListView) findViewById(R.id.source_report_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                String report = (String) parent.getItemAtPosition(position);

            }
        });
    }

    public void submitWaterSourceReport(View view) {
        StorageReference store = storage.getReferenceFromUrl("gs://water-app-63f4a.appspot.com/");
        Intent intent = new Intent(this, WaterSourceSubmitActivity.class);
        startActivity(intent);
    }
}
