package com.example.zahid.mzahidsyafnel_1202154196_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    private TextView x,y,z;
    private ImageView f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        //melakukan insiasi pada id nya

        x = (TextView) findViewById(R.id.namamakanan);

        y = (TextView) findViewById(R.id.harga);

        z = (TextView) findViewById(R.id.komposisi);

        f = (ImageView) findViewById(R.id.gambar);

        //mensetting toolbar yang akan muncul di atas dengan nama List Makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_detail);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Detail Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent c = getIntent();

        String menu = c.getStringExtra("judul");
        String hrga = c.getStringExtra("harga");
        String kmposisi= c.getStringExtra("komposisi");
        Integer gmbr = c.getIntExtra("gambar",0);

        //melakukan mensetting text maupun setImageResource untuk data yang sudah di bawa dari layout sebelumnya
        x.setText(menu);
        y.setText(hrga);
        z.setText(kmposisi);
        f.setImageResource(gmbr);
    }
}
