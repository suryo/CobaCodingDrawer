package com.suryoatmojo.cobacodingdrawer;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    public EditText celcius,kelvin,farenheit,reamur; //Deklarasi variable
    public Button btn_konversi; //deklarasi varaibel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //celcius = findViewById(R.id.edtxt_celcius);
        //kelvin = findViewById(R.id.edtxt_kelvin);
        //farenheit = findViewById(R.id.edtxt_farenheit);
        //reamur = findViewById(R.id.edtxt_reamur);
        //btn_konversi = findViewById(R.id.btn_konvert);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_menu1,
                R.id.nav_menu2,
                R.id.nav_share)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    //public void konversisuhu (View view){
    //    try{
    //        int ncelcius = Integer.parseInt(celcius.getText().toString());
    //        double nkelvin = ncelcius*273.15;
    //        double nfarenheit = ncelcius*1.8*32;
    //        double nreamur = ncelcius*6.8;
    //        kelvin.setText(String.valueOf(nkelvin));
    //        farenheit.setText(String.valueOf(nfarenheit));
    //        reamur.setText(String.valueOf(nreamur));
    //    }catch (Exception e){
    //        e.printStackTrace();
    //    }
    //}
    public void keluar (View view){
        finish();
    }
}
