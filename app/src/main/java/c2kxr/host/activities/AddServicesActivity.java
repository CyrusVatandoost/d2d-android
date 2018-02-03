package c2kxr.host.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import c2kxr.host.R;
import c2kxr.host.adapters.ServiceBoxListAdapter;
import c2kxr.host.adapters.ServiceListAdapter;
import c2kxr.host.freelancer.Service;

public class AddServicesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ServiceListAdapter serviceListAdapter;
    private ArrayList<Service> services;
    private LinearLayoutManager linearLayoutManager;

    private RecyclerView recyclerViewBox;
    private ArrayList<Service> servicesToBid;
    private ServiceBoxListAdapter serviceBoxListAdapter;
    private LinearLayoutManager linearLayoutManagerForRecyclerViewBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_services);

        recyclerView = findViewById(R.id.recyclerViewServices);
        services = new ArrayList<>();
        services.add(new Service("DJ"));
        services.add(new Service("Bartender"));
        services.add(new Service("Caterer"));
        services.add(new Service("Magician"));
        services.add(new Service("Bartender"));
        services.add(new Service("Caterer"));
        services.add(new Service("DJ"));
        services.add(new Service("Bartender"));
        services.add(new Service("Caterer"));
        services.add(new Service("DJ"));
        services.add(new Service("Bartender"));
        services.add(new Service("Caterer"));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        serviceListAdapter = new ServiceListAdapter(this,services, new ServiceListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Service item){
                Intent intent = new Intent(AddServicesActivity.this,c2kxr.host.activities.AddServiceActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(serviceListAdapter);

        recyclerViewBox = findViewById(R.id.recyclerBoxViewServices);
        servicesToBid = new ArrayList<>();
        servicesToBid.add(new Service("DJ that can jump 10 times"));
        servicesToBid.add(new Service("Magician who can fly"));
        servicesToBid.add(new Service("Any chef really"));
        servicesToBid.add(new Service("DJ who can play Tropical House EDM"));
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

        findViewById(R.id.btnPostEvent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddServicesActivity.this, EventActivity.class));
            }
        });

    }
}
