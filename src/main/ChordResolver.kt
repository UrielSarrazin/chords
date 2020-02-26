class ChordResolver {
    fun resolve(notes: List<String>) : Chord = if (notes[0] == "C") Chord() else Chord("D")
}
