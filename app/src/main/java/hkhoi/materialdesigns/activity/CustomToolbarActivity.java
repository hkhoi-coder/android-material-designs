package hkhoi.materialdesigns.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import hkhoi.materialdesigns.R;

public class CustomToolbarActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);

        initViews();
    }

    private void initViews() {
        toolbar = (Toolbar) findViewById(R.id.activity_customToolbar_usage);
    }

    private void setUpActionBar() {
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
