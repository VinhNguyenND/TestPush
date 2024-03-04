package com.example.material_tester.Ui.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.material_tester.databinding.FragmentLetterListBinding

class LetterListFragment:Fragment() {
    private var _letterBinding:FragmentLetterListBinding?=null;
    private val binding get() = _letterBinding!!;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _letterBinding=FragmentLetterListBinding.inflate(inflater,container,false);
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}