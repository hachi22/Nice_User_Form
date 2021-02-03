package cat.itb.niceuserform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutUsername;
    private TextInputLayout inputLayoutPassword;
    private TextInputEditText usernameEditText;
    private TextInputEditText passwordEditText;
    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputLayoutUsername = findViewById(R.id.inputLayoutUsername);
        inputLayoutPassword = findViewById(R.id.inputLayoutPassword);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        registerButton = findViewById(R.id.registerButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameEditText.getText().toString().isEmpty()){
                    inputLayoutUsername.setError("Empty username");
                }else{
                    inputLayoutUsername.setError("");
                    if (passwordEditText.getText().toString().isEmpty() || passwordEditText.getText().toString().length() < 8){
                        inputLayoutPassword.setError("Insert a password with 8 or more characters");
                    }else{
                        inputLayoutPassword.setError("");
                        Intent i = new Intent(LoginActivity.this,WelcomeActivity.class);
                        startActivity(i);
                    }
                }

            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });



    }
}
