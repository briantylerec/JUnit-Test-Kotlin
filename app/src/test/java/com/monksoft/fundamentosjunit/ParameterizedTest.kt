package com.monksoft.fundamentosjunit

import junit.framework.TestCase.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest (var currentValue: Boolean, var currentUser: User) {

    @get:Rule val locationESRule = LocationESRule()

    companion object {
        @Parameterized.Parameters @JvmStatic
        fun getUsersUS() = arrayOf(
            arrayOf(true, User("Juan", 19)),
            arrayOf(true, User("pedro", 34)),
            arrayOf(false, User("bot21", 4, false)),
            arrayOf(true, User("fabian", 21))
        )
    }

    @Test
    fun isAdultTest() {
        assertEquals(currentValue, locationESRule.assertions?.isAdult(currentUser))
    }
}