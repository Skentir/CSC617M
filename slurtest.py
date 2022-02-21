from music21 import *
main_stream = stream.Score()
main_stream.append(tempo.MetronomeMark(number=200))
n1 = note.Note('C4')
n2 = note.Note('D4')
n3 = note.Note('E4')
n4 = note.Note('F4')
n5 = note.Note('G4')
n6 = note.Note('A4')
n7 = note.Note('A4')
slur1 = spanner.Slur([n1, n2,n3,n4])
slur2 = spanner.Slur([n6,n7])
measure = stream.Measure()
measure2 = stream.Measure()
measure.append([n1,n2,n3,n4,n5,n6])
measure2.append([n7])
# measure.append(slur1)
# measure.insert(0, slur2)
measure.insert(0, slur1)
main_stream.append(measure)
main_stream.append(measure2)

main_stream.write('midi', fp='test2.midi')








