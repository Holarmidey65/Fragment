package com.showtyclef.fragemnt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.showtyclef.fragemnt.databinding.FragmentHomeBinding
import com.showtyclef.fragemnt.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!
    private lateinit var old_number: string
    private lateinit var new_number: string
    private lateinit var new_number1: string

    companion object{
        const val Old = "old_number"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            old_number = it.getString("old_number").toString()
            new_number = it.getString(new_number).toString()
            new_number1 = it.getString(new_number1).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.old_numderText.text = old_number
        binding.new_numberText.text = new_number
        binding.new_number1Text.text = new_number1
    }
}