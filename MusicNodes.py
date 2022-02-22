from typing import Any


class ProgNode():
    def __init__(self,
                 bpm,
                 instrument,
                 notes=None,
                 chords=None,
                 melodies=None,
                 staffs=Any):
        self.bpm = bpm
        self.instrument = instrument
        self.notes = notes
        self.chords = chords
        self.melodies = melodies
        self.staffs = staffs


class DeclareNoteNode():
    def __init__(self, identifier, note):
        self.identifier = identifier
        self.note = note  #NoteExpression


class DeclareMelodyNode():
    def __init__(self, identifier, staffs=Any):
        self.identifier = identifier
        self.staffs = staffs


class ExprNoteNode():
    def __init__(self, note_value, accidental, pitch, num, slur_start, slur_end,dotted=False):
        self.note_value = note_value
        self.pitch = pitch
        self.num = num
        self.dotted = dotted
        self.accidental = accidental
        self.slur_start = slur_start
        self.slur_end = slur_end


class ExprRestNode():
    def __init__(self, note_value, slur_start, slur_end, dotted=False):
        self.note_value = note_value
        self.dotted = dotted
        self.slur_start = slur_start
        self.slur_end = slur_end


class DeclareChordNode():
    def __init__(self, identifier, chord):
        self.identifier = identifier
        self.chord = chord


class ExprChordNode():
    def __init__(self, notes, slur_start, slur_end):
        self.notes = notes
        self.slur_start = slur_start
        self.slur_end = slur_end


class DeclareStaffNode():
    def __init__(self, beats_per_measure, expressions, note_value):
        self.beats_per_measure = beats_per_measure
        self.note_value = note_value
        self.expressions = expressions  # StaffBlocks or Expr_var of melody


class DeclareMeasuresNode():
    def __init__(self, expressions, repeat_start, repeat_end):
        self.expressions = expressions
        self.repeat_start = repeat_start
        self.repeat_end = repeat_end


class DeclareMeasuresGrandNode():
    def __init__(self, expressions, repeat_start, repeat_end, direction):
        self.expressions = expressions
        self.repeat_start = repeat_start
        self.repeat_end = repeat_end
        self.direction = direction


class AccidentalExpressionNode():
    def __init__(self, accidentals):
        self.accidentals = accidentals


class AccidentalNode():
    def __init__(self, pitch, accidental, octave):
        self.pitch = pitch
        self.accidental = accidental
        self.octave = octave


class DeclareContinousNode():
    def __init__(self, expressions):
        self.expressions = expressions


class DeclareRepeatStartNode():
    def __init__(self, times):
        self.times = times


class DeclareRepeatEndNode():
    def __init__(self):
        pass