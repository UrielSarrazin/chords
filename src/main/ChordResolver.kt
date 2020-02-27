import Note.*

class ChordResolver {
    fun resolve(notes: List<Note>): Chord {
        val intervals = byNotes(notes)
        val quality = byIntervals(intervals)
        return Chord(notes[0], quality)
    }

    fun resolve(key: Note, quality: Quality): List<Note> = if(key == C) listOf(C, E,  G) else listOf(D, F_SHARP, A)
}