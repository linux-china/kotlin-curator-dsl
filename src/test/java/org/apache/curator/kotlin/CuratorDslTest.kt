package org.apache.curator.kotlin

import org.apache.curator.framework.CuratorFramework
import org.apache.curator.framework.CuratorFrameworkFactory
import org.apache.curator.retry.RetryOneTime
import org.apache.curator.test.TestingServer
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test

/**
 * curator DSL test
 *
 * @author linux_china
 */

class CuratorDslTest {

    companion object {
        lateinit var curatorFramework: CuratorFramework
        lateinit var testServer: TestingServer
        @BeforeClass
        @JvmStatic
        fun setup() {
            testServer = TestingServer(true)
            curatorFramework = CuratorFrameworkFactory.builder().connectString(testServer.connectString).retryPolicy(RetryOneTime(2000)).build()!!
            curatorFramework.start()
        }

        @AfterClass
        @JvmStatic
        fun teardown() {
            curatorFramework.close()
            testServer.close()
        }
    }

    @Test
    fun testGetData() {
        curator(curatorFramework) {
            create("/nick", "linux_china".toByteArray())
            getStringData("/nick") {
                println(it)
            }
        }
    }
}