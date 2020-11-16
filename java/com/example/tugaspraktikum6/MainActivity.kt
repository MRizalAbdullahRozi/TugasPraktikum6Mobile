package com.example.tugaspraktikum6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testJajan = createDataJajan()
        RV.layoutManager = LinearLayoutManager(this)
        RV.setHasFixedSize(true)
        RV.adapter = adapter(testJajan, { jajanItem: data_jajan -> jajanItemClicked(jajanItem) })

    }

    private fun jajanItemClicked(jajanItem: data_jajan) {
        val showIntent = Intent(this, detail::class.java)
        showIntent.putExtra(Intent.EXTRA_TEXT, jajanItem.namaJajan.toString())
        showIntent.putExtra(Intent.EXTRA_TEMPLATE, jajanItem.descJajan.toString())
        showIntent.putExtra(Intent.EXTRA_REFERRER, jajanItem.foto.toString())
        startActivity(showIntent)
    }

    private fun createDataJajan(): List<data_jajan> {
        val partList = ArrayList<data_jajan>()
        partList.add(
            data_jajan(
                "GunaGuna Snack",
                "GunaGuna terinspirasi oleh resep kuno yang sudah ada sejak zaman kolonial." +
                        "Bahkan nama yang dipakai pun masih sama seperti zaman Belanda. Di sini kamu " +
                        "bisa beli Macaroni Schotel berbagai rasa dan ukuran, Blackpepper Chicken Puff," +
                        " Almond Crispy Cookies, Schuimpjes, Basreng, dan Samosa \n \n" +
                        "Lokasi: Perum Darmo Sentosa Raya, Jl Jajartunggal Utara VII J-19 kav 308, " +
                        "Jajar Tunggal, Kecamatan Wiyung, Surabaya. \n \n" +
                        "Harga: Mulai Rp 7000 ",
                R.drawable.guna
            )
        )
        partList.add(
            data_jajan(
                "Spikoe",
                "kue lapis khas Surabaya ini adalah semuanya dibuat dengan bahan-bahan " +
                        "berkualitas tinggi. Meski memakai resep tradisional, tapi semua bahan dan " +
                        "peralatan sudah modern. Dijamin aman dan halal! Kamu bisa memilih rasa atau " +
                        "isian di dalam kue. Ada yang original, memakai kismis, buah prem kering, " +
                        "dan juga varian speculaas.\n \n" +
                        "Lokasi : Jl. Rungkut Madya 41 Surabaya. \n \n" +
                        "Harga : Mulai Rp 80000",
                R.drawable.spikoe
            )
        )
        partList.add(
            data_jajan(
                "Suoklat",
                "Produk awal Souklat adalah cokelat yang berisi kurma atau kacang mete. " +
                        "Kemudian Souklat menambahkan banyak produk baru seperti Dark Kurma Mete, " +
                        "Dark Cocholate Cookies Mete, Cokelat Jahe, dll. Kamu bisa mencoba semuanya " +
                        "di Kafe Souklat 3.0. Ada banyak pilihan cokelat lezat yang bisa kamu bawa " +
                        "pulang sebagai oleh-oleh untuk yang di rumah.\n \n" +
                        "Lokasi : Jl. Genteng Besar No.83D, Genteng, Kec. Genteng, Surabaya. \n \n" +
                        "Harga : Mulai Rp 7000",
                R.drawable.soklat
            )
        )
        partList.add(
            data_jajan(
                "Sate Klopo",
                "Sate klopo ini jangan sampai terlewat dari daftar menu wajib coba Anda." +
                        " Biasanya, sate adalah daging yang ditusuk kemudian diberi bumbu kacang. " +
                        "Namun, sate bumbu ini adalah bumbu kacang yang ditaburi parutan kelapa kering." +
                        " Sate klopo pun bisa dinikmati di malam hari yang dingin. Makanan khas surabaya " +
                        "malam hari ini membuat malammu semakin nikmat.\n \n" +
                        " Lokasi : sate klopo terkenal di Surabaya adalah Sate Klopo Ondomohen di" +
                        " Jl. Walikota Mustajab 36 Surabaya 60272 \n \n " +
                        "Harga : Mulai Rp 15000",
                R.drawable.sate
            )
        )
        partList.add(
            data_jajan(
                "Rujak Cingur",
                "Salah satu makanan khas Surabaya yang terkenal adalah rujak cingur. " +
                        "Sebenarnya rujak cingur sekarang sudah tersebar di luar Surabaya." +
                        " Rujak cingur ini merupakan perpaduan antara buah-buahan, sayur, dan daging." +
                        " Seperti buah belimbing, bengkuang, nanas. Kemudian ditambah sayur kangkung," +
                        " tauge, irisan tempe, dan tahu. Tak lupa harus menambahkan cingur sapi. Banyak" +
                        " tempat menjual rujak cingur terkenal di Surabaya, yaitu \n \n"+
                        "Lokasi : Tersebar di seluruh Surabaya dan Sekitarnya \n \n" +
                        "Harga : Mulai Rp 10000",
                R.drawable.rujak
            )
        )
        partList.add(
            data_jajan(
                "Lontong Balap",
                "Lontong Balap adalah makanan tradisional yang dalamnya terdapat aneka bahan " +
                        "seperti lontong, taoge, tahu goreng, lentho dan lain – lain yang kemudian " +
                        "dicampur menjadi satu dan disiram dengan kuah khusus.\n \n" +
                        "Lokasi : Seluruh Surabaya dan Sekitarnya \n \n" +
                        "Harga : Mulai Rp 10000",
                R.drawable.lontong
            )
        )
        partList.add(
            data_jajan(
                "Krupuk Ikan Kenjeran",
                "Di Kenjeran, kamu bisa membeli kerupuk mentah atau yang sudah digoreng " +
                        "dan siap masak. Biasanya produk kerupuk ini sudah dikemas dengan baik dengan" +
                        " berat tertentu. Di beberapa tempat, kamu bisa menemui penjual kerupuk mentah " +
                        "curah alias belum dikemas. Rasa kerupuk dari Kenjeran ini gurih dan lezat.\n \n" +
                        "Lokasi : Jl. Raya Pantai Lama, Kenjeran, Bulak, Surabaya \n \n" +
                        "Harga : Bervaraisi",
                R.drawable.krupuk
            )
        )
        return partList
    }
}