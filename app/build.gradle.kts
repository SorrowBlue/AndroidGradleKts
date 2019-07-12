plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(29)
    buildToolsVersion = "29.0.0"
    defaultConfig {
        applicationId = "com.sorrowblue.myapplication"
        minSdkVersion(23)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(Deps.`kotlin-stdlib-jdk7`)
    implementation(Deps.appcompat)
    implementation(Deps.`core-ktx`)
    implementation(Deps.constraintlayout)
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.androidx_junit)
    androidTestImplementation(Deps.`espresso-core`)
}
