class ChordResolver {
    fun resolve(notes: List<Note>) : Chord {
        val distance = notes[1].semitonOffset - notes[0].semitonOffset
        val quality = if(distance == 3) "minor" else "major"
        return Chord(notes[0], quality)
    }
}
