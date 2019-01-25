package com.example.ux32vd.tugasrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Menu> listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMenu = new ArrayList<>();
        listMenu.add(new Menu("Pistol", "Senjata Api Laras Pendek / Handgun", "Pistol ini masuk kategori Semi-Automatic atau orang kita menyebutnya dengan istilah Pistol FN. Umumnya berbentuk sudut kotak dengan laras berada di dalam sebuah bagian yang dapat maju-mundur yang disebut slide. Peluru atau amunisi ditempat di dalam sebuah magazen yang berada di dalam genggaman / grip pistol.\n" +
                "\n" +
                "Pistol semi-otomatis yang banyak beredar memiliki kaliber 9 mm, baik yang digunakan oleh Pihak Berwenang maupun di kalangan militer di medan tempur.",R.drawable.pistol));
        listMenu.add(new Menu("Assault Rifle", "Senapan / Rifle", "Senapan Serbu adalah senjata api laras panjang yang kompak/ sederhana, memiliki pilihan tembakan / selective-fire, yang dapat memuntahkan peluru berkekuatan sedang. Senapan serbu digunakan oleh militer untuk melakukan peperangan atau pertempuran. Bukan hanya dalam bentuk penyerbuan, namun juga senapan jenis ini digunakan untuk pertahanan.\n" +
                "Ciri fisik umum senapan serbu adalah adanya magasen yang berisi peluru dalam jumlah banyak tergantung tipe, biasanya antara 20 hingga 30 butir tiap magasen. Ada pilihan tembakan dengan mode satu-satu, tembakan tiga-tiga atau tembakan rentetan.\n" +
                "Kecepatan memuntahkan peluru / rate of fire antara satu tipe dengan tipe lain saling berbeda, namun pada umumnya senapan serbu ini dapat memuntahkan peluru sebanyak 700-950 butir per menit.\n" +
                "Dalam hal kaliber, ada bermacam ukuran. Dunia militer membagi dua besar kaliber berdasarkan negara-negara penggunanya, yaitu negara blok barat yang disebut standard NATO dan blok timur atau negara Pakta Warsawa.",R.drawable.assaultrifle));
        listMenu.add(new Menu("Carbine Rifle", "Senapan / Rifle", "Carbine diadopsi dari bahasa Perancis Carabine. Karbin adalah versi pendek dari sebuah Senjata Api laras panjang. Dengan mempertahankan body utama dan kaliber amunisi dari senjata versi full-length-nya, karbin menggunakan laras yang lebih pendek. Karena digunakan hanya untuk kepentingan pertahanan individu personil, sehingga tidak dibutuhkan kemampuan untuk menembak jarak jauh.\n" +
                "Faktor kepraktisan dan bobot yang lebih ringan menjadi pertimbangan diciptakannya senjata jenis karbin ini. Umumnya senjata ini disandang oleh personil garis belakang, tenaga administrasi dan satuan bantuan tempur lain. Namun karena kepraktisannya, tidak jarang karbin juga digunakan oleh komandan peleton yang memandang perlu membawa senjata laras panjang namun tidak sepanjang senjata yang dibawa oleh anak buahnya.",R.drawable.rifle));
        listMenu.add(new Menu("Shotgun", "Senapan / Rifle", "Shotgun adalah jenis senjata api laras panjang yang digunakan oleh militer maupun sipil. Digunakan pada masa perang maupun untuk berburu.\n" +
                "\n" +
                "Kekhasan dari Shotgun adalah proyektil amunisi yang akan pecah berbentuk butir-butir bola kecil saat dimuntahkan dari moncong laras. Butiran tersebut membentuk rangkaian peluru-peluru kecil dengan sebaran cukup besar untuk dapat mengenai sebuah target. sehingga target yang kecil atau target begerak akan dengan mudah dikenai oleh rangkaian butir-butir amunisi shotgun.",R.drawable.shotgun));
        listMenu.add(new Menu("SMG", "Full-Automatic Gun", "Senjata jenis ini biasanya berbentuk kompak, berlaras pendek serta ada wadah amunisi (magazen) yang menancap pada body utama senjata. Senjata tipe ini digunakan untuk pertempuran jarak dekat dan memiliki kaliber mirip dengan kaliber yang dimiliki pistol. Umumnya menggunakan amunisi kaliber 9x19 mm.\n" +
                "Senjata ini banyak digunakan oleh pasukan khusus, pasukan pengawal VVIP, polisi khusus dan para komandan peleton di lapangan.\n" +
                "Yang paling menjadi legenda dari senjata jenis ini adalah dari merk Thompson atau biasa dipanggil Tommy Gun, UZI buatan Israel dan MP5 produk unggulan Jerman yang dipakai oleh hampir seluruh pasukan khusus di dunia saat ini.",R.drawable.smg));
        listMenu.add(new Menu("Sniper Rifle", "Senapan / Rifle", "Senapan Sniper adalah senjata api laras panjang berakurasi/ berpresisi tinggi. Senjata ini dirancang untuk dapat mengenai sasaran secara presisi di titik yang dituju pada jarak yang jauh, baik sasaran statis maupun dinamis hanya dalam satu kali tembakan. \n" +
                "\n" +
                "Istilah Sniper sendiri diambil dari nama sebuah burung Snipe yang sering hinggap di rawa-rawa atau lumpur untuk mencari makan tapi sulit untuk diburu atau ditembak.\n" +
                "\n" +
                "Beberapa tipe senapan runduk yang melegenda di era perang dunia ke-2 adalah dari pabrikan Mauser untuk pasukan Jerman, merk Mosin Nagant dan merk Tokarev dari para sniper negeri Beruang Merah, Enfield digunakan oleh penembak jitu Kerajaan Inggris, Amerika menggunakan merk Springfield dan yang terakhir adalah merk Arisaka bawaan penembak tepat Negeri Matahari terbit Jepang.",R.drawable.sniper));
        listMenu.add(new Menu("Browning Bolt Action", "Bolt Action Rifle", "Senapan Bolt Action adalah senapan yang menggunakan mekanisme pengokangan dengan menarik secara manual bagian Blot agar bergeser ke belakang sehingga butir amunisi dengan dorongan pegas di bawahnya akan terdorong ke atas mengisi ruang tembak / firing chamber.\n" +
                "Senjata dengan mekanisme Bolt Action ini kerap ditemukan pada masa perang dunia ke-1 dan sebagian pada perang dunia ke-2.\n" +
                "Sistem ini lebih handal digunakan dan sangat jarang terjadi macet sehingga sangat cocok digunakan pada masa perang. Namun kekurangannya adalah pengguna harus menarik bagian bolt setiap kali akan melakukan penembakan.",R.drawable.boltaction));
        listMenu.add(new Menu("Winchester Lever Action", "Lever Action Rifle", "Senjata api dengan mekanisme lever action adalah senjata yang memiliki lever (tuas) di bagian bawah senjata di sekitar trigger (pemicu). Fungsi dari tuas tersebut adalah untuk mendorong amunisi dari tempat penyimpanan ke ruang tembak. Tempat penyimpanan amunisi pada jenis senjata ini biasanya berbentuk pipa tabung panjang dengan posisi amunisi tersusun secara berseri (end-to-end). Tempat penyimpanan amunisi jenis senapan ini disebut Tubular Magazine.\n" +
                "Senapan jenis Lever Action ini sangat popular pada era koboi di sekitar abad ke-19 dan awal abad ke-20. Senjata Lever Action yang paling terkenal adalah senapan produksi Winchester yang dikenal dengan nama Winchester model 1873.",R.drawable.leveraction));
        listMenu.add(new Menu("Revolver", "Senjata Api Laras Pendek / Handgun", "Revolver yang kerap kali kita saksikan adalah seperti senjata api yang digunakan di film-film Koboi. Di mana pada revolver, laras sangat jelas terlihat sebagai moncongnya. Kemudian peluru ditempat di dalam sebuah tabung silinder berbahan metal yang akan berputar pada sumbunya setiap kali ditembakkan.",R.drawable.revolver));
        listMenu.add(new Menu("Negev", "Heavy Machine Gun", "Senapan mesin berat adalah senapan mesin yang memiliki kaliber besar, biasanya 12,7 mm atau .50 Cal, yang digunakan untuk menembak sasaran besar seperti pesawat musuh ataupun kendaran taktis musuh.\n" +
                "Bentuknya yang besar sehingga memiliki bobot yang sangat berat. Diperlukan 2 atau 3 orang untuk mengoperasikan dan memindahkannya. \n" +
                "Selain dapat ditempatkan pada posisi di atas tanah, senapan mesin berat juga dapat ditempatkan di atas kendaraan taktis seperti Jeep, dan bahkan ditempatkan sebagai senjata pada pesawat tempur.",R.drawable.negev));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.RecyclerView_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter (this,listMenu);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);


    }
}
