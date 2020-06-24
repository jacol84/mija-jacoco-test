package mija.jacoco.test.cross

import mija.jacoco.test.a.ModuleA
import mija.jacoco.test.b.ModuleB

class ModuleCross {

    private val moduleA: ModuleA by lazy { ModuleA() }
    private val moduleB: ModuleB by lazy { ModuleB() }

    fun greeting(name: String): String {
        val isAdmin = moduleA.isAdmin(name)
        return if (isAdmin) {
            moduleB.greeting("admin", name)
        } else {
            moduleB.greeting(name)
        }
    }


}