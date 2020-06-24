package mija.jacoco.test.b


import kotlin.test.Test
import kotlin.test.assertEquals

internal class ModuleBTest {

    @Test
    fun greetingJacek() {
        //given
        val name = "jacek"
        val module = ModuleB()
        //when
        val greeting = module.greeting(name)
        //then
        assertEquals("welcome JACEK, you have normal permissions ",greeting)
    }
    @Test
    fun greetingMiri() {
        //given
        val name = "Miri"
        val module = ModuleB()
        //when
        val greeting = module.greeting(name)
        //then
        assertEquals("welcome MIRI, you have normal permissions ",greeting)
    }

}