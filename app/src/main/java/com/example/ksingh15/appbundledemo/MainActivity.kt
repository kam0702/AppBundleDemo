package com.example.ksingh15.appbundledemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = arrayListOf<Int>();
        for(i in 1..10){
            list.add(i)
        }

       var resultList =  list.filterOnCondition { isMultipleOf(it,5) }

        print("result is $resultList")
    }

    fun isMultipleOf(number: Int,multiple: Int): Boolean{
        return ( number%multiple == 0)
    }

    fun <T> ArrayList<T>.filterOnCondition(condition: (T)->Boolean): ArrayList<T>{
        val result = arrayListOf<T>();
        for(item in result){
            if(condition(item)){
                result.add(item)
            }
        }

        return result;
    }
}
