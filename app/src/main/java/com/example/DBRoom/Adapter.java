package com.example.DBRoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.db_room.R;
import com.example.db_room.databinding.CounterLayoutBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    CounterLayoutBinding binding;
    Context context;
//    ButtonClick buttonClick;
//    ArrayList<Model> arrayList;
    public Adapter(Context context) {
        this.context = context;
//        this.arrayList = arrayList;
//        this.buttonClick = buttonClick;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.counter_layout, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        //viewHolder.setData(arrayList.get(position));
        ;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CounterLayoutBinding binding;

        public ViewHolder(@NonNull CounterLayoutBinding mBinding) {
            super(mBinding.getRoot());
            binding = mBinding;
        }

       // @SuppressLint("NotifyDataSetChanged")
//        void setData(Model model) {
//            binding.valueText.setText(String.valueOf(model.getValue()));
//            binding.plusBtn.setOnClickListener(v -> {
//                int count = Integer.parseInt(binding.valueText.getText().toString());
//                count = count + 1;
//                arrayList.set(getAdapterPosition(), new Model(count));
//                binding.valueText.setText(String.valueOf(count));
//            });
//            binding.minusBtn.setOnClickListener(v -> {
//                int count = Integer.parseInt(binding.valueText.getText().toString());
//                if (count<=0){
//                    count =0;
//                }else{
//                    count = count-1;
//                }
//                arrayList.set(getAdapterPosition(), new Model(count));
//                binding.valueText.setText(String.valueOf(count));
//            });
//
//            binding.printOnTopText.setOnClickListener(v -> {
//                buttonClick.onCLick(Integer.parseInt(binding.valueText.getText().toString()));
//            });
//
//        }
    }

    interface ButtonClick {
        void onCLick(int value);
    }
}
