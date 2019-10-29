package com.uty.responsi1_indraardiyanto_5170411252

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.actif2.*
//import kotlinx.android.synthetic.main.activity_main.*

class registrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actif2)
        // val nimm=nim.text
        //var keterangan:kotlin.String?=null
        val name=nama.text
        val gender=jnsklmn.text
        val ttl=tnglhr.text
        //val name: String = "kopi"

       proses_btn.setOnClickListener() {
            intent = Intent(this, login::class.java)
           intent.putExtra("namee", name)
           intent.putExtra("gen", gender )
      intent.putExtra("ttll", ttl)

            startActivity(intent)

        }
    }

}