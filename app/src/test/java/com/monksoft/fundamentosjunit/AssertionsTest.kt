package com.monksoft.fundamentosjunit

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class AssertionsTest {

    private lateinit var assertions : Assertions
    private lateinit var bot : User

    companion object{
        private lateinit var brian : User

        @BeforeClass @JvmStatic
        fun setupCommon(){
            brian = User("brian", 28, true)
        }

        @AfterClass @JvmStatic
        fun tearDownCommon(){
            brian = User()
        }
    }

    @Before
    fun setup(){
        assertions = Assertions()
        bot = User("bot", 1, false)
    }

    @After
    fun tearDown(){
        assertions = Assertions()
        bot = User()
    }

    @Test
    fun getArrayTest(){
        val array = arrayOf(12,25)
        assertArrayEquals(array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest(){
        assertEquals("Brian", Assertions().getName())
    }

    @Test
    fun checkHumanTest(){
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(brian))
    }

    @Test
    fun checkNullUserTest(){

        val user = null
        assertNull(user)
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotSameUsers(){
        assertNotSame(bot, brian)
        assertSame(brian, brian)
    }

    @Test(timeout = 1000)
    fun getCitiesTest(){
        val cities = arrayOf("cuenca", "CDMX", "Bogota")
        Thread.sleep(100)
        assertEquals(3, cities.size)
    }
}