package com.example.hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ok : ImageButton = findViewById(R.id.ok)
        val password : EditText = findViewById(R.id.password)
        val checkpassword : EditText = findViewById(R.id.checkpassword)
        val name : EditText = findViewById(R.id.name)
        val id : EditText = findViewById(R.id.id)
        val birth : EditText = findViewById(R.id.birth)
        val address : EditText = findViewById(R.id.address)


        //생년월일 데이터형 확인 함수
        fun check_type() : Boolean{
            var ret = true
            for(i in 0 .. birth.length()-1) {
                var word = birth.getText()[i] //문자열
                if(Character.isDigit(word)==false){
                    ret = false
                    break}
            }
            return  ret
        }






        ok.setOnClickListener{

            if(password.getText().toString()!=checkpassword.getText().toString()){
                Toast.makeText(this,"비밀번호가 같지 않습니다.",Toast.LENGTH_LONG).show()
            }
            else if(password.getText().toString().equals("")||checkpassword.getText().toString().equals("")||
                name.getText().toString().equals("")||id.getText().toString().equals("")||
                birth.getText().toString().equals("")||address.getText().toString().equals("")){
                Toast.makeText(this,"모두 입력해주세요.",Toast.LENGTH_LONG).show()
            }
            /*else if(Integer.parseInt(birth.getText().toString()) !is Int){
                Toast.makeText(this,"생년월일을 정확히 입력하세요.",Toast.LENGTH_LONG).show()
            }*/
            else if(!check_type()|| birth.length()!=8){
                Toast.makeText(this,"생년월일을 정확히 입력하세요.",Toast.LENGTH_LONG).show()
            }
            else {
                val intent = Intent(this, secondActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
