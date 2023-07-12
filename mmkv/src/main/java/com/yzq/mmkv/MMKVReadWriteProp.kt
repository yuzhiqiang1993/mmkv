package com.yzq.mmkv

import android.os.Parcelable
import com.tencent.mmkv.MMKV
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @description mmkv读写委托
 * @author  yuzhiqiang (zhiqiang.yu.xeon@gmail.com)
 */

class MMKVReadWriteProp<V>(
    private val key: String,
    private val defauleVal: V,
    private val mmkv: MMKV = MMKV.defaultMMKV(),
) : ReadWriteProperty<Any, V> {


    override fun getValue(thisRef: Any, property: KProperty<*>): V {
        return decodeValue(key)
    }


    /**
     * 取值
     * @param key String
     * @return V
     */
    @Suppress("UNCHECKED_CAST")
    private fun decodeValue(key: String): V {
        return mmkv.run {
            when (defauleVal) {
                is String -> decodeString(key, defauleVal)
                is Int -> decodeInt(key, defauleVal)
                is Long -> decodeLong(key, defauleVal)
                is Boolean -> decodeBool(key, defauleVal)
                is Float -> decodeFloat(key, defauleVal)
                is Double -> decodeDouble(key, defauleVal)
                is Parcelable -> decodeParcelable(key, defauleVal.javaClass)
                else -> throw IllegalArgumentException("MMKVReadWriteProp 不支持的类型")
            }
        } as V
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: V) {
        encodeValue(key, value)
    }

    /**
     * 存值
     * @param key String
     * @param value V
     */
    private fun encodeValue(key: String, value: V) {
        mmkv.run {
            when (value) {
                is String -> encode(key, value)
                is Int -> encode(key, value)
                is Long -> encode(key, value)
                is Boolean -> encode(key, value)
                is Float -> encode(key, value)
                is Double -> encode(key, value)
                is Parcelable -> encode(key, value)
                else -> throw IllegalArgumentException("MMKVReadWriteProp 不支持的类型")
            }
        }
    }
}
