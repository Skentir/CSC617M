grammar MyGrammer;

prog: (decl | expr)+ EOF;

decl: bpm                                   # BPMDeclaration;

bpm: BPM OPEN_PAR INTEGER CLOSE_PAR;

expr: expr_note                             # NoteExpression
    | expr_chord                            # ChordExpression
    | expr_var                              # VariableExpression
    | expr_acc                              # AccidentalExpression;

expr_note: NOTE_VALUE OPEN_PAR PITCH COMMA_SEP INTEGER CLOSE_PAR | NOTE_VALUE OPEN_PAR PITCH COMMA_SEP INTEGER CLOSE_PAR DOTTED;

expr_chord: CHORD OPEN_PAR expr_note expr_add_note COMMA_SEP FRACTION CLOSE_PAR;
expr_add_note: COMMA_SEP expr_note | COMMA_SEP expr_note expr_add_note;

expr_var: IDENTIFIER;

expr_acc: ACCIDENTAL_KEY OPEN_PAR expr_add_acc CLOSE_PAR;
expr_add_acc: ACCIDENTAL PITCH | ACCIDENTAL PITCH COMMA_SEP expr_add_acc | PITCH | PITCH COMMA_SEP expr_add_acc;

KEYWORD: BPM | STAFF | MEASURE | MELODY | ACCIDENTAL_KEY | REPSTART | REPEND | CHORD | CONTINUOUS;

BPM: 'bpm';

STAFF: 'staff';

MEASURE: 'measure';

MELODY: 'melody';

ACCIDENTAL_KEY: 'accidental';

REPSTART: 'repstart';

REPEND: 'repend';

CHORD: 'chord';

CONTINUOUS: 'continuous';

NOTE_VALUE: DOUBLE | FULL | HALF | QUARTER | EIGHTH | SIXTEENTH;

DOUBLE: 'double';

FULL: 'full';

HALF: 'half';

QUARTER: 'quarter';

EIGHTH: 'eighth';

SIXTEENTH: 'sixteenth';

DOTTED: '*';

INTEGER: [0-9]+;

FRACTION: [1-9][0-9]*WS*'/'WS*[1-9][0-9]*;

PITCH: [A-G];

ACCIDENTAL: [#] | [_];

IDENTIFIER: [a-zA-Z][_a-zA-Z0-9]*;

OPEN_BRACKET: [{];

CLOSE_BRACKET: '}';

COMMA_SEP: ',';

OPEN_PAR: [(];

CLOSE_PAR: [)];

EQUAL_OPER: [=];

WS: [ \t\n\r]+ -> skip;