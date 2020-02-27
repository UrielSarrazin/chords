import Note.*
import Quality.*
import kotlin.test.Test

class DominantSeventhChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, E, G, B_FLAT)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F_SHARP, A, C)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G_SHARP, B, D)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, A, C, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, B, D, F)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, C_SHARP, E, G)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, D_SHARP, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, B)
    }

    private fun assertDominantSeventh(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, DOMINANT_SEVENTH)
    }
}