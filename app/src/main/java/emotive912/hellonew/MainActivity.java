package emotive912.hellonew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        final EditText editName = (EditText)findViewById(R.id.editTextName);
        final EditText editSurname = (EditText)findViewById(R.id.editTextSurname);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String surname = editSurname.getText().toString();
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                startActivity(intent);
            }
        });

    }
}
