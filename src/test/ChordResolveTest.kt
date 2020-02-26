import kotlin.test.Test
import kotlin.test.assertTrue

class ChordResolveTest {
    @Test
    fun resolveCMajorChord() {
        val notes = listOf("C", "E", "G")
        val chord = ChordResolver().resolve(notes)
        assertTrue { chord.key == "C" }
        assertTrue { chord.quality == "major" }
    }

    @Test
    fun resolveDMajorChord() {
        val notes = listOf("D", "F#", "A")
        val chord = ChordResolver().resolve(notes)
        assertTrue { chord.key == "D" }
        assertTrue { chord.quality == "major" }
    }
}