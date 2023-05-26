package com.moxietech.prescribio.firebasedb

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class FirebaseImpl {

    private val firebaseRef by lazy { Firebase.database}

    fun getAllPatientsFromFirebase() {
        val patientsRef = firebaseRef.getReference("patients")
        patientsRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val patients = snapshot.value
                return patients as Unit
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }

}