package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
    }

    private void getDataFromInternet(){

        namaMakanan.add("Empal Gentong \nRp.25000");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/07/Empal-Gentong-Khas-Indonesia.jpg");
        infoMakanan.add("Berisi daging yang biasanya berupa usus, babat, dan dagingnya sendiri akan dimasukkan pada gentong dan hasil akhirnya adalah olahan bertekstur empuk.");

        namaMakanan.add("Ayam Geprek Keju\nRp.15000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2019/07/Ayam-Geprek.jpg");
        infoMakanan.add("Ayam geprek yang di baluri dengan keju.");

        namaMakanan.add("Sate Taichan \nRp.20000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2018/01/Sate-Taichan-Copy.jpg");
        infoMakanan.add("Sate taichan adalah sate yang dagingnya sudah dibumbui sebelum dibakar, jadi bumbu dibiarkan meresap lebih dulu sebelum diolah. Lalu setelah daging sate matang, biasanya sate taichan disajikan dengan nasi dan sambal khas khusus sate taichan yang pedas sekali.");

        namaMakanan.add("Soto \nRp.10000");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/I64greOaLc.jpg");
        infoMakanan.add("Soto adalah kuliner khas nusantara berupa hidangan berkuah yang terbuat dari kaldu daging dan sayuran.");

        namaMakanan.add("Salted Egg Chicken \nRp.15000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2018/01/062817-KNORR-SG-SaltedEggPowder068_thumbnail_41_1.1.130_658X1170.jpg");
        infoMakanan.add("makanan ini mengandung telur asin. Jadi, si ayamnya itu dibuat seperti ayam karaage (bite-size fried chicken), lalu ditumis lagi menggunakan saus telur asin.");

        namaMakanan.add("Nasi Goreng \nRp.20000");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/07/Nasi-Goreng-Khas-Indonesia.jpg");
        infoMakanan.add(" Nasi yang di goreng dengan isian seperti telur, ayam, kerupuk, irisan mentimun, irisan sosis, ikan asin, dan masih banyak lagi, tergantung selera.");

        namaMakanan.add(" Ayam Goreng \nRp.15000");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/07/Ayam-Goreng-Khas-Indonesia.jpg");
        infoMakanan.add("Ayam goreng yang digoreng dengan bumbu yang sangat khas sehingga membuat ayam terasa renyah dan gurih.");

        namaMakanan.add(" Bakmi \nRp.15000");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/07/Bakmi-Khas-Indonesia.jpg");
        infoMakanan.add("bakmi yang diolah dengan bumbu khas nusantara beserta bahan-bahan yang juga mudah ditemui di Indonesia, seperti ayam dan sayuran sawi.");


        prosesRecyclerViewAdapter();
    }
}