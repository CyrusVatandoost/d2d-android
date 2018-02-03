package c2kxr.host.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import c2kxr.host.R;
import c2kxr.host.classes.Event;
import c2kxr.host.freelancer.Bid;

/**
 * Created by user on 3 Feb 2018.
 */

public class BidListAdapter extends RecyclerView.Adapter<BidListAdapter.BidListViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Bid item);
    }

    private ArrayList<Bid> bids;
    private final BidListAdapter.OnItemClickListener listener;
    private Context context;

    public BidListAdapter(Context context, ArrayList<Bid> bids, BidListAdapter.OnItemClickListener listener) {
        this.context = context;
        this.bids = bids;
        this.listener = listener;
    }

    @Override
    public BidListAdapter.BidListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_bid_box, parent,false);
        BidListAdapter.BidListViewHolder holder = new BidListAdapter.BidListViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BidListAdapter.BidListViewHolder holder, int position) {
        Bid bid = bids.get(position);
        holder.bidUsername.setText(bid.getName());
        holder.bind(bid, listener);
    }

    @Override
    public int getItemCount() {
        return bids.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    class BidListViewHolder extends RecyclerView.ViewHolder {

        private TextView bidUsername;

        public BidListViewHolder(View itemView) {
            super(itemView);
            bidUsername = itemView.findViewById(R.id.txtBidUsername);
        }

        public void bind(final Bid item, final BidListAdapter.OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
