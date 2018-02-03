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
import c2kxr.host.adapters.BidListAdapter;
import c2kxr.host.freelancer.Bid;
import c2kxr.host.freelancer.Bid;

public class BidsActivity extends AppCompatActivity {

    private RecyclerView recyclerViewBox;
    private ArrayList<Bid> bids;
    private BidListAdapter serviceBoxListAdapter;
    private LinearLayoutManager linearLayoutManagerForRecyclerViewBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bids);

        recyclerViewBox = findViewById(R.id.recyclerBids);
        bids = new ArrayList<>();
        bids.add(new Bid("Darrin Vaughn"));
        bids.add(new Bid("Clarence Sandoval"));
        bids.add(new Bid("Simon Jackson"));
        bids.add(new Bid("Mindy Gilbert"));
        bids.add(new Bid("Kari Brock"));
        recyclerViewBox.setHasFixedSize(true);
        recyclerViewBox.setItemAnimator(new DefaultItemAnimator());
        linearLayoutManagerForRecyclerViewBox = new LinearLayoutManager(this);
        recyclerViewBox.setLayoutManager(linearLayoutManagerForRecyclerViewBox);
        serviceBoxListAdapter = new BidListAdapter(this, bids, new BidListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Bid item){
                recyclerViewBox.setHasFixedSize(true);
            }
        });
        recyclerViewBox.setAdapter(serviceBoxListAdapter);
    }
}
