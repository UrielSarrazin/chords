import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Major Seventh Chords")
class MajorSeventhChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, E, G, B)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, F_SHARP, A, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, G_SHARP, B, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, A, C, E)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, B, D, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, C_SHARP, E, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, D_SHARP, F_SHARP, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, B)
    }

    private fun assertMajorSeventh(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, MAJOR_SEVENTH)
    }
}