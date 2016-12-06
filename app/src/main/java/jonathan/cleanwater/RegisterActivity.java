package jonathan.cleanwater;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    public static Map<String, String> userMap = new HashMap<String, String>();
    private String errorMessage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void attemptRegister(View view) {
        EditText userText = (EditText) findViewById(R.id.username);
        EditText passText = (EditText) findViewById(R.id.password);
        if (validateRegister(userText, passText)) {
            userMap.put(userText.getText().toString(), passText.getText().toString());
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(errorMessage)
                    .setTitle("Registry Error")
                    .setCancelable(true);
            builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }

    private boolean validateRegister(EditText userText, EditText passText) {
        boolean success = false;
        errorMessage = "";

        if (null == userText || userText.getText().toString().length() == 0) {
            errorMessage += "Username cannot be empty! \n";
        } else if (userMap.containsKey(userText.getText().toString())) {
            errorMessage += "Username has already been taken! \n";
        }
        if (null == passText || passText.getText().toString().length() == 0) {
            errorMessage += "Password cannot be empty! \n";
        }
        if (errorMessage.length() == 0) { success = true; }
        return success;
    }
}
