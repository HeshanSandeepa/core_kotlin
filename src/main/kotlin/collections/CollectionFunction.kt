package collections



fun main(args: Array<String>) {

    val list = listOf(1,5,6,9,8,2,4,5,4,5,8,)
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    // any, return true, if any value matched the condition
    val anyOdd = list.any { it % 2 == 1 }
    println(anyOdd)

    // all, return true, if all elements matched the condition
    val allArePositive = list.all { it > 0 }
    println(allArePositive)

    // none, returns true, if no element matches the condition
    val nonMatched = list.none { it > 100 }
    println(nonMatched)

    // find first, returns the first, that the condition is matched
    val elementsWithSome = words.find { it.startsWith("some") }
    println(elementsWithSome)

    // finds last, returns the last, that the condition is matched
    val lastElementWithSome = words.findLast { it.startsWith("some") }
    println(lastElementWithSome)

    // first
    println(words.first())
    println(words.first{ it.startsWith("some")})

    // last
    println(words.last())
    println(words.last{ it.startsWith("some")})

    // count
    println(list.count())
    println(list.count { it > 8 })

    // associated by
    data class Person(val name: String, val city: String, val phone: String) // 1

    val people = listOf(                                                     // 2
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

    val phoneBook = people.associateBy { it.phone }
    println(phoneBook)// 3
    val cityBook = people.associateBy(Person::phone, Person::city)
    println(cityBook)// 4
    val peopleCities = people.groupBy(Person::city, Person::name)
    println(peopleCities)// 5
    val lastPersonCity = people.associateBy(Person::city, Person::name)
    println(lastPersonCity)

    // partition
    val numbers = listOf(1,0,-9,8,-6,2,-7)
    val (even, odd) = numbers.partition { it % 2 == 0 }
    println(even)
    println(odd)
}

