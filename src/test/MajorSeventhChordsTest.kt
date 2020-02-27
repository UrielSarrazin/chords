import Note.*
import Quality.*
import kotlin.test.Test

class MajorSeventhChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, E, G, B)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F_SHARP, A, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G_SHARP, B, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, E)
    }

    @Test
    fun resolveInKeyOfF() {
        val notes = listOf(F, A, C, E)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, F)
    }

    @Test
    fun resolveInKeyOfG() {
        val notes = listOf(G, B, D, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, G)
    }

    @Test
    fun resolveInKeyOfA() {
        val notes = listOf(A, C_SHARP, E, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, A)
    }

    @Test
    fun resolveInKeyOfB() {
        val notes = listOf(B, D_SHARP, F_SHARP, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSeventh(chord, B)
    }

    private fun assertMajorSeventh(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MAJOR_SEVENTH)
    }
}