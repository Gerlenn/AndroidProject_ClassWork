package com.example.androidproject.presentation.view.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.androidproject.R
import com.example.androidproject.databinding.FragmentOnBoardingBinding
import com.example.androidproject.presentation.view.home.HomeFragment
import com.example.androidproject.presentation.view.home.ItemsFragment
import com.example.androidproject.utils.Navigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardingFragment : Fragment(), OnBoardingView {

    private var _binding: FragmentOnBoardingBinding? = null
    private val binding: FragmentOnBoardingBinding get() = _binding!!

    @Inject
    lateinit var onBoardingPresenter: OnBoardingPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onBoardingPresenter.setView(this)

        binding.btnFinish2.setOnClickListener {
            onBoardingPresenter.goToItemsFragment()
        }
    }

    override fun goToItemsFragment() {
        Navigation.fmReplace(parentFragmentManager, ItemsFragment(), false)// переход через метод
//        parentFragmentManager.beginTransaction()
//            .replace(R.id.activity_container, HomeFragment())
//            .commit()
    }
}