package com.neppplus.kotlinbasic01_minjin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.neppplus.kotlinbasic01_minjin.databinding.ActivityMainBinding // 추가

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // 추가
// 코드에 메모 남기기 - 주석
    /*
     Ctrl + / : 커서가 있는 줄을 주석 처리
     이 {  } 안에 있는 코드만, 버튼이 눌렸을 때 실행됨  */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 추가
        setContentView(binding.root) // 변경

        binding.clickBtn.setOnClickListener { // 변경
            Log.d("메인화면로그","클릭용 버튼 눌림")
            Log.e("메인화면로그","에러 관련 로그")
        }

        binding.smallBtn.setOnClickListener {
            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()

        }
    }
}
