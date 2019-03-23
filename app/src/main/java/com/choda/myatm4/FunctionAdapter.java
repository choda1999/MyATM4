package com.choda.myatm4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.FunctionHolder> {
    private final String[] atm_items;
    Context context;

    public FunctionAdapter(Context context){
        this.context = context;
        atm_items = context.getResources().getStringArray(R.array.atm_items);
    }

    @NonNull
    @Override
    public FunctionHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,
                viewGroup,false);
        return new FunctionHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull FunctionHolder functionHolder, int i) {
        functionHolder.nameText.setText(atm_items[i]);
    }

    @Override
    public int getItemCount() {
        return atm_items.length;
    }

    public class FunctionHolder extends RecyclerView.ViewHolder {

        private final TextView nameText;

        public FunctionHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(android.R.id.text1);
         }
    }
}
