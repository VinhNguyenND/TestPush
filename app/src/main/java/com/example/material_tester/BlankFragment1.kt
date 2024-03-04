package com.example.material_tester

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.load.engine.Resource
import com.example.material_tester.Ui.Activities.bottomBar_nav.CommonAdapter
import com.example.material_tester.Ui.Activities.bottomBar_nav.item
import com.example.material_tester.Ui.Activities.bottomBar_nav.popupRecycleView
import com.example.material_tester.databinding.FragmentBlank1Binding
import com.example.material_tester.databinding.FragmentBlank3Binding
import com.example.material_tester.databinding.Layout1Binding
import com.example.material_tester.databinding.PopupLayoutBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var popupView:PopupLayoutBinding
    private lateinit var binding: FragmentBlank1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        popupView=PopupLayoutBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentBlank1Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val inflater:LayoutInflater =  requireActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater;
        val popupView=inflater.inflate(R.layout.popup_layout,null)
        val focusable=true
        val popupWindow= PopupWindow(popupView,1250,1250,focusable)
        val rcView=popupView.findViewById<RecyclerView>(R.id.popup_recycle)
        val _Adapter=popupRecycleView(listString(),this.requireContext())
        _Adapter.setClickListener(object :CommonAdapter{
            override fun setOnClickListener(position: Int) {
                Toast.makeText(requireContext(),listString()[position].name,Toast.LENGTH_SHORT).show()
            }
        })
        binding.btnfr1.setOnClickListener {
            popupWindow.showAtLocation(it, Gravity.AXIS_SPECIFIED,0,100)
        }
        rcView.let {
            it.layoutManager= LinearLayoutManager(parentFragment?.requireContext(),
                RecyclerView.VERTICAL,false)
            it.adapter=_Adapter
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    private fun listString():MutableList<item>{
        val list=MutableList<item>(0,{item("sfd")})
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        list.add(item("name 1"))
        return list
    }
}