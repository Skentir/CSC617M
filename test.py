from music21 import *
import random


stream1 = stream.Score()
part = stream.Part()
part.append(instrument.Violin())


measure1 = stream.Measure()

measure1.append(note.Note('C2'))
measure1.append(note.Note('D2'))
measure1.append(note.Note('E2'))

measure2 = stream.Measure()

measure2.append(note.Note('C3'))
measure2.append(note.Note('D3'))
measure2.append(note.Note('E3'))
measure2.rightBarline = bar.Repeat(direction='end')
measure2.rightBarline.times = 2


measure3 = stream.Measure()

measure3.append(note.Note('C4'))
measure3.append(note.Note('D4'))
measure3.append(note.Note('E4'))


part.append(measure1)
part.append(measure2)
part.append(measure3)
repeat.insertRepeatEnding(part, 2, 2, 1)
repeat.insertRepeatEnding(part, 3, 3, 2)
# stream1.append(bar.Repeat(direction='start'))
stream1.append(part)
# stream1.append(bar.Repeat(direction='end', times=3))

# b = corpus.parse('bach/bwv66.6')
# for n in b.flat.notes:
#     n.microtone = keyDetune[n.midi]
# sp = midi.realtime.StreamPlayer(stream1)
# sp.play()


c1 = corpus.parse('bwv10.7.mxl')
repeat.insertRepeatEnding(c1,  4,  6, 1, inPlace=True)
repeat.insertRepeatEnding(c1, 11, 13, 2, inPlace=True)
sp = midi.realtime.StreamPlayer(c1)
sp.play()