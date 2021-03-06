package com.example.zahid.mzahidsyafnel_1202154196_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button x ;
    private RadioGroup y;
    private RadioButton z,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mensetting toolbar yang akan muncul di atas dengan nama Rumah Makan Sederhana Padang Resto
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbarmain);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Rumah Makan Sederhana Padang");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //melakukan inisiasi berdasarkan id yang ada di layout mulai dari button samapai radio button

        x = (Button) findViewById(R.id.pesan);

        y = (RadioGroup) findViewById(R.id.pilihmenu);

        z = (RadioButton) findViewById(R.id.dine);

        f = (RadioButton) findViewById(R.id.take);
    }

    //jika kita memasang onclick pada button dan agar dapat membuat tombol mempunyai aksi
    public void pesan(View view) {

        y = (RadioGroup) findViewById(R.id.pilihmenu);

        z = (RadioButton) findViewById(R.id.dine);

        f = (RadioButton) findViewById(R.id.take);

    }

    public void pilih(View view) {

        // agar radio button dapat di pilih
        int selecteditem = y.getCheckedRadioButtonId();

        //jika yang dpilih adalah Dine In dan akan muncul toast yang beriikan anda memilih dine in
        if (selecteditem == z.getId()){
            Toast.makeText(this,"Anda Memilih Dine In",Toast.LENGTH_LONG).show();

            //membuat intent yang mengarah ke DineIn.class
            Intent a = new Intent(MainActivity.this,DineIn.class);
            startActivity(a);
        }
        else if (selecteditem == f.getId()){
            Toast.makeText(this,"Anda Memilih Take Away",Toast.LENGTH_LONG).show();

            //membuat intent yang mengarah ke TakeAway.class
            Intent a = new Intent(MainActivity.this,TakeAway.class);
            startActivity(a);
        }

    }

    public void pilihpemesanan(View view) {
       //mengecek button memilih pemesananan
        boolean checked = ((RadioButton) view).isChecked();

      //mengecek button apa yg di klik
        switch(view.getId()) {
            case R.id.take:
                if (checked)
                    //method untuk menampikan pesan dan pindah layout ke TakeAway
                    take();
                    break;
            case R.id.dine:
                if (checked)
                    //method untuk menampikan pesan dan pindah layout ke Dine In
                    dine();
                    break;
        }
    }

    private void dine() {
        //Untuk menampilkan pesan
        Toast.makeText(this,"Anda Memilih Dine In",Toast.LENGTH_LONG).show();
        //Untuk pindah layout
        Intent a = new Intent(MainActivity.this,DineIn.class);
        startActivity(a);
    }

    private void take() {
        Toast.makeText(this,"Anda Memilih Take Away",Toast.LENGTH_LONG).show();
        Intent a = new Intent(MainActivity.this,TakeAway.class);
        startActivity(a);
    }
}
