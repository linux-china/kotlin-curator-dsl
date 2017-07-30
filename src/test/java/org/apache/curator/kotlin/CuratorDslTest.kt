package org.apache.curator.kotlin

import org.apache.curator.framework.CuratorFrameworkFactory
import org.junit.Test

/**
 * curator DSL test
 *
 * @author linux_china
 */

class CuratorDslTest {
    private val curatorFramework = CuratorFrameworkFactory.builder().connectString("localhost:2181").build()!!

    @Test
    fun testGetData() {
        curator(curatorFramework) {

        }
    }
}