package hkhoi.materialdesigns.activity;

import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import de.hdodenhof.circleimageview.CircleImageView;
import hkhoi.materialdesigns.R;

public class NavigationDrawerActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private Toolbar mToolbar;
    private ActionBar mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        initViews();
        setUpNavigationDrawer();
    }

    private void initViews() {
        mToolbar = (Toolbar) findViewById(R.id.navigation_toolbar_usage);
        mNavigationView = (NavigationView) findViewById(R.id.navigation_view);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    private void setUpNavigationDrawer() {
        setupActionBar();
        setUpDrawerLayout();
    }

    private void setupActionBar() {
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);
        mActionBar.setHomeButtonEnabled(true);
    }

    private void setUpDrawerLayout() {
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                /* TODO: WHEN THE NAVIGATION DRAWER IS OPENED */
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                /* TODO: WHEN THE NAVIGATION DRAWER IS CLOSED */
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerToggle.syncState();

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                /* TODO: WHEN AN ITEM IN NAVIGATION DRAWER IS CLICKED */
                if (!item.isChecked()) {
                    /* TODO: INSERT SWITCH CASES INTO NAVIGATION DRAWER  */
                    mDrawerLayout.closeDrawers();
                    item.setChecked(true);
                }
                return false;
            }
        });
    }
}
