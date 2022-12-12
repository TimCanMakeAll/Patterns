fun main() {

    Sun.getSun()

    Sun.setTemperature(1000)
    Sun.setBrightness(2000)

    Sun.getSun()
}

object Sun{

    var temperature: Int? = null
    var brightness: Int? = null

    fun setTemperature(temperature: Int){ this.temperature = temperature }

    fun setBrightness(brightness: Int){ this.brightness = brightness }

    fun getSun(){ println("$temperature\t$brightness") }
}