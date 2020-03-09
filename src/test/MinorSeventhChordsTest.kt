import Note.*
import Quality.*
import org.junit.jupiter.api.Test

class MinorSeventhChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, D_SHARP, G, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F, A, C)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G, B, D)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, G_SHARP, C, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, A_SHARP, D, F)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, C, E, G)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, D, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, B)
    }

    private fun assertMinorSeventh(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, MINOR_SEVENTH)
    }
}