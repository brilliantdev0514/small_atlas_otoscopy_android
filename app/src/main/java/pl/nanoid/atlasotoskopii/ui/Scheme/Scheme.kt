package pl.nanoid.atlasotoskopii.ui.Scheme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.nanoid.atlasotoskopii.R

class Scheme : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scheme_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SchemeFragment.newInstance())
                .commitNow()
        }
    }

}
