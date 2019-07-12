buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0-beta05")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.41")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

task<Delete>("clean") { delete(rootProject.buildDir) }