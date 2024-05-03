plugins {
    alias(libs.plugins.xeonyu.library)
    alias(libs.plugins.vanniktechPublish)
}

android {
    namespace = "com.yzq.mmkv"
}

dependencies {
    implementation(platform(libs.kotlin.bom.stable))
    api(libs.mmkv)
}