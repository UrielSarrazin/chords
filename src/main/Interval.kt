enum class Interval(val semitones: Int) {
    UNISON(0),
    MINOR_SECOND(1),
    MAJOR_SECOND(2),
    MINOR_THIRD(3),
    MAJOR_THIRD(4),
    PERFECT_FOURTH(5),
    DIMINISHED_FIFTH(6),
    PERFECT_FIFTH(7),
    AUGMENTED_FIFTH(8),
    MAJOR_SIXTH(9),
    MINOR_SEVENTH(10),
    MAJOR_SEVENTH(11),
    OCTAVE(12);

    companion object {
        fun from(notes: List<Note>): List<Interval> = notes.map { from(notes[0], it) }.toList()

        fun from(from: Note, to: Note): Interval {
            val semitones = to.offset - from.offset
            val distance = if (semitones < UNISON.semitones) semitones + OCTAVE.semitones else semitones
            return from(distance)
        }

        private fun from(semitones: Int): Interval {
            return values().find { it.semitones == semitones } ?: throw UnknownIntervalException()
        }
    }
}