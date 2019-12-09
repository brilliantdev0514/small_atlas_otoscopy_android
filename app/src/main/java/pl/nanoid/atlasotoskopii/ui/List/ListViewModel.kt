package pl.nanoid.atlasotoskopii.ui.List

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import pl.nanoid.atlasotoskopii.R

class ListViewModel (app: Application): AndroidViewModel(app ) {

    private val context = app.applicationContext
    private val string = context.getString(R.string.title_list)

    private val _text = MutableLiveData<String>().apply {
        value = string
    }
    val text: LiveData<String> = _text

}