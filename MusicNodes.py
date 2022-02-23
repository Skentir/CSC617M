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
    def __init__(self, note_value, accidental, pitch, num, dotted=False):
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
        "cmaj": [('C', 0), ('E', 0), ('G', 0)],
        "c#maj": [('C#', 0), ('E#', 0), ('G#', 0)],
        "dmaj": [('D', 0), ('F#', 0), ('A', 0)],
        "e_maj": [('E-', 0), ('G', 0), ('B-', 0)],
        "emaj": [('E', 0), ('G#', 0), ('B', 0)],
        "fmaj": [('F', 0), ('A', 0), ('C', 1)],
        "f#maj": [('F#', 0), ('A#', 0), ('C#', 1)],
        "gmaj": [('G', 0), ('B', 0), ('D', 1)],
        "a_maj": [('A-', 0), ('C', 1), ('E-', 1)],
        "amaj": [('A', 0), ('C#', 0), ('E', 1)],
        "b_maj": [('B-', 0), ('D', 1), ('F', 1)],
        "bmaj": [('B', 0), ('D#', 1), ('F#', 1)],
        "cm": [('C', 0), ('E-', 0), ('G', 0)],
        "c#m": [('C#', 0), ('E', 0), ('G#', 0)],
        "dm": [('D', 0), ('F', 0), ('A', 0)],
        "e_m": [('E-', 0), ('G-', 0), ('B-', 0)],
        "em": [('E', 0), ('G', 0), ('B', 0)],
        "fm": [('F', 0), ('A-', 0), ('C', 1)],
        "f#m": [('F#', 0), ('A', 0), ('C#', 1)],
        "gm": [('G', 0), ('B-', 0), ('D', 1)],
        "a_m": [('A-', 0), ('B', 0), ('E-', 1)],
        "am": [('A', 0), ('C', 1), ('E', 1)],
        "b_m": [('B-', 0), ('D-', 1), ('F', 1)],
        "bm": [('B', 0), ('D', 1), ('F#', 1)],
        "cdim": [('C', 0), ('E-', 0), ('G-', 0)],
        "c#dim": [('C#', 0), ('E', 0), ('G', 0)],
        "ddim": [('D', 0), ('F', 0), ('A-', 0)],
        "e_dim": [('E-', 0), ('G-', 0), ('A', 0)],
        "edim": [('E', 0), ('G', 0), ('B-', 0)],
        "fdim": [('F', 0), ('A-', 0), ('B', 0)],
        "f#dim": [('F#', 0), ('A', 0), ('C', 1)],
        "gdim": [('G', 0), ('B-', 0), ('D-', 1)],
        "a_dim": [('A-', 0), ('C-', 1), ('D', 1)],
        "adim": [('A', 0), ('C', 1), ('E-', 1)],
        "b_dim": [('B-', 0), ('D-', 1), ('E', 1)],
        "bdim": [('B', 0), ('D', 1), ('F', 1)],
        "cmaj7": [('C', 0), ('E', 0), ('G', 0), ('B', 0)],
        "c#maj7": [('C#', 0), ('F', 0), ('G#', 0), ('C', 1)],
        "dmaj7": [('D', 0), ('F#', 0), ('A', 0), ('C#', 1)],
        "e_maj7": [('E-', 0), ('G', 0), ('B-', 0), ('D', 1)],
        "emaj7": [('E', 0), ('G#', 0), ('B', 0), ('D#', 1)],
        "fmaj7": [('F', 0), ('A', 0), ('C', 1), ('E', 1)],
        "f#maj7": [('F#', 0), ('A#', 0), ('C#', 1), ('F', 1)],
        "gmaj7": [('G', 0), ('B', 0), ('D', 1), ('F#', 1)],
        "a_maj7": [('A-', 0), ('C', 1), ('E-', 1), ('G', 1)],
        "amaj7": [('A', 0), ('C#', 1), ('E', 1), ('G#', 1)],
        "b_maj7": [('B-', 0), ('D', 1), ('F', 1), ('A', 1)],
        "bmaj7": [('B', 0), ('D#', 1), ('F#', 1), ('A#', 1)],
        "cdom7": [('C', 0), ('E', 0), ('G', 0), ('B', 0)],
        "c#dom7": [('C#', 0), ('F', 0), ('G#', 0), ('B', 0)],
        "ddom7": [('D', 0), ('F#', 0), ('A', 0), ('C', 1)],
        "e_dom7": [('E-', 0), ('G', 0), ('B-', 0), ('D-', 1)],
        "edom7": [('E', 0), ('G#', 0), ('B', 0), ('D', 1)],
        "fdom7": [('F', 0), ('A', 0), ('C', 1), ('E-', 1)],
        "f#dom7": [('F#', 0), ('A#', 0), ('C#', 1), ('E', 1)],
        "gdom7": [('G', 0), ('B', 0), ('D', 1), ('F', 1)],
        "a_dom7": [('A-', 0), ('C', 1), ('E-', 1), ('G-', 1)],
        "adom7": [('A', 0), ('C#', 1), ('E', 1), ('G', 1)],
        "b_dom7": [('B-', 0), ('D', 1), ('F', 1), ('A-', 1)],
        "bdom7": [('B', 0), ('D#', 1), ('F#', 1), ('A', 1)],
        "cm7": [('C', 0), ('E-', 0), ('G', 0), ('B-', 0)],
        "c#m7": [('C#', 0), ('E', 0), ('G#', 0), ('B', 0)],
        "dm7": [('D', 0), ('F', 0), ('A', 0), ('C', 1)],
        "e_m7": [('E-', 0), ('G-', 0), ('B-', 0), ('D-', 1)],
        "em7": [('E', 0), ('G', 0), ('B', 0), ('D', 1)],
        "fm7": [('F', 0), ('A-', 0), ('C', 1), ('E-', 1)],
        "f#m7": [('F#', 0), ('A', 0), ('C#', 1), ('E', 1)],
        "gm7": [('G', 0), ('B-', 0), ('D', 1), ('F', 1)],
        "a_m7": [('A-', 0), ('B', 0), ('E-', 1), ('G-', 1)],
        "am7": [('A', 0), ('C', 0), ('E', 1), ('G', 1)],
        "b_m7": [('B-', 0), ('D-', 1), ('F', 1), ('A-', 1)],
        "bm7": [('B', 0), ('D', 1), ('F#', 1), ('A', 1)],
        "cm7_5": [('C', 0), ('E-', 0), ('G-', 0), ('B-', 0)],
        "c#m7_5": [('C#', 0), ('E', 0), ('G', 0), ('B', 0)],
        "dm7_5": [('D', 0), ('F', 0), ('A-', 0), ('C', 1)],
        "e_m7_5": [('E-', 0), ('G-', 0), ('A', 0), ('D-', 1)],
        "em7_5": [('E', 0), ('G', 0), ('B-', 0), ('D', 1)],
        "fm7_5": [('F', 0), ('A-', 0), ('B', 0), ('E-', 1)],
        "f#m7_5": [('F#', 0), ('A', 0), ('C', 1), ('E', 1)],
        "gm7_5": [('G', 0), ('B-', 0), ('D-', 1), ('F', 1)],
        "a_m7_5": [('A-', 0), ('C-', 1), ('D', 1), ('G-', 1)],
        "am7_5": [('A', 0), ('C', 1), ('E-', 1), ('G', 1)],
        "b_m7_5": [('B-', 0), ('D-', 1), ('E', 1), ('A-', 1)],
        "bm7_5": [('B', 0), ('D', 1), ('F', 1), ('A', 1)],
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
    def __init__(self, expressions, ending_start, ending_end, repeat_start, repeat_end):
        self.expressions = expressions
        self.ending_start = ending_start
        self.ending_end = ending_end
        self.repeat_start = repeat_start
        self.repeat_end = repeat_end


class DeclareMeasuresGrandNode():
    def __init__(self, expressions, ending_start, ending_end, repeat_start, repeat_end, direction):
        self.expressions = expressions
        self.ending_start = ending_start
        self.ending_end = ending_end
        self.repeat_start = repeat_start
        self.repeat_end = repeat_end
        self.direction = direction


class AccidentalExpressionNode():
    def __init__(self, accidentals):
        self.accidentals = accidentals


class AccidentalNode():
    def __init__(self, pitch, accidental):
        self.pitch = pitch
        self.accidental = accidental

class DeclarePatternNode():
    def __init__(self, expressions):
        self.expressions = expressions