package com.example.tugaspraktikum6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_item.*

class detail:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_item)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partDesc = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var partFoto =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER)?.toInt()
            var imageView = fotoJajan2
            namaJajan2.text = partName
            descJajan2.text = partDesc
            fotoJajan2.setImageResource(partFoto!!)
        }
    }
}