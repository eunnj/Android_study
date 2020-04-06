package com.example.hw1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class secondActivity : AppCompatActivity() {

    private lateinit var recyclerview : RecyclerView //초기화
    private lateinit var myadapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview)

        initList()
        }

    private fun initList(){
        recyclerview=findViewById(R.id.recyclerview)

        //this로 현재 context 전달
        myadapter= Adapter(this)

        //리사이클러뷰의 어댑터 세팅
        recyclerview.adapter=myadapter

        //리사이클러뷰 배치
        recyclerview.layoutManager=GridLayoutManager(this,2)

        //어댑터에 정의한 데이터 대입
        myadapter.data= listOf(
            Item(
                //it_image = getDrawable(R.drawable.dog1)!!,
                it_image=R.drawable.dog_1,
                it_species ="말티즈",
                it_age = "3살 추정",
                it_feature ="치석이 있으며 건강함",
                it_place ="서울시 양천구"
            ),Item(
                //it_image = getDrawable(R.drawable.dog2)!!,
                it_image=R.drawable.dog_2,
                it_species ="말티즈",
                it_age = "2살 추정",
                it_feature ="활발함",
                it_place ="서울시 강남구"
            ),Item(
                //it_image = getDrawable(R.drawable.dog3)!!,
                it_image=R.drawable.dog_3,
                it_species ="말티즈",
                it_age = "1살 추정",
                it_feature ="낯가림",
                it_place ="인천시 연수구"
            ),Item(
                it_image=R.drawable.dog_4,
                //it_image = getDrawable(R.drawable.dog4)!!,
                it_species ="말티즈",
                it_age = "3살 추정",
                it_feature ="활발함",
                it_place ="서울시 은평구"
            ),Item(
                it_image=R.drawable.dog_5,
                //it_image = getDrawable(R.drawable.dog5)!!,
                it_species ="말티즈",
                it_age = "4살 추정",
                it_feature ="귀여움",
                it_place ="경기도 고양시 일산동구"
            ),Item(
                it_image=R.drawable.dog_6,
                // it_image = getDrawable(R.drawable.dog6)!!,
                it_species ="말티즈",
                it_age = "1살 추정",
                it_feature ="눈 밑 점",
                it_place ="서울시 도봉구"
            )
        )

        myadapter.notifyDataSetChanged()
    }
}
