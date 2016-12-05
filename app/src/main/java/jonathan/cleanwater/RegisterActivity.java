package jonathan.cleanwater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void attemptRegister(View view) {
        if (validateRegister()) {
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        }
    }

    private boolean validateRegister() {
        return true;
    }
}
