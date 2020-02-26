import Interval.*
import Quality.MAJOR
import Quality.MINOR
import java.lang.Exception

class ChordResolver {
    fun resolve(notes: List<Note>): Chord {
        val key = notes[0]
        val quality = quality(notes)
        validatePerfectFifth(notes)
        return Chord(key, quality)
    }

    private fun quality(notes: List<Note>): Quality {
        return when (interval(notes[0], notes[1])) {
            MINOR_THIRD.semitones -> MINOR
            MAJOR_THIRD.semitones -> MAJOR
            else -> throw UnknownQualityException()
        }
    }

    private fun validatePerfectFifth(notes: List<Note>) {
        if (interval(notes[0], notes[2]) != PERFECT_FIFTH.semitones) {
            throw Exception()
        }
    }

    private fun interval(from: Note, to: Note): Int {
        val semitones = to.semitonOffset - from.semitonOffset
        return if (semitones < UNISON.semitones) semitones + OCTAVE.semitones else semitones
    }
}
