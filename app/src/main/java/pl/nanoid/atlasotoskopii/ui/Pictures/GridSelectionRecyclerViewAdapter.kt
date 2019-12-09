package pl.nanoid.atlasotoskopii.ui.Pictures

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import pl.nanoid.atlasotoskopii.R
import io.realm.Realm
import pl.nanoid.atlasotoskopii.Realm.InMemRealm
import pl.nanoid.atlasotoskopii.StaticObject
import pl.nanoid.atlasotoskopii.ui.Detailed.Detailed

class GridSelectionRecyclerViewAdapter (context: Context) : RecyclerView.Adapter<GridSelectionViewHolder>() {

    private val inMemRealm: Realm = Realm.getInstance(StaticObject.inMemoryRealm)
    private val cont = context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridSelectionViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_view_holder, parent, false)
        return GridSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {

        return StaticObject.numberOfItemsInAdapters
    }

    override fun onBindViewHolder(holder: GridSelectionViewHolder, position: Int) {
        val imageName = "photo${position + 1}min"
        val uri = "@drawable/$imageName"
        val imageResource = cont.resources.getIdentifier(uri, null, cont.packageName)
        val drawable = ContextCompat.getDrawable(cont, imageResource)
        holder.gridImage.setImageDrawable(drawable)
        holder.gridImage.setOnClickListener {
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