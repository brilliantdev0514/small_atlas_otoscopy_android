package pl.nanoid.atlasotoskopii.ui.Start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_start.*
import kotlinx.coroutines.NonCancellable.start
import pl.nanoid.atlasotoskopii.R
import android.view.animation.TranslateAnimation
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.animation.Animation
import android.view.animation.AlphaAnimation

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.RelativeLayout


class StartActivity : AppCompatActivity() {

    lateinit var layout: ConstraintLayout
    lateinit var title1: TextView
    lateinit var title2: TextView
    lateinit var title3: TextView
    lateinit var twin: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        title1 = findViewById(R.id.textView3)
        title2 = findViewById(R.id.textView2)
        title3 = findViewById(R.id.textView4)
        twin = findViewById(R.id.twinkle)





        val animation = TranslateAnimation(
            1500.0f,
            0.0f,
            0.0f,
            0.0f
        ) // new TranslateAnimation (float fromXDelta,float toXDelta, float fromYDelta, float toYDelta)

        animation.duration = 1500 // animation duration
        animation.repeatCount = 0 // animation repeat count
        animation.fillAfter = true
        title1.startAnimation(animation)//your_view f
        title2.startAnimation(animation)
        title3.startAnimation(animation)
        val anim = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 50 //You can manage the blinking time with this parameter
        anim.startOffset = 500
        anim.repeatMode = Animation.REVERSE
        anim.repeatCount = Animation.INFINITE
        twin.startAnimation(anim)
        Realm.init(this)

        layout = findViewById(R.id.start_activity_constraint_layout)
        layout.setOnClickListener {
            startMainActivity()
        }
    }

    private fun startMainActivity () {
        val intent = Intent(this@StartActivity, MainActivity::class.java)
        startActivity(intent)
    }
}
