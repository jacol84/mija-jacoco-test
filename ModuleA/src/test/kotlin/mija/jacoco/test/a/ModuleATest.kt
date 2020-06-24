package mija.jacoco.test.a

import kotlin.test.Test
import kotlin.test.assertEquals


internal class ModuleATest {

    @Test
    fun runForTrue() {
        //given
        val value = true
        val moduleA = ModuleA()
        //when
        val result = moduleA.run(value)
        //then
        assertEquals("is true->test", result)
    }

    @Test
    fun runForFalse() {
        //given
        val value = false
        val moduleA = ModuleA()
        //when
        val result = moduleA.run(value)
        //then
        assertEquals("is false->test", result)
    }

    @Test
    fun runDto() {
        //given
        val value = Dto("key", 100L)
        val moduleA = ModuleA()
        //when
        val result = moduleA.run(value)
        //then
        assertEquals("it is dto Dto(key=key, id=100)", result)
    }
}