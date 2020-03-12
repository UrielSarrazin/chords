import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Minor Seventh Chords")
class MinorSeventhChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, D_SHARP, G, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, F, A, C)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, G, B, D)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, G_SHARP, C, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, A_SHARP, D, F)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, C, E, G)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, D, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, B)
    }

    private fun assertMinorSeventh(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, MINOR_SEVENTH)
    }
}