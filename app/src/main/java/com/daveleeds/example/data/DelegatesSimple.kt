package com.daveleeds.example.data

import android.content.SharedPreferences
import androidx.core.content.edit
import kotlin.reflect.KProperty

/**
 * Simple delegation, without affordances for custom keys or defaults, and not type safe.
 * https://www.youtube.com/watch?v=KFgb6l1PUJI&t=198s
 */

inline operator fun <reified T> SharedPreferences.getValue(thisRef: Any, property: KProperty<*>): T {
    return when (T::class) {
        Boolean::class -> getBoolean(property.name, false)
        Int::class     -> getInt(property.name, 0)
        Float::class   -> getFloat(property.name, 0.0f)
        Long::class    -> getLong(property.name, 0L)
        String::class  -> getString(property.name, "")
        else           -> throw UnsupportedOperationException()
    } as T
}

operator fun <T> SharedPreferences.setValue(thisRef: Any, property: KProperty<*>, value: T) {
    edit {
        when (value) {
            is Boolean -> putBoolean(property.name, value)
            is Int     -> putInt(property.name, value)
            is Float   -> putFloat(property.name, value)
            is Long    -> putLong(property.name, value)
            is String  -> putString(property.name, value)
            else       -> throw UnsupportedOperationException()
        }
    }
}
