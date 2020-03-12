import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Suspended Fourth Chords")
class SuspendedFourthChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, F, G)
        val chord = resolve(notes)
        assertSuspendedFourth(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, G, A)
        val chord = resolve(notes)
        assertSuspendedFourth(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, A, B)
        val chord = resolve(notes)
        assertSuspendedFourth(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, A_SHARP, C)
        val chord = resolve(notes)
        assertSuspendedFourth(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, C, D)
        val chord = resolve(notes)
        assertSuspendedFourth(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, D, E)
        val chord = resolve(notes)
        assertSuspendedFourth(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, E, F_SHARP)
        val chord = resolve(notes)
        assertSuspendedFourth(chord, B)
    }

    private fun assertSuspendedFourth(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, SUSPENDED_FOURTH)
    }
}