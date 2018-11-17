package bd.teamfly.eventfusion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstLayer extends AppCompatActivity {

    EditText email,password;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layer);

        email = findViewById(R.id.emailid);
        password = findViewById(R.id.passwordid);
        login = findViewById(R.id.loginid);
        register = findViewById(R.id.registerid);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailText = email.getText().toString();
                String passwordText = password.getText().toString();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent (FirstLayer.this,UserRegistration.class);

                startActivity(intent);

            }
        });
    }
}
