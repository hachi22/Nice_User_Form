package cat.itb.niceuserform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    TextView title;
    TextInputLayout username;
    TextInputLayout password;
    TextInputLayout repeatPass;
    TextInputLayout name;
    TextInputLayout surname;
    TextInputLayout date;
    TextInputLayout pronouns;
    TextInputLayout email;
    TextInputEditText usernameEditText;
    TextInputEditText passwordEditText;
    TextInputEditText repeatPassEditText;
    TextInputEditText nameEditText;
    TextInputEditText surnameEditText;
    TextInputEditText dateEditText;
    AutoCompleteTextView pronounsEditText;
    TextInputEditText emailEditText;
    CheckBox checkBox;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        title = findViewById(R.id.registerTitle);
        username = findViewById(R.id.inputLayoutUsername);
        usernameEditText = findViewById(R.id.inputTextUsername);
        password = findViewById(R.id.inputLayoutPassword);
        repeatPass = findViewById(R.id.inputLayoutPasswordRepeat);
        passwordEditText = findViewById(R.id.inputTextPassword);
        repeatPassEditText = findViewById(R.id.inputTextPasswordRepeat);
        name = findViewById(R.id.inputLayoutName);
        surname = findViewById(R.id.inputLayoutSurname);
        date = findViewById(R.id.inputLayoutDate);
        pronouns = findViewById(R.id.inputLayoutPronouns);
        email = findViewById(R.id.inputLayoutEmail);
        nameEditText = findViewById(R.id.inputTextName);
        surnameEditText = findViewById(R.id.inputTextSurname);
        dateEditText = findViewById(R.id.inputTextDate);
        emailEditText = findViewById(R.id.inputTextEmail);
        checkBox = findViewById(R.id.checkConditions);
        confirm = findViewById(R.id.registerButton);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (usernameEditText.getText().toString().isEmpty()) {
                    username.setError("Empty username");
                } else {
                    username.setError("");
                    if (passwordEditText.getText().toString().isEmpty() || passwordEditText.getText().toString().length() < 8) {
                        password.setError("Insert a valid password");
                    } else {
                        password.setError("");
                        if (!passwordEditText.getText().toString().equals(repeatPassEditText.getText().toString())) {
                            repeatPass.setError("The passwords are different");
                        } else {
                            repeatPass.setError("");
                            if (emailEditText.getText().toString().isEmpty()) {
                                email.setError("You have to complete the field");
                            } else {
                                email.setError("");
                                if (nameEditText.getText().toString().isEmpty()) {
                                    name.setError("You have to complete the field");
                                } else {
                                    name.setError("");
                                    if (surnameEditText.getText().toString().isEmpty()) {
                                        surname.setError("You have to complete the field");
                                    } else {
                                        surname.setError("");
                                        if (dateEditText.getText().toString().isEmpty()) {
                                            date.setError("You have to complete the field");
                                        } else {
                                            date.setError("");
                                            if (pronounsEditText.getText().toString().isEmpty()) {
                                                pronouns.setError("You have to complete the field");
                                            } else {
                                                pronouns.setError("");
                                                if (!checkBox.isChecked()) {
                                                    checkBox.setError("You have to accept the conditions");
                                                } else {
                                                    checkBox.setError("");
                                                    Intent i = new Intent(RegisterActivity.this, WelcomeActivity.class);
                                                    startActivity(i);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }




        });

    }

}


