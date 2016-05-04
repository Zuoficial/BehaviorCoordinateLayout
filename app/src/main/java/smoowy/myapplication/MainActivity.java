package smoowy.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fba =(FloatingActionButton) findViewById(R.id.fab);
        Intent i = new Intent(this,ScrollingActivity.class);
        startActivity(i);
        fba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Calculado chaval", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    }





