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
        self.identifier = str(identifier)
        self.note = note  #NoteExpression


class NoteExpression():
    def __init__(self, pitch, num):
        self.pitch = str(pitch)
        self.num = int(num)