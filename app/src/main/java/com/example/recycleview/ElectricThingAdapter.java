package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ElectricThingAdapter extends RecyclerView.Adapter<ElectricThingAdapter.ThingViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<ElectricThing> electricThings;

    public ElectricThingAdapter(Context context, ArrayList<ElectricThing> electricThings) {
        layoutInflater = LayoutInflater.from(context);
        this.electricThings = electricThings;
    }

    @NonNull
    @Override
    public ElectricThingAdapter.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.item_recycle_view,parent,false);
        return new ThingViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ElectricThingAdapter.ThingViewHolder holder, int position) {
        ElectricThing electricThing = electricThings.get(position);
        holder.tvName.setText(electricThing.getProductName());
        holder.tvPrice.setText(electricThing.getPrice());
        holder.tvDicount.setText(electricThing.getDiscount());

        holder.imgThing.setImageResource(electricThing.getImgThing());
    }

    @Override
    public int getItemCount() {
        return electricThings.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvPrice, tvDicount;
        ImageView imgThing;

        ElectricThingAdapter electricThingAdapter;
        public ThingViewHolder(@NonNull View itemView, ElectricThingAdapter adapter) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvDicount = itemView.findViewById(R.id.tvDicount);
            imgThing = itemView.findViewById(R.id.imgThing);

            this.electricThingAdapter = adapter;


        }
    }
}
