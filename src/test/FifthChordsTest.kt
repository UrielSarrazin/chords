import Note.*
import Quality.FIFTH
import kotlin.test.Test

class FifthChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, G)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, A)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, B)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, C)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, D)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, E)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, B)
    }

    private fun assertFifth(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, FIFTH)
    }
}