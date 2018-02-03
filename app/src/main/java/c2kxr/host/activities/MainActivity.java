package c2kxr.host.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import c2kxr.host.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);

        // organizer button opens OrganizerDashboardActivity
        findViewById(R.id.btnOrganizer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OrganizerHomeActivity.class));
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
