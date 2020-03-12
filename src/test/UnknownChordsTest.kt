import Note.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

@DisplayName("Unknown Chords")
class UnknownChordsTest {
    @Test
    fun unknownChordThrowException() {
        val notes = listOf(A, B, C)
        assertFailsWith(UnknownIntervalException::class) {
            resolve(notes)
        }
    }
}