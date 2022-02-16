from music21 import *
import random


stream1 = stream.Score()
left = stream.Score()
right = stream.Score()

left.append(note.Note('C3'))
left.append(note.Note('D3'))
left.append(note.Note('C3'))
left.append(note.Note('D3'))
left.append(note.Note('C3'))
left.append(note.Note('D3'))
left.append(note.Note('C3'))
left.append(note.Note('D3'))

# right.append(note.Note('E3'))
# right.append(note.Note('A3'))
# right.append(note.Note('E3'))
# right.append(note.Note('A3'))
# right.append(note.Note('E3'))
# right.append(note.Note('A3'))
# right.append(note.Note('E3'))
# right.append(note.Note('A3'))

stream1.insert(0, left)
stream1.insert(0, right)

sp = midi.realtime.StreamPlayer(stream1)
sp.play()