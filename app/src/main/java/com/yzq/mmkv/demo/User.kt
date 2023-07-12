package com.yzq.mmkv.demo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


/**
 * @description 用户
 * @author  yuzhiqiang (zhiqiang.yu.xeon@gmail.com)
 */

@Parcelize
data class User(
    var id: Int = -1,
    var name: String = "",
    var age: Int = -1,
) : Parcelable