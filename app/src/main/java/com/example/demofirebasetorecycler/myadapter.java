package com.example.demofirebasetorecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model)
    {
       holder.address.setText(model.getAddress());

       holder.name.setText(model.getName());
       holder.password.setText(model.getPassword());



    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
       return new myviewholder(view);
    }

    static class myviewholder extends RecyclerView.ViewHolder
    {

        TextView address,name,password;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);

            address=(TextView)itemView.findViewById(R.id.addressltext);

            name=(TextView)itemView.findViewById(R.id.nametext);

            password=(TextView)itemView.findViewById(R.id.password);

        }
    }

}
