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
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // COMPLETED (1) Create a field to store the weather display TextView
    TextView mWeatherForecast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETED (2) Use findViewById to get a reference to the weather display TextView
        mWeatherForecast = (TextView) findViewById(R.id.tv_weather_data);

        // COMPLETED (3) Create an array of Strings that contain fake weather data
        final String[] weatherForecast = new  String[] {
                "Today - Rain. Min 2°C / Max 8°C",
                "Tomorrow - Rain. Min 1°C / Max 6°C",
                "Monday - Sunny. Min 10°C / Max 16°C",
                "Tuesday - Cloudy. Min 5°C / Max 10°C",
                "Wednesday - Partly Cloudy. Min 8°C / Max 12°C",
                "Thursday - Rain. Min 2°C / Max 6°C",
                "Friday - Thunderstorm. Min 4°C / Max 9°C",
                "Saturday - Thunderstorm. Min 2°C / Max 6°C",
                "Sunday - Cloudy. Min 5°C / Max 11°C",
                "Mon, 20 Nov - Sunny. Min 7°C / Max 12°C",
                "Tue, 21 Nov - Partly Sunny. Min 5°C / Max 10°C",
                "Wed, 22 Nov - Cloudy. Min 4°C / Max 13°C",
                "Thu, 23 Nov - Sunny. Min 1°C / Max 5°C",
                "Fri, 24 Nov - Sunny. Min 2°C / Max 6°C",
                "Sat, 25 Nov - Snow. Min -3°C / Max 2°C",
                "Sun, 26 Nov - Snow. Min -4°C / Max 4°C",
                };

        // COMPLETED (4) Append each String from the fake weather data array to the TextView
        for(String weather : weatherForecast) {
            mWeatherForecast.append(weather + "\n\n\n");
        }
    }
}