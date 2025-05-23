package com.example.planner.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.planner.databinding.FragmentUpdatePlannerActivityBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class UpdatePlannerActivityFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentUpdatePlannerActivityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentUpdatePlannerActivityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            //TODO: Activity update logic
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}