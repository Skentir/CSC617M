from music21 import *
import random


stream1 = stream.Score() # global

left = stream.Score() # staff 1
right = stream.Score() # staff 2

measure1 = stream.Measure() # a measure in left staff
measure2 = stream.Measure() # a measure in right staff

measure1.append(note.Note('C3'))
measure1.append(note.Note('D3'))
measure1.append(note.Note('C3'))
measure1.append(note.Note('D3'))
left.append(measure1)

measure2.append(note.Note('E3'))
measure2.append(note.Note('A3'))
measure2.append(note.Note('E3'))
measure2.append(note.Note('A3'))
right.append(measure2)


measure3 = stream.Measure() # a measure in left staff
measure4 = stream.Measure() # a measure in right staff

measure3.append(note.Note('A3'))
measure3.append(note.Note('B3'))
measure3.append(note.Note('A3'))
measure3.append(note.Note('B3'))
left.append(measure3)

measure4.append(note.Note('C2'))
measure4.append(note.Note('D2'))
measure4.append(note.Note('C2'))
measure4.append(note.Note('D2'))
right.append(measure4)

left2 = stream.Score() # staff 1
right2 = stream.Score() # staff 2

measure1 = stream.Measure() # a measure in left staff
measure2 = stream.Measure() # a measure in right staff

measure1.append(note.Note('A3'))
measure1.append(note.Note('B3'))
measure1.append(note.Note('A3'))
measure1.append(note.Note('B3'))
left2.append(measure1)

measure2.append(note.Note('C2'))
measure2.append(note.Note('D2'))
measure2.append(note.Note('C2'))
measure2.append(note.Note('D2'))
right2.append(measure2)

measure3 = stream.Measure() # a measure in left staff
measure4 = stream.Measure() # a measure in right staff

measure3.append(note.Note('C3'))
measure3.append(note.Note('D3'))
measure3.append(note.Note('C3'))
measure3.append(note.Note('D3'))
left2.append(measure3)

measure4.append(note.Note('E3'))
measure4.append(note.Note('A3'))
measure4.append(note.Note('E3'))
measure4.append(note.Note('A3'))
right2.append(measure4)

stream1.insert(0, left)
stream1.insert(0, right)
stream1.insert(1, left2)
stream1.insert(1, right2)

sp = midi.realtime.StreamPlayer(stream1)
stream1.write('midi', fp='test.midi')
sp.play()