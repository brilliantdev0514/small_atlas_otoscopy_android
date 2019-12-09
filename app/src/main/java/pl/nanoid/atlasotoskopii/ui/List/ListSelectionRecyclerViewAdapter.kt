package pl.nanoid.atlasotoskopii.ui.List

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import io.realm.*
import pl.nanoid.atlasotoskopii.R
import pl.nanoid.atlasotoskopii.Realm.InMemRealm
import pl.nanoid.atlasotoskopii.Realm.tableen
import pl.nanoid.atlasotoskopii.Realm.tablepl
import pl.nanoid.atlasotoskopii.Realm.tableru
import pl.nanoid.atlasotoskopii.StaticObject
import pl.nanoid.atlasotoskopii.ui.Detailed.Detailed
import java.util.*

class ListSelectionRecyclerViewAdapter (context: Context): RecyclerView.Adapter<ListSelectionViewHolder>() {

    private val cont = context
    private val inMemRealm: Realm = Realm.getInstance(StaticObject.inMemoryRealm)
    private var allObjectsPL = tablepl.all()
    private var allObjectsEN = tableen.all()
    private var allObjectsRU = tableru.all()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_holder, parent, false)
            return ListSelectionViewHolder(view)
        }

    override fun getItemCount(): Int {

            return StaticObject.numberOfItemsInAdapters
        }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {

            when (Locale.getDefault().language) {
               "pl" -> {
                   holder.listTitle.text = allObjectsPL[position]?.dis_name
                   holder.listContent.text = allObjectsPL[position]?.dis_short_description
               }
                "ru" -> {
                    holder.listTitle.text = allObjectsRU[position]?.dis_name
                    holder.listContent.text = allObjectsRU[position]?.dis_short_description
                }
                else -> {
                holder.listTitle.text = allObjectsEN[position]?.dis_name
                holder.listContent.text = allObjectsEN[position]?.dis_short_description
                }
            }


            val imageName = "photo${position + 1}min"
            val uri = "@drawable/$imageName"
            val imageResource = cont.resources.getIdentifier(uri, null, cont.packageName)
            val drawable = ContextCompat.getDrawable(cont, imageResource)
            holder.listImage.setImageDrawable(drawable)

            holder.listImage.setOnClickListener {
                inMemRealm.executeTransaction {
                    val inMem = inMemRealm.where(InMemRealm::class.java).findFirst()
                    inMem?.id = position
                    inMemRealm.insertOrUpdate(inMem)
                }
                val intent = Intent( cont, Detailed::class.java)
                cont.startActivity(intent)
            }
        }
    }
