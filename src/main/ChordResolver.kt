import Constants.Interval.OCTAVE
import Constants.Interval.UNISON
import Quality.values

class ChordResolver {
    fun resolve(notes: List<Note>): Chord {
        val intervals = intervals(notes)
        val quality = values().find { it.intervals == intervals }
        return if (quality != null) Chord(notes[0], quality) else throw UnknownChordException()
    }

    private fun intervals(notes: List<Note>): List<Int> = notes.map { interval(notes[0], it) }.toList()

    private fun interval(from: Note, to: Note): Int {
        val semitones = to.offset - from.offset
        return if (semitones < UNISON) semitones + OCTAVE else semitones
    }
}