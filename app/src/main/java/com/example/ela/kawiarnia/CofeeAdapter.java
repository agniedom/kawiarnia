package com.example.ela.kawiarnia;


import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by student on 2018-01-03.
 */

public class CofeeAdapter extends RecyclerView.Adapter<CofeeAdapter.ViewHolder>  {

    private ArrayList<Cofee> cofees = new ArrayList<>();

    CofeeAdapter(ArrayList<Cofee> cofees) {
        this.cofees = cofees;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(cofees.get(position).getCofeeName());
        holder.setPrice(cofees.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return cofees.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.cofka)
        TextView Cofka;

        @BindView(R.id.price)
        TextView Pricecofki;

        @BindView(R.id.check)
        ImageView Wybrane;

        @OnClick(R.id.btn_wybierzkawke)
        void onClick2(){
            if(Wybrane.getVisibility()==View.INVISIBLE){
                Wybrane.setVisibility(View.VISIBLE);
            }
            else{
                Wybrane.setVisibility(View.INVISIBLE);
            }

        }

        public ViewHolder(View itemView)
        {
            super(itemView);
            ButterKnife.bind(this,itemView);
            Wybrane.setVisibility(View.INVISIBLE);
        }

        private void setName(String Name) {
            Cofka.setText(Name);
        }


        public void setPrice(String price) {
            Pricecofki.setText(price);
        }
    }
}
