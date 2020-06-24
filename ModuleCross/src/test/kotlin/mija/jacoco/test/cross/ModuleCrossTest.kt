package mija.jacoco.test.cross

import kotlin.test.Test
import kotlin.test.assertEquals


internal class ModuleCrossTest {

    @Test
    fun jacekHaveAllPermission() {
        //given
        val module = ModuleCross()
        val name = "jacek"
        //when
        val result = module.greeting(name)
        //
        assertEquals("welcome admin jacek, you have all permissions", result)
    }

    @Test
    fun jacek2HaveNormalPermissions() {
        //given
        val module = ModuleCross()
        val name = "jacek2"
        //when
        val result = module.greeting(name)
        //
        assertEquals("welcome JACEK2, you have normal permissions ", result)
    }
}