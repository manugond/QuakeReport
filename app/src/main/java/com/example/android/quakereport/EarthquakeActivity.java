/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake>earthquakes=QueryUtils.extractEarthquakes();
       /* ArrayList<Earthquake>earthquakes=new ArrayList<Earthquake>();
        earthquakes.add(new Earthquake("San Francisco","16,Feb,2016",7.2));
        earthquakes.add(new Earthquake("London","24,Mar,2016",4.1));
        earthquakes.add(new Earthquake("Tokyo","04,Mar,2017",4.2));
        earthquakes.add(new Earthquake("Mexico City","24,Apr,2016",4.3));
        earthquakes.add(new Earthquake("Moscow","24,Dec,2016",5.4));
        earthquakes.add(new Earthquake("Rio de Janeiro","14,Nov,2015",6.4));
        earthquakes.add(new Earthquake("Paris","02,May,2017",8.4));*/

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
       /* ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    this, android.R.layout.simple_list_item_1, earthquakes);*/
        EarthquakeAdapter adapter=new EarthquakeAdapter(this,earthquakes);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
