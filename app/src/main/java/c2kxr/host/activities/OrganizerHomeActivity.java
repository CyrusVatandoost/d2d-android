package c2kxr.host.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import c2kxr.host.R;
import c2kxr.host.adapters.EventListAdapter;
import c2kxr.host.classes.Event;

/**
 * Created by Kristian on 2/3/2018.
 */

public class OrganizerHomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EventListAdapter eventListAdapter;
    private ArrayList<Event> events;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_organizer_dashboard);

        recyclerView = findViewById(R.id.eventList);
        events = new ArrayList<>();
        events.add(new Event("My Party","Kristian","July 2012"));
        events.add(new Event("My Party 2","Kristian","July 2013"));
        events.add(new Event("My Party 3","Kristian","July 2014"));
        events.add(new Event("My Party 4","Kristian","July 2015"));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        eventListAdapter = new EventListAdapter(this,events, new EventListAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(Event item){
                Intent intent = new Intent(OrganizerHomeActivity.this,c2kxr.host.activities.EventActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(eventListAdapter);

        // organizer button opens OrganizerDashboardActivity
        findViewById(R.id.btnAddEvent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrganizerHomeActivity.this, AddEventActivity.class));
            }
        });

    }
}
