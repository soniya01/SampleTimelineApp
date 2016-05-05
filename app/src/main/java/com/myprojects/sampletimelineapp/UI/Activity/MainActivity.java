package com.myprojects.sampletimelineapp.UI.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.myprojects.sampletimelineapp.R;
import com.myprojects.sampletimelineapp.UI.Adapter.CustomBaseAdapter;
import com.myprojects.sampletimelineapp.UI.Model.Travel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView tripListView;
    private TextView tripTitle;
    private List<Travel> travelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tripListView = (ListView)findViewById(R.id.activity_trip_vacation_listView);
        tripTitle = (TextView)findViewById(R.id.activity_trip_textView_title);

        tripListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        setDummyTravelEventData();
        CustomBaseAdapter baseAdapter = new CustomBaseAdapter(this, travelList);
        tripListView.setAdapter(baseAdapter);

        tripListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // if event view is sclicked then change the visisbilty of the text views with animation
            }
        });

    }

    public void setDummyTravelEventData(){

        Travel travel1 = new Travel("FLIGHT TO AMSTERDAM","FLIGHT", "14/7", "", null, null, null);
        Travel travel2 = new Travel("","", "14/7", "HAGUE", "ART, CENTER", "15:00", "17:00");
        Travel travel3 = new Travel("RIDE TO MUSEUM","TAXI", "14/7", "", null, null, null);
        Travel travel4 = new Travel("","", "14/7", "CULTURAL VISIT", "ART, CULTURE CENTER", "17:00", "17:30");
        Travel travel5 = new Travel("FLIGHT TO AMSTERDAM","FLIGHT", "14/7", "", null, null, null);
        Travel travel6 = new Travel("","", "14/7", "HAGUE", "ART, CENTER", "19:00", "20:00");

        this.travelList.add(travel1);
        this.travelList.add(travel2);
        this.travelList.add(travel3);
        this.travelList.add(travel4);
        this.travelList.add(travel5);
        this.travelList.add(travel6);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
