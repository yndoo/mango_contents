package com.yndoo.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/CE7-Hxv-Ci",
                "https://mp-seoul-image-production-s3.mangoplate.com/2152861_1692008039466812.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "가보정1관"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/TovtkS-pCpIg",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/717926_1488539335416507.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "포폴로피자"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/qDmfXQr34Kts",
                "https://mp-seoul-image-production-s3.mangoplate.com/330223/868412_1509280543370_14554?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "이나경송탄부대찌개"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/02sGwSC9-K_E",
                "https://mp-seoul-image-production-s3.mangoplate.com/336832/870115_1509533663888_2876?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "좋은소식"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/J5CwEKfiVHFq",
                "https://mp-seoul-image-production-s3.mangoplate.com/112555_1495427502803415.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "맛차차"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/YlqhtvLZV8DS",
                "https://mp-seoul-image-production-s3.mangoplate.com/sources/web/restaurants/450594/894765_1617115724590?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "끌라시끄"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/dtgJuAt532",
                "https://mp-seoul-image-production-s3.mangoplate.com/1136238_1549105857197488.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "브레드숨"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/2u-4-3abGwI4",
                "https://mp-seoul-image-production-s3.mangoplate.com/361258/1013171_1679767816841_1000008222?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "모찌방"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/CE7-Hxv-Ci",
                "https://mp-seoul-image-production-s3.mangoplate.com/2152861_1692008039466812.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "가보정1관"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/TovtkS-pCpIg",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/717926_1488539335416507.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "포폴로피자"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/02sGwSC9-K_E",
                "https://mp-seoul-image-production-s3.mangoplate.com/336832/870115_1509533663888_2876?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "좋은소식"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/YlqhtvLZV8DS",
                "https://mp-seoul-image-production-s3.mangoplate.com/sources/web/restaurants/450594/894765_1617115724590?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "끌라시끄"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/2u-4-3abGwI4",
                "https://mp-seoul-image-production-s3.mangoplate.com/361258/1013171_1679767816841_1000008222?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "모찌방"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerview.adapter = rvAdapter

        rvAdapter.itemClick = object: RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url",items[position].url)
                intent.putExtra("title",items[position].titleText)
                intent.putExtra("image",items[position].imageUrl)
                startActivity(intent)


            }
        }

        recyclerview.layoutManager = GridLayoutManager(this, 2)

        findViewById<ImageView>(R.id.bookmarksImg).setOnClickListener {
            startActivity(Intent(this, BookmarkActivity::class.java))
        }
    }
}