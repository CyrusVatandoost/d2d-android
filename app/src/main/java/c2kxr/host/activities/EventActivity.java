package c2kxr.host.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import c2kxr.host.R;
import c2kxr.host.adapters.ServiceBoxListAdapter;
import c2kxr.host.freelancer.Service;

public class EventActivity extends AppCompatActivity {

    private RecyclerView recyclerViewBox;
    private ArrayList<Service> servicesToBid;
    private ServiceBoxListAdapter serviceBoxListAdapter;
    private LinearLayoutManager linearLayoutManagerForRecyclerViewBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        recyclerViewBox = findViewById(R.id.recyclerBoxViewServices);
        servicesToBid = new ArrayList<>();
        servicesToBid.add(new Service("DJ that can jump 10 times"));
        servicesToBid.add(new Service("Magician who can fly"));
        servicesToBid.add(new Service("Any chef really"));
        servicesToBid.add(new Service("Cameraman"));
        servicesToBid.add(new Service("Italian Chef"));
        servicesToBid.add(new Service("Valet for a night"));
        recyclerViewBox.setHasFixedSize(true);
        recyclerViewBox.setItemAnimator(new DefaultItemAnimator());
        linearLayoutManagerForRecyclerViewBox = new LinearLayoutManager(this);
        recyclerViewBox.setLayoutManager(linearLayoutManagerForRecyclerViewBox);
        serviceBoxListAdapter = new ServiceBoxListAdapter(this, servicesToBid, new ServiceBoxListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Service item){
                recyclerViewBox.setHasFixedSize(true);
            }
        });
        recyclerViewBox.setAdapter(serviceBoxListAdapter);
    }
}
