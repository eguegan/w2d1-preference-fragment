package com.example.admin.preferencefragment;

import android.app.FragmentTransaction;
import android.preference.PreferenceFragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fr = getFragmentManager();
        FragmentTransaction ft = fr.beginTransaction();

        ft.add(android.R.id.content, new PrefFrag(), "PREF_FRAGMENT");
        ft.commit();
    }

    public static class PrefFrag extends PreferenceFragment{
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.pref_frag);
        }
    }
}
