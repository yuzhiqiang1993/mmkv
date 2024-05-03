plugins {
    alias(libs.plugins.xeonyu.application)
    id("kotlin-parcelize")
}

android {
    namespace = "com.yzq.mmkv.demo"

    defaultConfig {
        applicationId = "com.yzq.mmkv.demo"
        versionCode = 1
        versionName = "1.0"

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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.google.material)
//    implementation(libs.xeonyu.mmkv)
    implementation(project(":mmkv"))
}