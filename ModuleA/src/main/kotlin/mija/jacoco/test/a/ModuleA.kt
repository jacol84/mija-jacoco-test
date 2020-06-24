package mija.jacoco.test.a

class ModuleA {

    fun run(any: Any): String {
        val s = when (any) {
            is Boolean -> (if (any) "is true" else "is false") + "->test"
            is Dto -> "it is dto $any"
            else -> "not found"
        }
        if (s == "not found") {
            return any.toString()
        }
        return s
    }

    fun isAdmin(name: String): Boolean {
        return when (name.toLowerCase()) {
            "jacek" -> true
            "miri" -> true
            in "x", "y", "z" -> true
            else -> false
        }

    }

}