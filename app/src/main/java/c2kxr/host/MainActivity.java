package c2kxr.host;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // organizer button opens OrganizerDashboardActivity
        findViewById(R.id.btnOrganizer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OrganizerDashboardActivity.class));
            }
        });

        // login button opens ProviderDashboardActivity
        findViewById(R.id.btnProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProviderDashboardActivity.class));
            }
        });

    }
}
