package com.moxietech.prescribio.repository

import com.moxietech.prescribio.firebasedb.FirebaseImpl
import com.moxietech.prescribio.model.Patient

class PatientsRepository {

    private val firebaseImpl: FirebaseImpl by lazy {FirebaseImpl()}

    fun getAllPatients() {

        firebaseImpl.getAllPatientsFromFirebase()
    }

}