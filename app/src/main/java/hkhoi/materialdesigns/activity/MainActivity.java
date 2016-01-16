package hkhoi.materialdesigns.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import hkhoi.materialdesigns.R;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        intent = null;
        switch (view.getId()) {
            case R.id.main_button_toolbar:
                intent = new Intent(this, ToolbarActivity.class);
                break;
            case R.id.main_button_customToolbar:
                intent = new Intent(this, CustomToolbarActivity.class);
                break;
            case R.id.main_button_navigationDrawer:
                intent = new Intent(this, NavigationDrawerActivity.class);
                break;
            default:
                Toast.makeText(this, "Not implemented yet!", Toast.LENGTH_SHORT).show();
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
