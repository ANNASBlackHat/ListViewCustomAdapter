package com.learning.annasblackhat.listviewcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;

/**
 * Created by annasblackhat on 10/29/15.
 */
public class AdapterListView extends BaseAdapter {

    private List<Penerbangan> list;
    private Context ctx;
    //To get Concurency Format
    private NumberFormat num = NumberFormat.getInstance();

    public AdapterListView(List<Penerbangan> list, Context ctx) {
        this.list = list;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflate = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflate.inflate(R.layout.list_item,  null);
        TextView maskapai = (TextView)v.findViewById(R.id.nama_maskapai);
        TextView kotaAsal = (TextView)v.findViewById(R.id.kota_asal);
        TextView kotaTujuan = (TextView)v.findViewById(R.id.kota_asal);
        TextView jamBerangkat = (TextView)v.findViewById(R.id.jam_brangkat);
        TextView jamSampai = (TextView)v.findViewById(R.id.jam_sampai);
        TextView harga =  (TextView)v.findViewById(R.id.harga);

        maskapai.setText(list.get(position).getMaskapai());
        kotaAsal.setText(list.get(position).getKotaAsal());
        kotaTujuan.setText(list.get(position).getKotaTujuan());
        jamBerangkat.setText(list.get(position).getJamBerangkat());
        jamSampai.setText(list.get(position).getJamSampai());
        harga.setText("Rp "+num.format(list.get(position).getHarga()));

        return v;
    }
}


