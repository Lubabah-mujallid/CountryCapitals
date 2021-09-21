/*Create an ArrayList of ArrayLists containing two strings (country and capital)
Create a string variable to hold a country and a string variable to hold a capital
Ask the user to enter a country and capital, then add the pair to the 2d ArrayList
After the user has entered 3 pairs, print each country and its capital*/

fun main(){
    println("HUMAN! HUMAN! " +
            "\nI am bored, YOU have to entertain ME!" +
            "\nTell me about your planet, EARTH!" +
            "\nI want country names and their capitals, " +
            "\nI shall add them to my 'to destroy' list!" +
            "\nHOHOHO!! *more evil luaghter*" +
            "\nNOW, GIVE ME THE NAMES! *creepy smile*")

    val countryCapitalArrayList = ArrayList<ArrayList<String>>()
    for(i in 0..2){
        print("What is the country name? ")
        val country = readLine()!!
        print("GOOD, GOOD! now what is name of its capital? ")
        val capital = readLine()!!
        countryCapitalArrayList.add(arrayListOf(country,capital))
        println("Good, I added them to the agenda. Next!!")
    }
    print(countryCapitalArrayList)

}