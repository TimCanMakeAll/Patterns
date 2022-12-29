fun main() {

    val artem = User("Artem")
    val artemData = UserManager().getData(artem)
    println(artemData)

    val ivan = User("Ivan")
    val ivanData = UserManager().getData(ivan)
    println(ivanData)

    val nikolai = User("Nikolai")
    val nikolaiData = UserManager().getData(nikolai)
    println(nikolaiData)
}

class User(val name: String)

class UserManager(val cache: CacheManager = CacheManager()) {

    fun getData(user: User): String? {
        return cache.getUserCache(user.name)
    }
}

class CacheManager {

    val usersCache = HashMap<String, String>()

    init {
        usersCache["Ivan"] = "Ivan_Cache"
    }

    fun getUserCache(key: String): String? {

        if (usersCache[key] != null) {
            return usersCache[key]
        } else {
            return saveUserApiAsCache(key)
        }
    }

    private fun saveUserApiAsCache(key: String): String? {
        usersCache[key] = ApiManager().getUserApi(key)
        return usersCache[key]
    }
}

class ApiManager {

    private val usersApi = HashMap<String, String>()

    init {
        usersApi["Artem"] = "Artem_Api"
        usersApi["Ivan"] = "Ivan_Api"
    }

    fun getUserApi(key: String): String {

        if (usersApi[key] == null) {
            usersApi[key] = generateApi(key)
            return usersApi[key].toString()
        } else {
            return usersApi[key].toString()
        }
    }

    private fun generateApi(key: String): String {
        println("You may enter API for $key:")
        return readln()
    }
}