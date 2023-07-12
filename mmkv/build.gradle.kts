plugins {
    alias(libs.plugins.xeonyu.library)
    alias(libs.plugins.vanniktechPublish)
}

android {
    namespace = "com.yzq.mmkv"
}

dependencies {
    api("com.tencent:mmkv:1.3.0")
//    api(libs.mmkv)
}