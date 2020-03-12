import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Suspended Second Chords")
class SuspendedSecondChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, D, G)
        val chord = resolve(notes)
        assertSuspendedSecond(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, E, A)
        val chord = resolve(notes)
        assertSuspendedSecond(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, F_SHARP, B)
        val chord = resolve(notes)
        assertSuspendedSecond(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, G, C)
        val chord = resolve(notes)
        assertSuspendedSecond(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, A, D)
        val chord = resolve(notes)
        assertSuspendedSecond(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, B, E)
        val chord = resolve(notes)
        assertSuspendedSecond(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, C_SHARP, F_SHARP)
        val chord = resolve(notes)
        assertSuspendedSecond(chord, B)
    }

    private fun assertSuspendedSecond(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, SUSPENDED_SECOND)
    }
}