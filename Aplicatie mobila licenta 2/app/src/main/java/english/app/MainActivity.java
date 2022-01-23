package english.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button41);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeginnerAndIntermediateActivity();
            }
        });
    }
    public void openBeginnerAndIntermediateActivity() {
        Intent intent = new Intent(this, BeginnerAndIntermediateActivity.class);
        startActivity(intent);
    }
}


