package c2kxr.host.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import c2kxr.host.R;
import c2kxr.host.classes.Event;

/**
 * Created by Kristian on 2/3/2018.
 */

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventsViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Event item);
    }

    private ArrayList<Event> events;
    private final OnItemClickListener listener;
    private Context context;

    public EventListAdapter(Context context, ArrayList<Event> events, OnItemClickListener listener) {
        this.context = context;
        this.events = events;
        this.listener = listener;
    }

    @Override
    public EventsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_my_event, parent,false);
        EventsViewHolder holder = new EventsViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(EventsViewHolder holder, int position) {
        Event event = events.get(position);
        holder.eventTitle.setText(event.getEventName());
        holder.eventOwner.setText(event.getEventOwner());
        holder.eventDate.setText(event.getEventDate());
        holder.bind(event, listener);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    class EventsViewHolder extends RecyclerView.ViewHolder {

        private ImageView eventImage;
        private TextView eventTitle;
        private TextView eventOwner;
        private TextView eventDate;

        public EventsViewHolder(View itemView) {
            super(itemView);

            //eventImage = itemView.findViewById(R.id.eventImage);
            eventTitle =  itemView.findViewById(R.id.eventTitle);
            eventOwner =  itemView.findViewById(R.id.eventOwner);
            eventDate = itemView.findViewById(R.id.eventDate);
        }

        public void bind(final Event item, final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
