package com.demo.addition;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class TestVH extends RecyclerView.ViewHolder {
    TextView game;
    EditText name;
    CheckBox chk;
    public TestVH(@NonNull View itemView) {
        super(itemView);
        game=itemView.findViewById(R.id.tvGame);
        name=itemView.findViewById(R.id.etName);
        chk=itemView.findViewById(R.id.chk);
    }
}
