package com.learning.annasblackhat.listviewcustomadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<Penerbangan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listview);

        //Setting value of List<>
        //List<> is a Collection
        for(int i=0; i<data.length; i++){
            Penerbangan p = new Penerbangan();
            p.setMaskapai(data[i][0]);
            p.setKotaAsal(data[i][1]);
            p.setJamBerangkat(data[i][2]);
            p.setKotaTujuan(data[i][3]);
            p.setJamSampai(data[i][4]);
            p.setHarga(Integer.parseInt(data[i][5]));
            list.add(p);
        }

        listView.setAdapter(new AdapterListView(list, MainActivity.this));

        //set action when item of listview clicked by user
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Use INTENT to call another Activity Class
                Intent intent = new Intent(MainActivity.this, PenerbanganDetail.class);
                //Embedded data
                intent.putExtra(PenerbanganDetail.KET_DATA, list.get(position));
                //Show Activity
                startActivity(intent);
            }
        });
    }

    private String[][] data = new String[][]{
            {"Air Asia","Yogyakarta","08.50","Jakarta","10.20","650000"},
            {"Batik","Yogyakarta","06.30","Jakarta","8.20","805000"},
            {"Lion","Yogyakarta","15.10","Jakarta","17.30","766000"},
            {"Sriwijaya","Yogyakarta","12.30","Jakarta","14.30","945000"},
            {"Garuda","Yogyakarta","09.00","Jakarta","10.50","115000"},
            {"Air Asia","Yogyakarta","08.50","Jakarta","10.20","650000"},
            {"Batik","Yogyakarta","06.30","Jakarta","8.20","805000"},
            {"Lion","Yogyakarta","15.10","Jakarta","17.30","766000"},
            {"Sriwijaya","Yogyakarta","12.30","Jakarta","14.30","945000"},
            {"Garuda","Yogyakarta","09.00","Jakarta","10.50","115000"},
            {"Air Asia","Yogyakarta","08.50","Jakarta","10.20","650000"},
            {"Batik","Yogyakarta","06.30","Jakarta","8.20","805000"},
            {"Lion","Yogyakarta","15.10","Jakarta","17.30","766000"},
            {"Sriwijaya","Yogyakarta","12.30","Jakarta","14.30","945000"},
            {"Garuda","Yogyakarta","09.00","Jakarta","10.50","115000"},
    };

}
