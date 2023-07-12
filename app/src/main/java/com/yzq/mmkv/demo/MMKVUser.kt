package com.yzq.mmkv.demo

import com.tencent.mmkv.MMKV
import com.yzq.mmkv.MMKVReadWriteProp


/**
 * @description 用户相关的存储
 * @author  yuzhiqiang (zhiqiang.yu.xeon@gmail.com)
 */

object MMKVUser {

    val mmkv = MMKV.mmkvWithID(
        "user",
        MMKV.SINGLE_PROCESS_MODE,//单进程模式
        "xeonyu",//加密的key
    )

    var hasLogin: Boolean by MMKVReadWriteProp("hasLogin", false, mmkv)
    var account: String by MMKVReadWriteProp("account", "", mmkv)
    var pwd: String by MMKVReadWriteProp("pwd", "", mmkv)
}