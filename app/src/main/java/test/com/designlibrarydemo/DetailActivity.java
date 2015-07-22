package test.com.designlibrarydemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by guo on 15-7-20.
 */
public class DetailActivity extends AppCompatActivity{

    private Toolbar mToolbar;
    private CollapsingToolbarLayout mCollToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        mCollToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);

        setSupportActionBar(mToolbar);
        mCollToolbarLayout.setTitle("design");
    }
}
