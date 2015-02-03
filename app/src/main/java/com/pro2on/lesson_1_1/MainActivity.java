package com.pro2on.lesson_1_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

import com.pro2on.lesson_1_1.model.DeviceInformationModel;
import com.pro2on.lesson_1_1.model.ModelFactory;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        TableLayout tableLayout = ModelFactory.getInstance().getDeviceInformationModel().getInformationAsTableLayout(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        linearLayout.addView(tableLayout);

    }


}
