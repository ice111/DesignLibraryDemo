package test.com.designlibrarydemo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by guo on 15-7-16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context mContext;
    private static int size = 10;

    public RecyclerViewAdapter(Context context){
        mContext = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private View mView;
        public ViewHolder(View view){
            super(view);
            mView = view;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        View view = holder.mView;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mContext.startActivity(new Intent(mContext, DetailActivity.class));
            }
        });

    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlist_item_card, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public int getItemCount() {
        return size;
    }
}
