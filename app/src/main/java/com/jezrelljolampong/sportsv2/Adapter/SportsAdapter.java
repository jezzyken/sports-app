package com.jezrelljolampong.sportsv2.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jezrelljolampong.sportsv2.Model.Sports;
import com.jezrelljolampong.sportsv2.R;

import java.util.ArrayList;
import java.util.List;

public class SportsAdapter extends RecyclerView.Adapter<SportsAdapter.Holderview> {
    private List<Sports> menulist;
    private Context context;

    public SportsAdapter(List<Sports> menulist, Context context) {
        this.menulist = menulist;
        this.context = context;
    }

    @Override
    public SportsAdapter.Holderview onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item, parent, false);
        return new SportsAdapter.Holderview(layout);
    }

    @Override
    public void onBindViewHolder(SportsAdapter.Holderview holder, final int position) {
        holder.v_name.setText(menulist.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent i = new Intent(view.getContext(), AidInformationActivity.class);
//                i.putExtra("key", menulist.get(position).getName());
//                view.getContext().startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return menulist.size();
    }

    public void setfilter(List<Sports> listitem) {
        menulist = new ArrayList<>();
        menulist.addAll(listitem);
        notifyDataSetChanged();
    }

    class Holderview extends RecyclerView.ViewHolder {
        TextView v_name;

        Holderview(View itemview) {
            super(itemview);

            v_name = (TextView) itemView.findViewById(R.id.itemname);
        }
    }

}
