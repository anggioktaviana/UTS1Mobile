package com.example.uts1mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rvlist.layoutManager = LinearLayoutManager(this)
        rvlist.setHasFixedSize(true)
        rvlist.adapter = Adapter(data, { onItem: Fakultas ->
            onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: Fakultas) {
        val showDetailActivityIntent = Intent(this, DetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.img)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.name)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.desc)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.Jur)
        startActivity(showDetailActivityIntent)


    }
    private fun createFac(): List<Fakultas> {
        val rvList = ArrayList<Fakultas>()
        rvList.add(
            Fakultas(
                R.drawable.upnjatim,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di " +
                        "UPN ''Veteran'' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen"
            )
        )
        rvList.add(
            Fakultas(
                R.drawable.upnjatim,
                "Fakultas Pertanian",
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di " +
                        "UPN ''Veteran'' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        rvList.add(
            Fakultas(
                R.drawable.upnjatim,
                "Fakultas Teknik",
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas di " +
                        "UPN ''Veteran'' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        rvList.add(
            Fakultas(
                R.drawable.upnjatim,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di " +
                        "UPN ''Veteran'' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            Fakultas(
                R.drawable.anggik,
                "Profil Singkat",
                "Nama: Anggy Oktaviana Syafira\n"+
                        "TTL: Bangkalan, 25 Oktober 1999\n" +
                        "Alamat: Purimas, Surabaya\n" +
                        "No.Hp: 082243002621\n" +
                        "Email: anggioktaviana25@gmail.com\n" +
                        "Github: https://github.com/anggioktaviana\n",
                "Riwayat Pendidikan: \n" +
                        "\t\t 2006-2012         SD Al Muslim Sidoarjo \n" +
                        "\t\t 2012-2015         SMPN 35 Surabaya \n" +
                        "\t\t 2015-2018         SMAN 16 Surabaya \n" +
                        "\t\t 2018-sekarang     UPN ''Veteran'' Jawa Timur\n"
            )
        )
        return rvList
    }
}