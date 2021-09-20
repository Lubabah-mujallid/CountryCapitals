/*Create a list of 3 countries
Create an empty ArrayList
Ask the user to enter the the capital of each country in the list
Add each capital to the ArrayList
Print all countries and their capitals by iterating through the list and the ArrayList*/
fun main() {
    println(
        "Let's play a game, Human." +
                "\n I will say a country name, I dare you tell me its capital." +
                "\n ------------------------------------------------------------"
    )

    val countries = listOf<String>("US", "UK", "KSA")
    var capitals = arrayListOf<String>()

    for (i in countries.indices) {
        print("What is the capital of ${countries[i]}? ")
        capitals.add(readLine()!!)
    }
    for (i in countries.indices) {
        println("The capitla of ${countries[i]} is ${capitals[i]}.")
    }
}

