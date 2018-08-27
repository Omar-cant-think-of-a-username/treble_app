package me.phh.treble.app

import android.hidl.manager.V1_1.IServiceManager
import android.os.Bundle
import android.os.SystemProperties
import android.preference.PreferenceFragment

object MiscSettings {
    val mobileSignal = "key_misc_mobile_signal"
    val fpsDivisor = "key_misc_fps_divisor"

    fun enabled(): Boolean = true
}

class MiscSettingsFragment : PreferenceFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.pref_misc)
    }
}