package com.daveleeds.example.data

import android.content.SharedPreferences

class SettingsRepository(preferences: SharedPreferences) {
    /** Simple delegation - See [SharedPreferences.getValue] in `DelegatesSimple` */
    var nickname: String by preferences

    /** Advanced delegation - See [SharedPreferences.delegates] in `DelegatesAdvanced` */
    var turboMode: Boolean by preferences.delegates.boolean(true, "TURBO_MODE")
    var throttle: Float by preferences.delegates.float(3.5f)
}
