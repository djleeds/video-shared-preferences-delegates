# Companion Code for "Easy SharedPreferences with Delegated Properties in Kotlin"

This is the companion code for a video called [Easy SharedPreferences with Delegated Properties in Kotlin](https://youtu.be/KFgb6l1PUJI). 
The video is focused on the concepts around delegated properties, and so it doesn't cover the rest of the Android code that was used
when running the demos in the emulator. This project includes that code, so that you can see how it fits in with the rest of the app.

The video covers two different approaches - one simple and one more advanced approach (including better type safety, as well
as custom keys and defaults). This repository contains both of these approaches, and you can find them in these two files:

- [DelegatesSimple.kt](https://github.com/djleeds/video-shared-preferences-delegates/blob/main/app/src/main/java/com/daveleeds/example/data/DelegatesSimple.kt)
- [DelegatesAdvanced.kt](https://github.com/djleeds/video-shared-preferences-delegates/blob/main/app/src/main/java/com/daveleeds/example/data/DelegatesAdvanced.kt)

The usage site for both of these approaches can be found in [SettingsRepository.kt](https://github.com/djleeds/video-shared-preferences-delegates/blob/main/app/src/main/java/com/daveleeds/example/data/SettingsRepository.kt).
