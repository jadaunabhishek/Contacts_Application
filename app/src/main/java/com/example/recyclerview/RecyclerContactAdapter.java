package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context;
    ArrayList<ContactDatabase>arrContacts;
    RecyclerContactAdapter(Context context, ArrayList<ContactDatabase>arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.contact_row_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgContact.setImageResource(arrContacts.get(position).image);
        holder.txtnumber.setText(arrContacts.get(position).contact);
        holder.txtname.setText(arrContacts.get(position).name);

    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtname, txtnumber;
        ImageView imgContact;
        public ViewHolder(View itemView) {
            super(itemView);
            txtname = itemView.findViewById(R.id.contactname);
            txtnumber = itemView.findViewById(R.id.contactnumber);
            imgContact = itemView.findViewById(R.id.contactimg);
        }
    }
}
