package pl.nanoid.atlasotoskopii.ui.Pictures

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pl.nanoid.atlasotoskopii.R

class PicturesFragment : Fragment(){

    private lateinit var picturesViewModel: PicturesViewModel
    private lateinit var gridRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        picturesViewModel =
            ViewModelProviders.of(this).get(PicturesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_grid, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        picturesViewModel.text.observe(this, Observer {
            textView.text = it
        })

        gridRecyclerView = root.findViewById(R.id.grid_recyclerview)
        gridRecyclerView.layoutManager = GridLayoutManager(activity, 3)
        gridRecyclerView.addItemDecoration(GridDecoration(3, 21, true))
        gridRecyclerView.adapter = GridSelectionRecyclerViewAdapter(context!!)

        return root
    }
}