fun main() {

    val list = listOf(1, 3, 4, 5).applyToCollection {
        map { it + 4 }
    }

    println(
        "list: $$list"
    )

    val result = list.fold(0) { acc, nextElement ->
        println("acc = $acc, i= $nextElement ")
        val result = acc + nextElement
        result
    }


    val items = listOf(1, 2, 3, 4, 5)

    // Parameter types in a lambda are optional if they can be inferred:
    val joinedToString = items.fold("Elements:") { acc, i ->
        "$acc $i"
    }

    // Function references can also be used for higher-order function calls:
    val product = items.fold(1, Int::times)

    println("result = $result")
    println("joinedToString = $joinedToString")
    println("product = $product")
}