package com.monksoft.fundamentosjunit

import org.junit.*
import org.junit.Assert.*

class AssertionsUsersAdultTest {

    private lateinit var assertions : Assertions
    private lateinit var bot : User
    private lateinit var brian : User

    @get:Rule val locationESRule = LocationESRule()

    @Before
    fun setup(){
        assertions = Assertions()
        bot = User("bot", 1, false)
        brian = User("brian", 19, true)
    }

    @After
    fun tearDown(){
        assertions = Assertions()
        bot = User()
        brian = User()
    }

    @Test
    fun isAdultTest() {
        //assertTrue(assertions.isAdult(brian))
        assertEquals(true, locationESRule.assertions?.isAdult(brian))
    }
}