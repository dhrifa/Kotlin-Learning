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
    //1
    val s = "aaba"
    println("$s inversed: ${reverseString(s)}")

    //2
    var paragragh = "some random string @test challenge @okay"
    val map = "@test is Laptop, @okay is Gone"
    println(stringAnnotaionReplace(paragragh))
    //3
    val card = "1111-2321-7625-1234"
    val list = listOf(1111, 1232, 5627, 8121)
    val date = "12/34"
    println("card validation: ${validateCard(card, date, list)}")
}

//
//2) Replace annotations in a string with the provided map.
//Example -> input one: "some random string @test challenge @okay"
//Input two: @test is Laptop, @okay is Gone
//Output: some random string Laptop challenge Gone
//

fun stringAnnotaionReplace(paragragh: String): String {

    val listWords = arrayListOf<String>()//[some, random, string, @test, challenge, @okay]
    val listAnnotatedWords = arrayListOf<String>()//@test, @okay
    val listMap = arrayListOf("laptop", "Gone")//=> how tto get those by coding

    for (word in paragragh.split(" ")) {
        listWords.add(word)
        if (word.startsWith("@")) listAnnotatedWords.add(word)
    }
    println(listWords)

    listAnnotatedWords.forEach {
        val position = listWords?.indexOf(it)
        val positionMap = listAnnotatedWords.indexOf(it)
        if (position != null)
        listWords[position] = listMap[positionMap] //can i use map here?
    }

//    val posTest = listWords.indexOfFirst { it == "@test" }
//    listWords[posTest] = "laptop"
//    val posOkay = listWords.indexOfFirst { it == "@okay" }
//    listWords[posOkay] = "Gone"
    var text = ""
    listWords.forEach { text = "$text $it " }

    return text
}


fun stringAnnotaionReplace2(paragragh: String, strReplace: List<String>): String {
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
