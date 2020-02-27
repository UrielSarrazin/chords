fun assertTrue(chord: Chord, expectedKey: Note, expectedQuality: Quality) {
    kotlin.test.assertTrue { chord.key == expectedKey }
    kotlin.test.assertTrue { chord.quality == expectedQuality }
}
