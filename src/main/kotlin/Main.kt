fun main() {

    val coffeeOrder = CoffeeOrder.Builder()
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
            "${coffeeOrder.syrup}")
}