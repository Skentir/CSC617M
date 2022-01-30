from typing import Any


class ProgNode():
    def __init__(self,
                 bpm,
                 notes=None,
                 chords=None,
                 melodies=None,
                 staffs=Any):
        self.bpm = bpm
        self.notes = notes
        self.chords = chords
        self.melodies = melodies
        self.staffs = staffs


class DeclareNoteNode():
    def __init__(self, identifier, note):
        self.identifier = identifier
        self.note = note  #NoteExpression


class ExprNoteNode():
    def __init__(self, note_value, pitch, num, dotted=False):
        self.note_value = note_value
        self.pitch = pitch
        self.num = num
        self.dotted = dotted

class DeclareChordNode():
    def __init__(self, identifier, chord):
        self.identifier = identifier
        self.chord = chord

class ExprChordNode():
    def __init__(self, notes):
        self.notes = notes

class DeclareStaffNode():
    def __init__(self, beats_per_measure, staff_blocks, note_value, expressions):
        self.staff_blocks = staff_blocks
        self.beats_per_measure= beats_per_measure
        self.note_value = note_value
        self.expressions = expressions

class StaffBlockNode():
    def __init__(self, accidentals, measures, repeats):
        self.accidentals = accidentals
        self.measures = measures
        self.repeats = repeats

class DeclareMeasuresNode():
    def __init__(self, expressions):
        self.expressions = expressions
