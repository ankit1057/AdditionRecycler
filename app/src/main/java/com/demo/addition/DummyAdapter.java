package com.demo.addition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DummyAdapter extends RecyclerView.Adapter<TestVH> {
    ArrayList<DummyModel> dataset;
    Context context;

    public DummyAdapter(ArrayList<DummyModel> dataset, Context context) {
        this.dataset = dataset;
        this.context = context;
    }

    @NonNull
    @Override
    public TestVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.rec_item,parent,false);
        return new TestVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestVH holder, int position) {
    holder.chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked){
                DummyModel dm=new DummyModel();
                dataset.add(dm);
                notifyDataSetChanged();

            }else{
                dataset.remove(dataset.size()-1);
                notifyDataSetChanged();
            }
        }
    });
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
