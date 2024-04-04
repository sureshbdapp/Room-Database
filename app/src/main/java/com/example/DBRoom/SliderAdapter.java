package com.example.DBRoom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.PagerAdapter;

import com.example.db_room.R;
import com.example.db_room.databinding.RecyclerViewBinding;

public class SliderAdapter extends PagerAdapter {

    Context context;

   // ArrayList<OnboardModel> models;
    LayoutInflater layoutInflater;


    public SliderAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
       return  3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container, final int position) {
        RecyclerViewBinding binding1 = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.recycler_view, container, false);
//        container.addView(binding1.getRoot());
//        binding1.ivOnboardingImage.setImageResource(models.get(position).getImages());
//        binding1.tvWelcome.setText(models.get(position).getText1());
//        binding1.tvOnboard.setText(models.get(position).getText2());

//        Adapter adapter = new Adapter(context);
//       binding1.layoutRecycler.setAdapter(adapter);
        return binding1.getRoot();
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}




