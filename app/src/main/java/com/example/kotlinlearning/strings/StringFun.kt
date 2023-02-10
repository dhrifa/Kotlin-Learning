package com.example.kotlinlearning.strings

//
//1) Reverse a string input: aaba -> abaa
//
fun reverseString(str: String): String {
    return str.reversed()
}
//
//3) validate a credit card:

fun validateCard(card: String, exp: String, list: List<Int>): Boolean {
    val expDate = exp.replace("/", "")
    val lastFour = card.takeLast(4)

    val firstFour = card.take(4).toInt()
//    val list = listOf(1111, 1232, 5627, 8121)
    return (expDate == lastFour && (firstFour in list))
}

fun main() {
    var paragragh = "some random string @test challenge @okay"
    val map = "@test is Laptop, @okay is Gone"
    var listWords = arrayListOf<String>()
    val listAnnotatedMapWords = arrayListOf<String>()
    val annotationRef = mapOf<String, String>("@Test" to "Laptop")

    for (word in paragragh.split(" ")) {
        listWords.add(word)
    }
    listWords.map {
        if (it=="@test") "laptop" else it
//        if (it=="@okay") "gone" else it

    }
    println(listWords)

    println(paragragh)

    //1
    val s = "aaba"
    println("$s inversed: ${reverseString(s)}")
    //2

    //3
    val card = "1111-2321-7625-1234"
    val list = listOf(1111, 1232, 5627, 8121)
    val date = "12/34"
    println("card validation: ${validateCard(card, date,list)}")
}

//
//2) Replace annotations in a string with the provided map.
//Example -> input one: "some random string @test challenge @okay"
//Input two: @test is Laptop, @okay is Gone
//Output: some random string Laptop challenge Gone
//

fun stringAnnotaionReplace(str: String, strReplace: List<String>): String {
    var paragragh = "some random string @test challenge @okay"
    val map = "@test is Laptop, @okay is Gone"
    val listAnnotatedWords = arrayListOf<String>()//list of annotated words: to be replaced
    val listAnnotatedMapWords = arrayListOf<String>()//list of word replacement
    //my idea is to get those 2 lists and map the 1st list to the second //but i dont know how

    for (word in paragragh.split(" ")) {
        if (word.startsWith("@")) listAnnotatedWords.add(word)
    }
    for (word in map.split(" ")) {
        if (word.startsWith("@")) listAnnotatedMapWords.add(word)
    }
    for (word in listAnnotatedWords) {
        val index = word.indices
//          paragragh.replace(word, listAnnotatedMapWords[indexOf(word)])

    }

    return ""
}
