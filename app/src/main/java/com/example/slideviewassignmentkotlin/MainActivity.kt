package com.example.slideviewassignmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newrecyclerview: RecyclerView
    private lateinit var newArrayList: ArrayList<DataSlide>
    lateinit var imageId:Array<Int>
    lateinit var name:Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId= arrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6, 
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9
        )
        name= arrayOf(
            "This is image1",
            "This is image2",
            "This is image3",
            "This is image4",
            "This is image5",
            "This is image6",
            "This is image7",
            "This is image8",
            "This is image9"

        )
        newrecyclerview=findViewById(R.id.recyclerSlide)
        newrecyclerview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        newrecyclerview.setHasFixedSize(true)

        newArrayList= arrayListOf<DataSlide>()
        getUserdata()

    }

    private fun getUserdata() {
        for (i in imageId.indices){
            val dataSlide= DataSlide(imageId[i],name[i])
            newArrayList.add(dataSlide)
        }
        newrecyclerview.adapter=slideAdapter(newArrayList)
    }
}