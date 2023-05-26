package com.moxietech.prescribio.home

import com.moxietech.prescribio.BaseViewModel
import com.moxietech.prescribio.model.Patient
import com.moxietech.prescribio.repository.PatientsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel() {

    lateinit var patientsList: MutableList<Patient>

    fun loadPatientList() {
        PatientsRepository().getAllPatients()
    }

}