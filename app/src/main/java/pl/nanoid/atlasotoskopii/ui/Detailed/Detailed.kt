package pl.nanoid.atlasotoskopii.ui.Detailed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.nanoid.atlasotoskopii.R

class Detailed : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DetailedFragment.newInstance())
                .commitNow()
        }
    }

}
