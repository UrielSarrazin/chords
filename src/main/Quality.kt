enum class Quality(val intervals: List<Interval>) {
    MAJOR(listOf(
            Interval.UNISON,
            Interval.MAJOR_THIRD,
            Interval.PERFECT_FIFTH
    )),
    MINOR(listOf(
            Interval.UNISON,
            Interval.MINOR_THIRD,
            Interval.PERFECT_FIFTH
    )),
    DIMINISHED(listOf(
            Interval.UNISON,
            Interval.MINOR_THIRD,
            Interval.DIMINISHED_FIFTH
    )),
    AUGMENTED(listOf(
            Interval.UNISON,
            Interval.MAJOR_THIRD,
            Interval.AUGMENTED_FIFTH
    )),
    MAJOR_SEVENTH(listOf(
            Interval.UNISON,
            Interval.MAJOR_THIRD,
            Interval.PERFECT_FIFTH,
            Interval.MAJOR_SEVENTH
    )),
    MINOR_SEVENTH(listOf(
            Interval.UNISON,
            Interval.MINOR_THIRD,
            Interval.PERFECT_FIFTH,
            Interval.MINOR_SEVENTH
    )),
    DOMINANT_SEVENTH(listOf(
            Interval.UNISON,
            Interval.MAJOR_THIRD,
            Interval.PERFECT_FIFTH,
            Interval.MINOR_SEVENTH
    )),
    MAJOR_SIXTH(listOf(
            Interval.UNISON,
            Interval.MAJOR_THIRD,
            Interval.PERFECT_FIFTH,
            Interval.MAJOR_SIXTH
    )),
    MINOR_SIXTH(listOf(
            Interval.UNISON,
            Interval.MINOR_THIRD,
            Interval.PERFECT_FIFTH,
            Interval.MAJOR_SIXTH
    )),
    FIFTH(listOf(
            Interval.UNISON,
            Interval.PERFECT_FIFTH
    ))
}

fun byIntervals(intervals: List<Interval>): Quality {
    return Quality.values().find { it.intervals == intervals } ?: throw UnknownIntervalException()
}