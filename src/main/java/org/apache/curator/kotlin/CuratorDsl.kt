package org.apache.curator.kotlin

import org.apache.curator.framework.CuratorFramework

/**
 * curator DSL
 *
 * @author linux_china
 */
class CuratorDSL() {

    fun getData(listener: (String) -> Unit) {

    }

    fun lock(block: (String) -> Unit) {

    }

}

fun curator(client: CuratorFramework, block: CuratorDSL.() -> Unit) {

}
