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
    def __init__(self,note_value, accidental, pitch, num, dotted=False):
        self.note_value = note_value
        self.pitch = pitch
        self.num = num
        self.dotted = dotted
        self.accidental = accidental

class ExprRestNode():
    def __init__(self, note_value, dotted=False):
        self.note_value = note_value
        self.dotted = dotted


class DeclareChordNode():
    def __init__(self, identifier, chord):
        self.identifier = identifier
        self.chord = chord


class ExprChordNode():
    def __init__(self, notes):
        self.notes = notes

class ExprFixedChordNode():
    chords = {
        "cmaj": ['C', 'E', 'G'],
        "c#maj": ['C#', 'E#', 'G#'],
        "dmaj": ['D', 'F#', 'A'],
        "e_maj": ['E-', 'G', 'B-'],
        "emaj": ['E', 'G#', 'B'],
        "fmaj": ['F', 'A', 'C'],
        "f#maj": ['F#', 'A#', 'C#'],
        "gmaj": ['G', 'B', 'D'],
        "a_maj": ['A-', 'C', 'B-'],
        "amaj": ['A', 'C#', 'E'],
        "b_maj": ['B-', 'D', 'F'],
        "bmaj": ['B', 'D#', 'F#'],
        "cm": ['C', 'E-', 'G'],
        "c#m": ['C#', 'E', 'G#'],
        "dm": ['D', 'F', 'A'],
        "e_m": ['E-', 'G-', 'B-'],
        "em": ['E', 'G', 'B'],
        "fm": ['F', 'A-', 'C'],
        "f#m": ['F#', 'A', 'C#'],
        "gm": ['G', 'B-', 'D'],
        "a_m": ['A-', 'B', 'E-'],
        "am": ['A', 'C', 'E'],
        "b_m": ['B-', 'D-', 'F'],
        "bm": ['B', 'D', 'F#'],
        "cdim": ['C', 'E-', 'G-'],
        "c#dim": ['C#', 'E', 'G'],
        "ddim": ['D', 'F', 'A-'],
        "e_dim": ['E-', 'G-', 'A'],
        "edim": ['E', 'G', 'B-'],
        "fdim": ['F', 'A-', 'B'],
        "f#dim": ['F#', 'A', 'C'],
        "gdim": ['G', 'B-', 'D-'],
        "a_dim": ['A-', 'C-', 'D'],
        "adim": ['A', 'C', 'E-'],
        "b_dim": ['B-', 'D-', 'E'],
        "bdim": ['B', 'D', 'F'],
        "cmaj7": ['C', 'E', 'G', 'B'],
        "c#maj7": ['C#', 'F', 'G#', 'C'],
        "dmaj7": ['D', 'F#', 'A', 'C#'],
        "e_maj7": ['E-', 'G', 'B-', 'D'],
        "emaj7": ['E', 'G#', 'B', 'D#'],
        "fmaj7": ['F', 'A', 'C', 'E'],
        "f#maj7": ['F#', 'A#', 'C#', 'F'],
        "gmaj7": ['G', 'B', 'D', 'F#'],
        "a_maj7": ['A-', 'C', 'E-', 'G'],
        "amaj7": ['A', 'C#', 'E', 'G#'],
        "b_maj7": ['B-', 'D', 'F', 'A'],
        "bmaj7": ['B', 'D#', 'F#', 'A#'],
        "cdom7": ['B', 'D#', 'F#', 'A#'],
        "c#dom7": ['C#', 'F', 'G#', 'B'],
        "ddom7": ['D', 'F#', 'A', 'C'],
        "e_dom7": ['E-', 'G', 'B-', 'D-'],
        "edom7": ['E', 'G#', 'B', 'D'],
        "fdom7": ['F', 'A', 'C', 'E-'],
        "f#dom7": ['F#', 'A#', 'C#', 'E'],
        "gdom7": ['G', 'B', 'D', 'F'],
        "a_dom7": ['A-', 'C', 'E-', 'G-'],
        "adom7": ['A', 'C#', 'E', 'G'],
        "b_dom7": ['B-', 'D', 'F', 'A-'],
        "bdom7": ['B', 'D#', 'F#', 'A'],
        "cm7": ['C', 'E-', 'G', 'B-'],
        "c#m7": ['C#', 'E', 'G#', 'B'],
        "dm7": ['D', 'F', 'A', 'C'],
        "e_m7": ['E-', 'G-', 'B-', 'D-'],
        "em7": ['E', 'G', 'B', 'D'],
        "fm7": ['F', 'A-', 'C', 'E-'],
        "f#m7": ['F#', 'A', 'C#', 'E'],
        "gm7": ['G', 'B-', 'D', 'F'],
        "a_m7": ['A-', 'B', 'E-', 'G-'],
        "am7": ['A', 'C', 'E', 'G'],
        "b_m7": ['B-', 'D-', 'F', 'A-'],
        "bm7": ['B', 'D', 'F#', 'A'],
        "cm7_5": ['C', 'E-', 'G-', 'B-'],
        "c#m7_5": ['C#', 'E', 'G', 'B'],
        "dm7_5": ['D', 'F', 'A-', 'C'],
        "e_m7_5": ['E-', 'G-', 'A', 'D-'],
        "em7_5": ['E', 'G', 'B-', 'D'],
        "fm7_5": ['F', 'A-', 'B', 'E-'],
        "f#m7_5": ['F#', 'A', 'C', 'E'],
        "gm7_5": ['G', 'B-', 'D-', 'F'],
        "a_m7_5": ['A-', 'C-', 'D', 'G-'],
        "am7_5": ['A', 'C', 'E-', 'G'],
        "b_m7_5": ['B-', 'D-', 'E', 'A-'],
        "bm7_5": ['B', 'D', 'F', 'A'],
    }
    def __init__(self, note_value, fixed_chord, num, dotted=False):
        self.note_value = note_value
        self.fixed_chord = fixed_chord
        self.num = num
        self.dotted = dotted


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
    def __init__(self, pitch, accidental=None):
        self.accidental = accidental
        self.pitch = pitch


class DeclareContinousNode():
    def __init__(self, expressions):
        self.expressions = expressions

class DeclareRepeatStartNode():
    def __init__(self, times):
        self.times = times

class DeclareRepeatEndNode():
    def __init__(self):
        pass