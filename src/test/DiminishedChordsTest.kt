import Note.*
import Quality.*
import kotlin.test.Test

class DiminishedChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, D_SHARP, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, G_SHARP, B)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, A_SHARP, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, C, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, D, F)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, B)
    }

    private fun assertDiminished(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, DIMINISHED)
    }
}