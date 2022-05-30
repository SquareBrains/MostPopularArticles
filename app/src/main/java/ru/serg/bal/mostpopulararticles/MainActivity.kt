package ru.serg.bal.mostpopulararticles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.serg.bal.mostpopulararticles.view.ArticleListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().replace(R.id.container, ArticleListFragment.newInstance()).addToBackStack("").commit()
        }
    }
}