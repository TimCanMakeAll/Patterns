fun main() {

    DeliveryParamFactory.deliveryForCountry(Russia)
    DeliveryParamFactory.deliveryForCountry(Belarus)
    DeliveryParamFactory.deliveryForCountry(USA)
    DeliveryParamFactory.deliveryForCountry(Germany)
}

sealed class Country

object Russia: Country()
object USA: Country()
object Belarus: Country()
object Germany: Country()

open class DeliveryCompany(name: String, maxWeight: Int, maxSize: Int)

class WaterDelivery(name: String, maxWeight: Int, maxSize: Int, var waterType: String) :
    DeliveryCompany(name, maxWeight, maxSize) {

        init {

            while (waterType != "River" && waterType != "Sea"){

                println("Please, enter type of water where delivery will take place (River or Sea):\n")
                waterType = readln()
            }
        }
    }

class RailwayDelivery(name: String, maxWeight: Int, maxSize: Int, trackWidth: Double, ballastExist: Boolean) :
    DeliveryCompany(name, maxWeight, maxSize)

class AirDelivery(name: String, maxWeight: Int, maxSize: Int, var flightType: String, var airplaneType: String) :
    DeliveryCompany(name, maxWeight, maxSize) {

    init {

        while (flightType != "InsideCity" && flightType != "Intercity" && flightType != "International"){

            println("Please, enter type of flight where delivery will take place (InsideCity or Intercity or International):\n")
            flightType = readln()
        }
        while (airplaneType!= "Passenger" && airplaneType != "Freight"){

            println("Please, enter type of airplaneType where delivery will take place (Passenger or Freight):\n")
            airplaneType = readln()
        }
    }
}

class CarDelivery(name: String, maxWeight: Int, maxSize: Int) :
    DeliveryCompany(name, maxWeight, maxSize)

object DeliveryParamFactory{

    fun deliveryForCountry(country: Country){

        when(country){

            is Russia -> RailwayDelivery("RussianRailway", 100, 100, 1.5, false)
            is USA -> WaterDelivery("BigShip", 100000, 100000, "Sea")
            is Belarus -> CarDelivery("TruckBelarus", 15, 35)
            is Germany -> AirDelivery("AirFlot", 40, 40, "Intercity", "Passenger")
        }
    }

}