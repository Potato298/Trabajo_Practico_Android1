package com.itemscsgo.juan.itemscsgo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WeaponShow extends AppCompatActivity {
    TextView myTv;
    Typeface myFont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_show);
        myTv = (TextView)findViewById(R.id.TextView);
        myFont =Typeface.createFromAsset(this.getAssets(), "fonts/Stratum2-Black.otf");
        myTv.setTypeface(myFont);
    }
}
