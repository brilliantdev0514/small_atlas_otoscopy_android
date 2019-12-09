package pl.nanoid.atlasotoskopii.ui.List

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pl.nanoid.atlasotoskopii.R


class ListFragment : Fragment() {

    private lateinit var listViewModel: ListViewModel
    private lateinit var listRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        listViewModel =
            ViewModelProviders.of(this).get(ListViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_list, container, false)
        val textView: TextView = root.findViewById(R.id.text_list)
        listViewModel.text.observe(this, Observer {
            textView.text = it
        })
        listRecyclerView = root.findViewById(R.id.list_recyclerview)
        listRecyclerView.layoutManager = LinearLayoutManager(activity)
        listRecyclerView.adapter = ListSelectionRecyclerViewAdapter(context!!)

        return root
    }

}