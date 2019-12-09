package pl.nanoid.atlasotoskopii.ui.Detailed

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import io.realm.Realm
import pl.nanoid.atlasotoskopii.R
import pl.nanoid.atlasotoskopii.Realm.InMemRealm
import pl.nanoid.atlasotoskopii.Realm.tableen
import pl.nanoid.atlasotoskopii.Realm.tablepl
import pl.nanoid.atlasotoskopii.Realm.tableru
import pl.nanoid.atlasotoskopii.StaticObject
import pl.nanoid.atlasotoskopii.ui.Scheme.Scheme
import java.util.*

class DetailedFragment : Fragment() {


    companion object {
        fun newInstance() = DetailedFragment()
    }

    private lateinit var viewModel: DetailedViewModel

    private val inMem: Realm = Realm.getInstance(StaticObject.inMemoryRealm)
    private lateinit var imageView: ImageView
    private lateinit var textDescription: TextView
    private lateinit var textTreatment: TextView
    private lateinit var Treatment: TextView
    private lateinit var textTitle: TextView
    private var disId: Int? = 0



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.detailed_fragment, container, false)
        imageView = root.findViewById(R.id.scheme_image_view)
        imageView.setOnClickListener {
            val intent = Intent(context, Scheme::class.java)
            context?.startActivity(intent)
        }
        textTitle = root.findViewById(R.id.scheme_message)
        textDescription = root.findViewById(R.id.scheme_description)
        textTreatment = root.findViewById(R.id.detailed_treatment)
        Treatment = root.findViewById(R.id.detailed_treatmennt_title)


        return root

    }




    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailedViewModel::class.java)

    }

    override fun onResume() {

        super.onResume()
        loadImageData()
        loadTextData()
        visible()
    }
    private fun visible(){
        if(textTreatment.text.isEmpty()){
            Treatment.setVisibility(View.INVISIBLE)
        }
    }

    private fun loadImageData() {

        disId = inMem.where(InMemRealm::class.java).findFirst()?.id
        val imageName = "photo${disId!! + 1}"
        val uri = "@drawable/$imageName"
        val imageResource = context?.resources?.getIdentifier(uri, null, context?.packageName)
        val drawable = ContextCompat.getDrawable(context!!, imageResource!!)
        imageView.setImageDrawable(drawable)

    }

    private fun loadTextData () {

        val itemNumber: Long? = (disId!!.toLong() + 1)
        when (Locale.getDefault().language) {
            "pl" -> {
                val item = tablepl.querry().equalTo("dis_id", itemNumber).findFirst()
                textDescription.text = item?.dis_description
                textTreatment.text = item?.dis_treatment
                textTitle.text = item?.dis_name
            }
            "ru" -> {
                val item = tableru.querry().equalTo("dis_id", itemNumber).findFirst()
                textDescription.text = item?.dis_description
                textTreatment.text = item?.dis_treatment
                textTitle.text = item?.dis_name
            }
            else -> {
                val item = tableen.querry().equalTo("dis_id", itemNumber).findFirst()
                textDescription.text = item?.dis_description
                textTreatment.text = item?.dis_treatment
                textTitle.text = item?.dis_name
            }

        }
    }
}
