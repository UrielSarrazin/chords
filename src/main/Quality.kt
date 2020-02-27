import Constants.Interval.MAJOR_THIRD
import Constants.Interval.MINOR_THIRD
import Constants.Interval.PERFECT_FIFTH
import Constants.Interval.UNISON

enum class Quality(val intervals: List<Int>) {
    MAJOR(listOf(
            UNISON,
            MAJOR_THIRD,
            PERFECT_FIFTH
    )),
    MINOR(listOf(
            UNISON,
            MINOR_THIRD,
            PERFECT_FIFTH
    ));
}