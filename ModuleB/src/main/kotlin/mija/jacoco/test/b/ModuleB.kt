package mija.jacoco.test.b

class ModuleB {

    fun greeting(role: String, userName: String = ""): String {
        if (isAdmin(role)) {
            return "welcome admin $userName, you have all permissions"
        }
        return "welcome ${role.toUpperCase()}, you have normal permissions "
    }

    private fun isAdmin(role: String) = role == "admin"


}