package com.example.lesson42

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lesson42.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        val adapter = Adapter(ArrayList())
        binding.recyclerView.adapter = adapter


        binding.addItemButton.setOnClickListener {
            navigateToAddItemFragment()
        }
    }

    private fun navigateToAddItemFragment() {
        findNavController().navigate(R.id.action_homeFragment_to_addItemFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
