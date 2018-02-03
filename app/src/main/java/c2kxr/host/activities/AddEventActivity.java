package c2kxr.host.activities;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import c2kxr.host.R;
import c2kxr.host.adapters.EventListAdapter;
import c2kxr.host.adapters.TemplateListAdapter;
import c2kxr.host.classes.Event;
import c2kxr.host.classes.Template;

public class AddEventActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TemplateListAdapter templateListAdapter;
    private ArrayList<Template> temps;
    private LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);


        // organizer button opens OrganizerDashboardActivity
        findViewById(R.id.btnAddEvent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddEventActivity.this, AddServicesActivity.class));
            }
        });
        recyclerView = findViewById(R.id.templateList);
        temps = new ArrayList<>();
        temps.add(new Template("Party","This Party"));
        temps.add(new Template("Concert","This Party"));
        temps.add(new Template("Fun Run","This Party"));

        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        TemplateListAdapter templateListAdapter = new TemplateListAdapter(this,temps, new TemplateListAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(Template item){
                Intent intent = new Intent(AddEventActivity.this,c2kxr.host.activities.AddServicesActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(templateListAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
                    // This activity is NOT part of this app's task, so create a new task
                    // when navigating up, with a synthesized back stack.
                    TaskStackBuilder.create(this)
                            // Add all of this activity's parents to the back stack
                            .addNextIntentWithParentStack(upIntent)
                            // Navigate up to the closest parent
                            .startActivities();
                } else {
                    // This activity is part of this app's task, so simply
                    // navigate up to the logical parent activity.
                    NavUtils.navigateUpTo(this, upIntent);
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
