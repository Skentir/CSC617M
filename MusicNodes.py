class ProgNode():
    def __init__(self,
                 bpm,
                 notes=None,
                 chords=None,
                 melodies=None,
                 staffs=None):
        self.bpm = bpm
        self.notes = notes
        self.chords = chords
        self.melodies = melodies
        self.staffs = staffs


class DeclareNoteNode():
    def __init__(self, identifier, note):
        self.identifier = identifier
        self.note = note


class NoteExpression():
    def __init__(self, pitch, num):
        self.pitch = pitch
        self.num = num