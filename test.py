from music21 import *
import random


stream1 = stream.Score()
stream1.append(tempo.MetronomeMark(number=68))
part = stream.Part()

d = duration.Duration(0.25 * 2 / 3)
print(d)
measure1 = stream.Measure()
n1 = note.Note('B-6')
n1.duration = d
n2 = note.Note('A6')
n2.duration = d
n3 = note.Note('G#6')
n3.duration = d
n4 = note.Note('G6')
n4.duration = d
n5 = note.Note('F#6')
n5.duration = d
n6 = note.Note('F6')
n6.duration = d
n7 = note.Note('E5')
n7.duration = d
n8 = note.Note('D#5')
n8.duration = d
n9 = note.Note('D4')
n9.duration = d
measure1.append(n1)
measure1.append(n2)
measure1.append(n3)
measure1.append(n4)
measure1.append(n5)
measure1.append(n6)
measure1.append(n7)
measure1.append(n8)
measure1.append(n9)

part.append(measure1)
stream1.append(part)

us = environment.UserSettings()
us['musicxmlPath'] = 'C:/Program Files/MuseScore 3/bin/MuseScore3.exe'
us['musescoreDirectPNGPath'] = 'C:/Program Files/MuseScore 3/bin/MuseScore3.exe'

stream1.show('t')
# sp = converter.parse('test.midi')
sp = midi.realtime.StreamPlayer(stream1)
sp.play()