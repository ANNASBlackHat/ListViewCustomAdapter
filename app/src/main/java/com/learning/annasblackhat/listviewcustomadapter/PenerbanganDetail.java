package com.learning.annasblackhat.listviewcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.NumberFormat;

public class PenerbanganDetail extends AppCompatActivity {

    public static final String KET_DATA = "penerbangan";
    private NumberFormat num = NumberFormat.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penerbangan_detail);

        TextView maskapai = (TextView)findViewById(R.id.nama_maskapai);
        TextView kotaAsal = (TextView)findViewById(R.id.kota_asal);
        TextView kotaTujuan = (TextView)findViewById(R.id.kota_tujuan);
        TextView jamBrangkat = (TextView)findViewById(R.id.jam_brangkat);
        TextView jamSampai = (TextView)findViewById(R.id.jam_sampai);
        TextView hrg = (TextView)findViewById(R.id.harga);

        //Getting data from previous class that called this class through Inten
        Penerbangan p  = (Penerbangan) getIntent().getSerializableExtra(KET_DATA);

        //Setting textView
        maskapai.setText(p.getMaskapai());
        kotaAsal.setText(p.getKotaAsal());
        kotaTujuan.setText(p.getKotaTujuan());
        jamBrangkat.setText(p.getJamBerangkat());
        jamSampai.setText(p.getJamSampai());
        hrg.setText(num.format(p.getHarga()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_penerbangan_detail, menu);
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
