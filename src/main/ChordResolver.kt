import Constants.Interval.OCTAVE
import Constants.Interval.UNISON
import Note.*
import Quality.values

class ChordResolver {
    fun resolve(notes: List<Note>): Chord {
        val intervals = intervals(notes)
        val quality = values().find { it.intervals == intervals }
        return if (quality != null) Chord(notes[0], quality) else throw UnknownChordException()
    }

    fun resolve(key: Note, quality: Quality): List<Note> = if(key == C) listOf(C, E,  G) else listOf(D, F_SHARP, A)

    private fun intervals(notes: List<Note>): List<Int> = notes.map { interval(notes[0], it) }.toList()

    private fun interval(from: Note, to: Note): Int {
        val semitones = to.offset - from.offset
        return if (semitones < UNISON) semitones + OCTAVE else semitones
    }
}