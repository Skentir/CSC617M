from music21 import *
import random

def declareChord(note_arr):
    arr = []
    for num, pitch, val in note_arr:
        
        arr.append(str(pitch) + str(num))
    # TODO : copy val in createNote
    return chord.Chord(arr)

keyDetune = []
for i in range(0, 127):
    keyDetune.append(random.randint(-30, 30))

b = corpus.parse('bach/bwv66.6')
# for n in b.flat.notes:
#     n.microtone = keyDetune[n.midi]
sp = midi.realtime.StreamPlayer(b)
sp.play()