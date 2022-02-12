from music21 import *
import random

# keyDetune = []
# for i in range(0, 127):
#     keyDetune.append(random.randint(-30, 30))

# b = corpus.parse('bach/bwv66.6')
# # for n in b.flat.notes:
# #     n.microtone = keyDetune[n.midi]
# sp = midi.realtime.StreamPlayer(b)
# sp.play()

## Kirsten
c = note.Note('C')
print("c accs", c.pitch.accidental)

c.pitch.accidental = pitch.Accidental('flat')
print("c accs", c.pitch.accidental)

d = note.Note('D')
c.pitch.accidental = pitch.Accidental('sharp')


print(note.Note('F#3').pitch.accidental)

m = stream.Measure()
m.append(c)
m.append(d)
m.append(note.Note('A'))

p = stream.Part()
p.append(m)

sc = stream.Score(p)