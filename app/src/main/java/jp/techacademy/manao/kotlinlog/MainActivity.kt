package jp.techacademy.manao.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("田中太郎", 20, "Android")      // 名前を田中太郎、年齢20歳で、Humanのインスタンスを作る
        human1.say()
        human1.think()

        val human2 = Human("山田花子", 25, "iOS")      // 名前を山田花子、年齢25歳で、Humanのインスタンスを作る
        human2.say()
        human2.think()
    }
}