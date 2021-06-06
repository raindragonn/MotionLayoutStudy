package com.raindragonn.motionlayouttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.raindragonn.motionlayouttest.databinding.FragmentMusicPlayerBinding

class PlayerFragment : Fragment(R.layout.fragment_music_player) {

    private var _binding: FragmentMusicPlayerBinding? = null
    val binding: FragmentMusicPlayerBinding by lazy { _binding!! }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMusicPlayerBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            ivBack.setOnClickListener {
                binding.root.transitionToStart()
            }
            ivPlay.setOnClickListener {
                Toast.makeText(requireContext(), "hi", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        binding
        super.onDestroyView()
    }

}