fun <T> Collection<T>.applyToCollection(body: Collection<T>.() -> Unit): Collection<T> {
    this.body()
    return this
}

fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}