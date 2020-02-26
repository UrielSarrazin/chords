import Note.*
import kotlin.test.Test
import kotlin.test.assertTrue

class ChordResolveTest {
    @Test
    fun resolveCMajorChord() {
        val notes = listOf(C, E, G)
        val chord = ChordResolver().resolve(notes)
        assertTrue { chord.key == C }
        assertTrue { chord.quality == "major" }
    }

    @Test
    fun resolveDMajorChord() {
        val notes = listOf(D, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertTrue { chord.key == D }
        assertTrue { chord.quality == "major" }
    }

    @Test
    fun resolveEMajorChord() {
        val notes = listOf(E, G_SHARP, B)
        val chord = ChordResolver().resolve(notes)
        assertTrue { chord.key == E }
        assertTrue { chord.quality == "major" }
    }
}