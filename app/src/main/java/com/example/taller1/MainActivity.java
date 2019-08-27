package com.example.taller1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import static android.graphics.Color.parseColor;

public class MainActivity extends AppCompatActivity {
    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.window = getWindow();
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                String prymaryDark = "#00701a";
                String primary = "#43a047";
                String background = "#494949";
                cambiarColor(prymaryDark,primary,background);
                ejecutarTOast("se cambio el color");
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                String prymaryDark = "#5c007a";
                String primary = "#8e24aa";
                String background = "#757575";
                cambiarColor(prymaryDark,primary,background);
                ejecutarTOast("se cambio el color");
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                String prymaryDark = "#ab000d";
                String primary = "#e53935";
                String background = "#546e7a";
                cambiarColor(prymaryDark,primary,background);
                ejecutarTOast("se cambio el color");
            }
        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                String prymaryDark = "#1B4F72";
                String primary = "#3498DB";
                String background = "#D5D8DC";
                cambiarColor(prymaryDark,primary,background);
                ejecutarTOast("se cambio el color");
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void cambiarColor(String primaryDark, String primary, String background){
        window.setStatusBarColor(Color.parseColor(primaryDark));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(background)));
        window.setNavigationBarColor(Color.parseColor(primary));
        ejecutarTOast("se cambio el color");
    }

    public void ejecutarTOast(String view){
        Toast notificacion = Toast.makeText(this,view,Toast.LENGTH_LONG);
        notificacion.show();
    }
}
