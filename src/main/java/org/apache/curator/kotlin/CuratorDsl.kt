package org.apache.curator.kotlin

import org.apache.curator.framework.CuratorFramework

/**
 * curator DSL
 *
 * @author linux_china
 */
class CuratorDSL(private val client: CuratorFramework) {

    fun create(path: String, value: ByteArray) {
        client.create().forPath(path, value)
    }

    fun getData(path: String, listener: (ByteArray) -> Unit) {
        val data = client.data.forPath(path)
        listener(data)
    }

    fun getStringData(path: String, listener: (String) -> Unit) {
        val data = client.data.forPath(path)
        listener(String(data, Charsets.UTF_8))
    }

    fun lock(block: (String) -> Unit) {

    }

}

fun curator(client: CuratorFramework, block: CuratorDSL.() -> Unit) {
    block.invoke(CuratorDSL(client))
}
