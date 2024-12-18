package com.mastercoding.marketapp;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<ItemModel> itemList;
    public static ItemClickListener itemClickListener;


    public ItemAdapter(List<ItemModel> itemList) {
        this.itemList = itemList;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //  responsible for creating new view holders for your items.
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //binds the data from your dataset to the views within the view holder.
        ItemModel item = itemList.get(position);
        holder.imageView.setImageResource(item.getItemImg());
        holder.titleTextView.setText(item.getItemTitle());
        holder.descriptionTextView.setText(item.getItemDescription());
        holder.itemView.setOnClickListener(view -> {
            if (itemClickListener != null) {
                itemClickListener.onClick(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        //returns the total number of items in your dataset.
        return itemList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder
    implements View.OnClickListener{
        //holds the references to the views within each item layout.
        ImageView imageView;
        TextView titleTextView;
        TextView descriptionTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleTextView = itemView.findViewById(R.id.titleTxtView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTxtView);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (itemClickListener != null){
                itemClickListener.onClick(v, getAdapterPosition());
            }
        }
    }
}
