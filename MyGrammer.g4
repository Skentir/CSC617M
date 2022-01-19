grammar MyGrammer;

BPM: 'bpm';

STAFF: 'staff';

MEASURE: 'measure';

MELODY: 'melody';

ACCIDENTAL_KEY: 'accidental';

REPSTART: 'repstart';

REPEND: 'repend';

CHORD: 'chord';

CONTINUOUS: 'continuous';

KEYWORD: BPM | STAFF | MEASURE | MELODY | ACCIDENTAL_KEY | REPSTART | REPEND | CHORD | CONTINUOUS;

DOUBLE: 'double';

FULL: 'full';

HALF: 'half';

QUARTER: 'quarter';

EIGHTH: 'eighth';

SIXTEENTH: 'sixteenth';

DOTTED: '*';

note_value: DOUBLE | FULL | HALF | QUARTER | EIGHTH | SIXTEENTH;
// NOTE_VALUE: 'double' | 'full' | 'half' | 'quarter' | 'eigth' | 'sixteenth';

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

bpm: BPM OPEN_PAR INTEGER CLOSE_PAR;

// prog: bpm (declare_note | declare_chord | declare_melody)* (declare_staff | expr_var)+;
prog: bpm  (declare_note | declare_chord)* EOF;
// prog: bpm (declare_note | declare_chord)*;


//Declaration
declare_note: IDENTIFIER EQUAL_OPER expr_note;
declare_chord: IDENTIFIER EQUAL_OPER expr_chord;
declare_melody: MELODY IDENTIFIER OPEN_BRACKET (declare_staff)+ CLOSE_BRACKET;
declare_continuous: CONTINUOUS OPEN_BRACKET (expr)+ CLOSE_BRACKET;
declare_measures: MEASURE OPEN_BRACKET (expr | declare_continuous)+ CLOSE_BRACKET;

//Expresions
expr: expr_note                             # NoteExpression
    | expr_chord                            # ChordExpression
    | expr_var                              # VariableExpression
    | expr_acc                              # AccidentalExpression;

expr_note: note_value OPEN_PAR PITCH COMMA_SEP INTEGER CLOSE_PAR | note_value OPEN_PAR PITCH COMMA_SEP INTEGER CLOSE_PAR DOTTED;

//expr_chord: CHORD OPEN_PAR expr_note expr_add_note CLOSE_PAR;
expr_chord: CHORD OPEN_PAR expr_note expr_add_note CLOSE_PAR;

expr_add_note: COMMA_SEP expr_note | COMMA_SEP expr_note expr_add_note;

expr_var: IDENTIFIER;

expr_acc: ACCIDENTAL_KEY OPEN_PAR expr_add_acc CLOSE_PAR;
expr_add_acc: ACCIDENTAL PITCH | ACCIDENTAL PITCH COMMA_SEP expr_add_acc | PITCH | PITCH COMMA_SEP expr_add_acc;

// Iteratives
declare_repeat: REPSTART staff_block declare_repeat_end | staff_block repeat_end_expr;
declare_repeat_end: repeat_end_expr | repeat_end_expr staff_block declare_repeat_end;
repeat_end_expr: REPEND OPEN_PAR INTEGER CLOSE_PAR | REPEND OPEN_PAR CLOSE_PAR;

// Functions
declare_staff: STAFF OPEN_PAR INTEGER COMMA_SEP INTEGER CLOSE_PAR OPEN_BRACKET (staff_block)+ CLOSE_BRACKET;

// staff_block: expr_acc staff_block | staff_block expr_acc | declare_repeat | declare_measures staff_block | staff_block declare_measures | declare_measures;

staff_block: expr_acc staff_block | staff_block expr_acc | REPSTART staff_block declare_repeat_end | staff_block repeat_end_expr | declare_measures staff_block | staff_block declare_measures | declare_measures;