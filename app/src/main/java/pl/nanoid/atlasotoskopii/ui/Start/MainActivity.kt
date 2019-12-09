package pl.nanoid.atlasotoskopii.ui.Start

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import io.realm.Realm
import pl.nanoid.atlasotoskopii.R
import pl.nanoid.atlasotoskopii.Realm.InMemRealm
import pl.nanoid.atlasotoskopii.StaticObject

class MainActivity : AppCompatActivity() {

    lateinit var inMemRealm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        try {
//
//            this.supportActionBar?.hide()
//
//        } finally {
//
//        }

        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.navigation_list,
//                R.id.navigation_info,
//                R.id.navigation_pictures
//            )
//        )

//        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        // Configure Realm database and create in memory Realm for selecting items

        inMemRealm = Realm.getInstance(StaticObject.inMemoryRealm)
        inMemRealm.executeTransaction {
            val inMem = InMemRealm()
            inMem.id = 1
            inMemRealm.insert(inMem)
        }
        copyDatabaseFromBundle()

    }

    // COPY DATABASE from bundle to the working directory

    private fun copyDatabaseFromBundle() {

    }

}


