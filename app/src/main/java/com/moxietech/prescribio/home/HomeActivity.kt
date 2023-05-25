package com.moxietech.prescribio.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.viewModels
import com.moxietech.prescribio.BaseActivity
import com.moxietech.prescribio.R
import com.moxietech.prescribio.prescriptionwriter.PrescriptionWritingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity() {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {
        findViewById<Button>(R.id.add_patient_fab).setOnClickListener {
            homeViewModel.navigateToPrescriptionWriter()
            navigateToPrescriptionWriter()
        }
    }

    private fun navigateToPrescriptionWriter() {
        startActivity(Intent(this, PrescriptionWritingActivity::class.java))
    }


}