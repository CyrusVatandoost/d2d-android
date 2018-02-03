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
import c2kxr.host.classes.Template;

/**
 * Created by Kristian on 2/3/2018.
 */

public class TemplateListAdapter extends RecyclerView.Adapter<TemplateListAdapter.TemplateListViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Template item);
    }

    private ArrayList<Template> temps;
    private OnItemClickListener listener;
    private Context context;

    public TemplateListAdapter(Context context, ArrayList<Template> temps, TemplateListAdapter.OnItemClickListener listener) {
        this.context = context;
        this.temps = temps;
        this.listener = listener;
    }
    @Override

    public TemplateListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_event_template,parent,false);
        TemplateListAdapter.TemplateListViewHolder holder = new TemplateListAdapter.TemplateListViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(TemplateListViewHolder holder, int position) {
        Template template = temps.get(position);
        //holder.templateImage.setImageDrawable(template.getTemplateImage());
        holder.templateName.setText(template.getTemplateName());
        holder.bind(template, listener);
    }

    @Override
    public int getItemCount() {
        return temps.size();
    }

    class TemplateListViewHolder extends RecyclerView.ViewHolder {

        private ImageView templateImage;
        private TextView templateName;

        public TemplateListViewHolder(View itemView) {
            super(itemView);

            //eventImage = itemView.findViewById(R.id.eventImage);
            templateImage =  itemView.findViewById(R.id.templateImage);
            templateName =  itemView.findViewById(R.id.templateName);
        }

        public void bind(final Template item, final TemplateListAdapter.OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
