package com.moxietech.prescribio.prescriptionwriter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.moxietech.prescribio.BaseFragment
import com.moxietech.prescribio.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MedicineFinderFragment : BaseFragment() {

    private val prescriptionWritingViewModel: PrescriptionWritingViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inflater.inflate(R.layout.fragment_medicine_search, container)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

}