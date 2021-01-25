package com.jezrelljolampong.sportsv2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jezrelljolampong.sportsv2.Model.Menus;
import com.jezrelljolampong.sportsv2.OfflineVideoInformation;
import com.jezrelljolampong.sportsv2.R;

import java.util.ArrayList;
import java.util.List;

public class OfflineVideoAdapter extends RecyclerView.Adapter<OfflineVideoAdapter.Holderview> {
    private List<Menus> menulist;
    private Context context;

    public OfflineVideoAdapter(List<Menus> menulist, Context context) {
        this.menulist = menulist;
        this.context = context;
    }

    @Override
    public OfflineVideoAdapter.Holderview onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.offline_video, parent, false);
        return new OfflineVideoAdapter.Holderview(layout);
    }

    @Override
    public void onBindViewHolder(OfflineVideoAdapter.Holderview holder, final int position) {
        holder.v_name.setText(menulist.get(position).getName());
        holder.v_image.setImageResource(menulist.get(position).getPhoto());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (menulist.get(position).getName().equals("Basketball Overview")){
                    Intent i = new Intent (view.getContext(), OfflineVideoInformation.class);
                    i.putExtra("key", menulist.get(position).getName());
                    view.getContext().startActivity(i);
                }else if (menulist.get(position).getName().equals("Badminton Overview")){
                    Intent i = new Intent (view.getContext(), OfflineVideoInformation.class);
                    i.putExtra("key", menulist.get(position).getName());
                    view.getContext().startActivity(i);
                }
                else if (menulist.get(position).getName().equals("Football Overview")){
                    Intent i = new Intent (view.getContext(), OfflineVideoInformation.class);
                    i.putExtra("key", menulist.get(position).getName());
                    view.getContext().startActivity(i);
                }
                else if (menulist.get(position).getName().equals("Volleyball Overview")){
                    Intent i = new Intent (view.getContext(), OfflineVideoInformation.class);
                    i.putExtra("key", menulist.get(position).getName());
                    view.getContext().startActivity(i);
                }
                else if (menulist.get(position).getName().equals("Tennis Overview")){
                    Intent i = new Intent (view.getContext(), OfflineVideoInformation.class);
                    i.putExtra("key", menulist.get(position).getName());
                    view.getContext().startActivity(i);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return menulist.size();
    }

    public void setfilter(List<Menus> listitem) {
        menulist = new ArrayList<>();
        menulist.addAll(listitem);
        notifyDataSetChanged();
    }

    class Holderview extends RecyclerView.ViewHolder {
        ImageView v_image;
        TextView v_name;

        Holderview(View itemview) {
            super(itemview);
            v_image = (ImageView) itemview.findViewById(R.id.picture_name);
            v_name = (TextView) itemView.findViewById(R.id.menu_name);
        }
    }
}