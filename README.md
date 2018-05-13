# CustomLintRule
Custom Lint rule for Android Studio, detecting class declaration name with 3 or less character.

This custom Lint rule allow for the detection of class declaration in the code source, which the name is 3 or less character short.

## Version
This rule works with the current version of Android studio (05/14/2018)
Android Studio 3.1
Android Lint 26.1.2
Java JRE 1.8

## How to use
In order to make this rule work, you'll need to compile it with Android Studio's gradle tool, and put the resulting .jar (found at CustomLintRule/myCheck/build/libs/myCheck.jar) into the custom lint rule folder, located by default at ~/.android/lint/ on Unix, and at the %userprofile% directory on Windows.

## For more info
For more information about recent changes in Android Lint and how to write custom Lint rules, please see the following links:
* Google group lint-dev: https://groups.google.com/forum/#!forum/lint-dev
* KotlinConf on youtube: https://youtu.be/p8yX5-lPS6o
