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
import c2kxr.host.freelancer.Service;

/**
 * Created by user on 3 Feb 2018.
 */

public class ServiceListAdapter extends RecyclerView.Adapter<ServiceListAdapter.ServicesViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Service item);
    }

    private ArrayList<Service> services;
    private final ServiceListAdapter.OnItemClickListener listener;
    private Context context;

    public ServiceListAdapter(Context context, ArrayList<Service> services, OnItemClickListener listener) {
        this.context = context;
        this.services = services;
        this.listener = listener;
    }

    @Override
    public ServicesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_service_circle, parent,false);
        ServicesViewHolder holder = new ServicesViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ServicesViewHolder holder, int position) {
        Service service = services.get(position);
        holder.txtServiceName.setText(service.getServiceName());
        holder.bind(service, listener);
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    class ServicesViewHolder extends RecyclerView.ViewHolder {

        private TextView txtServiceName;

        public ServicesViewHolder(View itemView) {
            super(itemView);
            txtServiceName =  itemView.findViewById(R.id.txtServiceName);
        }

        public void bind(final Service item, final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

}
