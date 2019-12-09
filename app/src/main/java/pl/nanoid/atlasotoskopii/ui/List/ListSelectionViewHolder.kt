package pl.nanoid.atlasotoskopii.ui.List

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pl.nanoid.atlasotoskopii.R

class ListSelectionViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    
    val listTitle = itemView.findViewById(R.id.list_textview_title) as TextView
    val listContent = itemView.findViewById(R.id.list_textview_content) as TextView
    val listImage = itemView.findViewById(R.id.list_imageview) as ImageView

}