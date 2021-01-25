package com.jezrelljolampong.sportsv2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jezrelljolampong.sportsv2.BadmintonActivity;
import com.jezrelljolampong.sportsv2.BasketballActivity;
import com.jezrelljolampong.sportsv2.BookmarkActivity;
import com.jezrelljolampong.sportsv2.FootballActivity;
import com.jezrelljolampong.sportsv2.Model.Menus;
import com.jezrelljolampong.sportsv2.R;
import com.jezrelljolampong.sportsv2.TennisActivity;
import com.jezrelljolampong.sportsv2.VideoOfflineActivity;
import com.jezrelljolampong.sportsv2.VideoOnlineActivity;
import com.jezrelljolampong.sportsv2.VoleyballActivity;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.Holderview> {
    private List<Menus> menulist;
    private Context context;

    public MenuAdapter(List<Menus> menulist, Context context) {
        this.menulist = menulist;
        this.context = context;
    }

    @Override
    public Holderview onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.menu_item, parent, false);
        return new Holderview(layout);
    }

    @Override
    public void onBindViewHolder(Holderview holder, final int position) {
        holder.v_name.setText(menulist.get(position).getName());
        holder.v_image.setImageResource(menulist.get(position).getPhoto());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (menulist.get(position).getName().equals("Badminton")) {
                    Intent i = new Intent(view.getContext(), BadmintonActivity.class);
                    view.getContext().startActivity(i);

                }else if (menulist.get(position).getName().equals("Basketball")){
                    Intent i = new Intent (view.getContext(), BasketballActivity.class);
                    view.getContext().startActivity(i);
                }
                else if (menulist.get(position).getName().equals("Football")){
                    Intent i = new Intent (view.getContext(), FootballActivity.class);
                    view.getContext().startActivity(i);
                }
                else if (menulist.get(position).getName().equals("Tennis")){
                    Intent i = new Intent (view.getContext(), TennisActivity.class);
                    view.getContext().startActivity(i);
                }
                else if (menulist.get(position).getName().equals("Voleyball")){
                    Intent i = new Intent (view.getContext(), VoleyballActivity.class);
                    view.getContext().startActivity(i);
                }
                else if (menulist.get(position).getName().equals("Bookmarks")){
                    Intent i = new Intent (view.getContext(), BookmarkActivity.class);
                    view.getContext().startActivity(i);
                }else if (menulist.get(position).getName().equals("Offline Videos")){
                    Intent i = new Intent (view.getContext(), VideoOfflineActivity.class);
                    view.getContext().startActivity(i);
                }
                else if (menulist.get(position).getName().equals("Online Videos")){
                    Intent i = new Intent (view.getContext(), VideoOnlineActivity.class);
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