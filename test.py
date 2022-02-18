from music21 import *
import random


stream1 = stream.Stream()

measure1 = stream.Measure()

measure1.append(note.Note('C3'))
measure1.append(note.Note('D3'))
measure1.append(note.Note('E3'))
measure1.leftBarline = bar.Repeat(direction='start')
measure1.rightBarline = bar.Repeat(direction='end')
measure1.rightBarline.times = 3

# stream1.append(bar.Repeat(direction='start'))
# stream1.append(measure1)
# stream1.append(bar.Repeat(direction='end', times=3))

# b = corpus.parse('bach/bwv66.6')
# for n in b.flat.notes:
#     n.microtone = keyDetune[n.midi]
sp = midi.realtime.StreamPlayer(stream1)
sp.play()