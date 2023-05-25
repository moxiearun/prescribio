package com.moxietech.prescribio.home

import com.moxietech.prescribio.BaseViewModel
import com.moxietech.prescribio.model.Patient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


class HomeViewModel : BaseViewModel() {

    lateinit var patientsList:MutableList<Patient>

    fun navigateToPrescriptionWriter() {

    }

}