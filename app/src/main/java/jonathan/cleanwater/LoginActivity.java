package jonathan.cleanwater;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static jonathan.cleanwater.RegisterActivity.userMap;

public class LoginActivity extends AppCompatActivity {

    private String errorMessage = "";
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        auth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    // Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    // Log.d(TAG, "onAuthStateChanged:signed_out");
                }
            }
        };
        setContentView(R.layout.activity_login);
    }

    public void attemptLogin(View view) {
        if (validateLogin()) {
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(errorMessage)
                    .setTitle("Login Error")
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

    private boolean validateLogin() {
        boolean success = false;
        errorMessage = "";
        EditText userText = (EditText) findViewById(R.id.username);
        EditText passText = (EditText) findViewById(R.id.password);
        if (null == userText || userText.getText().toString().length() == 0) {
            errorMessage += "Username cannot be empty! \n";
        }
        if (null == passText || passText.getText().toString().length() == 0) {
            errorMessage += "Password cannot be empty! \n";
        } else if (userMap.containsKey(userText.getText().toString()) &&
                !userMap.get(userText.getText().toString()).equals(passText.getText().toString())) {
            errorMessage += "Password is incorrect! \n";
        }
        if (errorMessage.length() == 0) { success = true; }
        return success;
    }

    @Override
    public void onStart() {
        super.onStart();
        auth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            auth.removeAuthStateListener(mAuthListener);
        }
    }
}
