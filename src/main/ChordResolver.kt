import Interval.*
import Quality.MAJOR
import Quality.MINOR

class ChordResolver {
    fun resolve(notes: List<Note>): Chord {
        val key = notes[0]
        val quality = quality(notes)
        return Chord(key, quality)
    }

    private fun quality(notes: List<Note>): Quality {
        return when (calculateInterval(notes)) {
            MINOR_THIRD.semitones -> MINOR
            MAJOR_THIRD.semitones -> MAJOR
            else -> throw UnknownQualityException()
        }
    }

    private fun calculateInterval(notes: List<Note>): Int {
        val distance = notes[1].semitonOffset - notes[0].semitonOffset
        return if (distance < UNISON.semitones) distance + OCTAVE.semitones else distance
    }
}
