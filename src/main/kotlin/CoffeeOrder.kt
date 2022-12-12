fun main(){

    val coffeeOrder = CoffeeOrder.Builder()

    println("${coffeeOrder.coffee}\n" +
            "${coffeeOrder.doubleCoffee}" +
            "\n${coffeeOrder.milk}" +
            "\n${coffeeOrder.cream}" +
            "\n${coffeeOrder.cinnamon}\n" +
            "${coffeeOrder.sugar}\n" +
            "${coffeeOrder.syrup}\n")

    coffeeOrder
        .coffee("Coffee")
        .milk("Milk")
        .cream("Cream")
        .sugar("White Sugar")
        .syrup("Cherry Syrup")
        .build()

    println("${coffeeOrder.coffee}\n" +
            "${coffeeOrder.doubleCoffee}" +
            "\n${coffeeOrder.milk}" +
            "\n${coffeeOrder.cream}" +
            "\n${coffeeOrder.cinnamon}\n" +
            "${coffeeOrder.sugar}\n" +
            "${coffeeOrder.syrup}\n")
}

class CoffeeOrder private constructor(

    val coffee: String?,
    val doubleCoffee: String?,
    val milk: String?,
    val cream: String?,
    val sugar: String?,
    val cinnamon: String?,
    val syrup: String?) {

    data class Builder(
        var coffee: String? = null,
        var doubleCoffee: String? = null,
        var milk: String? = null,
        var cream: String? = null,
        var sugar: String? = null,
        var cinnamon: String? = null,
        var syrup: String? = null) {

        fun coffee(coffee: String) = apply { this.coffee = coffee }
        fun doubleCoffee(doubleCoffee: String) = apply { this.doubleCoffee = doubleCoffee }
        fun milk(milk: String) = apply { this.milk = milk }
        fun cream(cream: String) = apply { this.cream = cream }
        fun sugar(sugar: String) = apply { this.sugar = sugar }
        fun cinnamon(cinnamon: String) = apply { this.cinnamon = cinnamon }
        fun syrup(syrup: String) = apply { this.syrup = syrup }
        fun build() = CoffeeOrder(coffee, doubleCoffee, milk, cream, sugar, cinnamon, syrup)
    }
}