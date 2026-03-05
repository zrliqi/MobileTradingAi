package com.tradingai.app.firebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.storage.ktx.storage
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

object FirebaseManager {
    val auth: FirebaseAuth by lazy { Firebase.auth }
    val db: FirebaseFirestore by lazy { Firebase.firestore }
    val storage: FirebaseStorage by lazy { Firebase.storage }
    val analytics: FirebaseAnalytics by lazy { Firebase.analytics }
}
