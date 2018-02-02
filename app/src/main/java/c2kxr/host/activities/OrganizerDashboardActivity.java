package c2kxr.host.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import c2kxr.host.OrganizerEventListActivity;
import c2kxr.host.R;

public class OrganizerDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer_dashboard);

        // add event button opens MainActivity
        findViewById(R.id.btnAddEvent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrganizerDashboardActivity.this, AddEventActivity.class));
            }
        });

        // view organizer events button opens MainActivity
        findViewById(R.id.btnViewEvents).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrganizerDashboardActivity.this, OrganizerEventListActivity.class));
            }
        });

    }
}
