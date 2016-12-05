package jonathan.cleanwater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void attemptLogin(View view) {
        if (validateLogin()) {
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        }
    }

    private boolean validateLogin() {
        return true;
    }
}
