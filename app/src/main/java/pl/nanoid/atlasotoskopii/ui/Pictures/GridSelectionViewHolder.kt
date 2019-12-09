package pl.nanoid.atlasotoskopii.ui.Pictures

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import pl.nanoid.atlasotoskopii.R

class GridSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val  gridImage = itemView.findViewById(R.id.grid_image_view) as ImageView

}