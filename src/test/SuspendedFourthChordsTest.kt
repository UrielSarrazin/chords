import Note.*
import Quality.*
import org.junit.jupiter.api.Test

class SuspendedFourthChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, F, G)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedFourth(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, G, A)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedFourth(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, A, B)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedFourth(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, A_SHARP, C)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedFourth(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, C, D)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedFourth(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, D, E)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedFourth(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, E, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedFourth(chord, B)
    }

    private fun assertSuspendedFourth(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, SUSPENDED_FOURTH)
    }
}