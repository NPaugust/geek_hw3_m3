package com.example.thridhomework;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView tvContact;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tvContact = itemView.findViewById(R.id.tv_contact);
    }

    public void bind(String numberValue) {
        tvContact.setText(numberValue);
    }
}
