import Interval.OCTAVE
import Interval.UNISON

enum class Interval(val semitones: Int) {
    UNISON(0),
    MINOR_THIRD(3),
    MAJOR_THIRD(4),
    PERFECT_FIFTH(7),
    MAJOR_SIXTH(9),
    MINOR_SEVENTH(10),
    MAJOR_SEVENTH(11),
    OCTAVE(12)
}

fun byNotes(notes: List<Note>): List<Interval> = notes.map { intervalBetween(notes[0], it) }.toList()

private fun intervalBetween(from: Note, to: Note): Interval {
    val semitones = to.offset - from.offset
    val distance = if (semitones < UNISON.semitones) semitones + OCTAVE.semitones else semitones
    return bySemitones(distance)
}

private fun bySemitones(semitones: Int): Interval {
    return Interval.values().find { it.semitones == semitones } ?: throw UnknownIntervalException()
}