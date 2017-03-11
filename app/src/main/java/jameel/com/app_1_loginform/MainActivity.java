package jameel.com.app_1_loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editTxtUsername);
        editText2 = (EditText) findViewById(R.id.editTxtPassword);
        button1 = (Button) findViewById(R.id.btnLogin);
        button2 = (Button) findViewById(R.id.btnNext);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent1 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent1);
            }

        });
    }
public void showMessage(View view)
    {
        Toast.makeText(this, "Login error", Toast.LENGTH_LONG).show();
    }

    }

