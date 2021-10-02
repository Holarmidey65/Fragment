package com.showtyclef.fragemnt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.showtyclef.fragemnt.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        val action = HomeFragmentDirections.actionHomeFragmentToResultFragment(old_number, new_number, new_number1)
        binding.Change.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("old_number", old_number)
            navCon.navigate(R.id.action_homeFragment_to_resultFragment. bundle)

            val old_number = binding.input_layout1.editText?.text.toString()
            val new_number = binding.input_layout2.editText?.text.toString()
            val new_number1 = binding.input_layout3.editText?.text.toString()
        }
    }
}