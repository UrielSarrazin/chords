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
    ))
}

fun byIntervals(intervals: List<Interval>): Quality {
    return Quality.values().find { it.intervals == intervals } ?: throw UnknownIntervalException()
}