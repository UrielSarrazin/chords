class ChordResolver {
    fun resolve(notes: List<Note>): Chord {
        val intervals = Interval.from(notes)
        val quality = Quality.from(intervals)
        return Chord(notes[0], quality)
    }

    fun resolve(key: Note, quality: Quality): List<Note> = quality.intervals.map { Note.from(key, it) }
}