from music21 import *
import random


stream1 = stream.Score()
part = stream.Part()


measure1 = stream.Measure()
n1 = note.Note('E5')
n1.duration = duration.Duration('32nd')
n2 = note.Note('F5')
n2.duration = duration.Duration('32nd')
n3 = note.Note('E5')
n3.duration = duration.Duration('32nd')
n4 = note.Note('D#5')
n4.duration = duration.Duration('32nd')
n5 = note.Note('E5')
n5.duration = duration.Duration('32nd')
n6 = note.Note('B4')
n6.duration = duration.Duration('32nd')
n7 = note.Note('E5')
n7.duration = duration.Duration('32nd')
n8 = note.Note('D#5')
n8.duration = duration.Duration('32nd')
n9 = note.Note('E5')
n9.duration = duration.Duration('32nd')
n10 = note.Note('B4')
n10.duration = duration.Duration('32nd')
n11 = note.Note('E5')
n11.duration = duration.Duration('32nd')
n12 = note.Note('D#5')
n12.duration = duration.Duration('32nd')
measure1.append(n1)
measure1.append(n2)
measure1.append(n3)
measure1.append(n4)
measure1.append(n5)
measure1.append(n6)
measure1.append(n7)
measure1.append(n8)
measure1.append(n9)
measure1.append(n10)
measure1.append(n11)
measure1.append(n12)

part.append(measure1)
stream1.append(part)

us = environment.UserSettings()
us['musicxmlPath'] = 'C:/Program Files/MuseScore 3/bin/MuseScore3.exe'
us['musescoreDirectPNGPath'] = 'C:/Program Files/MuseScore 3/bin/MuseScore3.exe'


sp = converter.parse('test.midi')
sp = midi.realtime.StreamPlayer(sp)
sp.play()