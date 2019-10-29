package com.uty.responsi1_indraardiyanto_5170411252
import  android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import kotlinx.android.synthetic.main.login.*
import android.widget.Toast
import kotlinx.android.synthetic.main.actif2.*

import kotlinx.android.synthetic.main.actif3.*
class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actif3)
        // var email = findViewById<EditText>(R.id.txtemail) as EditText

        login.setOnClickListener() {
            // intent = Intent(this, kt4::class.java)
            val email = txtemail.text.toString()
            val pass = password.text.toString()
            if (email.isEmpty() || pass.isEmpty()) {
                Toast.makeText(
                    this, "masukkan email dan password kamu",
                    Toast.LENGTH_SHORT
                ).show()
            }
                //retur
                if (email == "gaktau@mail.com" || pass == "12345") {
                    val intent = Intent(this, kt4::class.java)
                    startActivity(intent)
                }
            }
        create.setOnClickListener


    }
    }


      //  fun login(){
          //  val email=txtemail.text
           // var email = findViewById(R.id.txtemail) as EditText
           // if(email.text.toString())
           // if(isValidCredential(email.text.toString(),input_password.text.toString())){
              //  Snackbar.make(btn_login,"Success Login",Snackbar.LENGTH_LONG)
                 //   .setAction("Action",null).show()
          //  }else{
            //    Snackbar.make(btn_login,"Invalid Credential",Snackbar.LENGTH_LONG)
              //      .setAction("Action",null).show()


      //  fun isValidCredential(email: String, password:String): Boolean{
           // return (email == "developer@coniolabs.com" && password == "Android")
     //   }
       // }
//}