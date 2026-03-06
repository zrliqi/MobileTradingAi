package com.tradingaiworld.app.ui.investor

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tradingai.app.databinding.FragmentInvestorBinding

class InvestorFragment : Fragment() {

    private var _binding: FragmentInvestorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInvestorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTier1.setOnClickListener {
            openLink("https://discord.gg/xf4p8TbH2P")
        }

        binding.btnTier2.setOnClickListener {
            openLink("https://discord.gg/Y6MsZ84zSy")
        }

        binding.btnTier3.setOnClickListener {
            openLink("https://discord.gg/CFnVmhdgy4")
        }

        binding.btnTier4.setOnClickListener {
            openLink("https://discord.gg/WYDMFyTKqe")
        }
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
