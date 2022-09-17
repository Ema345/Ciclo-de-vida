package com.example.a;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ciclo_Actividad", "Etapa OnCreate()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Etapa onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo_Actividad", "Etapa OnRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo_Actividad", "Etapa OnStart()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Etapa onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo_Actividad", "Etapa OnResume()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Etapa onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo_Actividad", "Etapa OnPause()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Etapa onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo_Actividad", "Etapa OnStop()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Etapa onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo_Actividad", "Etapa OnDestroy()");
    }
}