import Note.*
import Quality.*
import org.junit.jupiter.api.Test

class SuspendedSecondChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, D, G)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedSecond(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, E, A)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedSecond(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, F_SHARP, B)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedSecond(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, G, C)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedSecond(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, A, D)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedSecond(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, B, E)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedSecond(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, C_SHARP, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertSuspendedSecond(chord, B)
    }

    private fun assertSuspendedSecond(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, SUSPENDED_SECOND)
    }
}