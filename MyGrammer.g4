grammar MyGrammer;

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

BPM: B P M;

STAFF: S T A F F;

MEASURE: M E A S U R E;
MEASUREUP: M E A S U R E U P;
MEASUREDOWN: M E A S U R E D O W N;

MELODY: M E L O D Y;

ACCIDENTAL_KEY: A C C I D E N T A L;
// STAFF_ACCIDENTAL_KEY: S T A F F A C C I D E N T A L;
// MEASURE_ACCIDENTAL_KEY: M E A S U R E A C C I D E N T A L;

REPSTART: R E P S T A R T;

REPEND: R E P E N D;

CHORD: C H O R D;
 
CONTINUOUS: C O N T I N U O U S;

DOUBLE: D O U B L E;

FULL: F U L L;
 
HALF: H A L F;
 
QUARTER: Q U A R T E R;

EIGHTH: E I G H T H;

SIXTEENTH: S I X T E E N T H;

INSTRUMENT: I N S T R U M E N T;

DOTTED: '*';

note_value: DOUBLE | FULL | HALF | QUARTER | EIGHTH | SIXTEENTH;
// NOTE_VALUE: D O U B L E | F U L L | H A L F | Q U A R T E R | E I G H T H | S I X T E E N T H;

CLARINET: C L A R I N E T;

FLUTE: F L U T E;
 
ORGAN: O R G A N;
 
PIANO: P I A N O;
 
RECORDER: R E C O R D E R;

SAXOPHONE: S A X O P H O N E;

TRUMPET: T R U M P E T;

GUITAR: G U I T A R;

ACOUSTICGUITAR: A C O U S T I C WS G U I T A R;

ELECTRICGUITAR: E L E C T R I C WS G U I T A R;

UKULELE: U K U L E L E;

VIOLIN: V I O L I N;

XYLOPHONE: X Y L O P H O N E;

instruments: CLARINET | FLUTE | ORGAN | PIANO | RECORDER | SAXOPHONE | TRUMPET | GUITAR | ACOUSTICGUITAR | ELECTRICGUITAR | UKULELE | VIOLIN | XYLOPHONE;

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

instrument: INSTRUMENT OPEN_PAR instruments CLOSE_PAR;

// prog: bpm (declare_note | declare_chord | declare_melody)* (declare_staff | expr_var)+;
prog: bpm instrument (declare_note | declare_chord | declare_melody)*  (declare_staff | expr_var)+ EOF;
// prog: bpm (declare_note | declare_chord)*;



//Declaration
declare_note: IDENTIFIER EQUAL_OPER expr_note;
declare_chord: IDENTIFIER EQUAL_OPER expr_chord;
declare_melody: MELODY IDENTIFIER OPEN_BRACKET (declare_staff)+ CLOSE_BRACKET;
declare_continuous: CONTINUOUS OPEN_BRACKET (expr)+ CLOSE_BRACKET;
// declare_measures: MEASURE OPEN_BRACKET (expr | declare_continuous)+ CLOSE_BRACKET;

declare_measures: MEASURE OPEN_BRACKET measure_block CLOSE_BRACKET;
declare_measures_up: MEASUREUP OPEN_BRACKET measure_block CLOSE_BRACKET declare_measures_down;
declare_measures_down: MEASUREDOWN OPEN_BRACKET measure_block CLOSE_BRACKET;
// repeat_measure_block: declare_repeat measure_block declare_repeat_end;
measure_block: declare_repeat? (expr | declare_continuous)+ declare_repeat_end?;

//Expresions
expr: expr_note                             # NoteExpression
    | expr_chord                            # ChordExpression
    | expr_var                              # VariableExpression
    | expr_acc                     # AccidentalExpression;

expr_note: note_value OPEN_PAR (ACCIDENTAL)? PITCH COMMA_SEP INTEGER CLOSE_PAR | note_value OPEN_PAR (ACCIDENTAL)? PITCH COMMA_SEP INTEGER CLOSE_PAR DOTTED;

//expr_chord: CHORD OPEN_PAR expr_note expr_add_note CLOSE_PAR;
expr_chord: CHORD OPEN_PAR expr_note expr_add_note CLOSE_PAR;

expr_add_note: COMMA_SEP expr_note | COMMA_SEP expr_note expr_add_note;

expr_var: IDENTIFIER;

expr_acc: ACCIDENTAL_KEY OPEN_PAR expr_add_acc CLOSE_PAR;

expr_add_acc: ACCIDENTAL PITCH | ACCIDENTAL PITCH COMMA_SEP expr_add_acc | PITCH | PITCH COMMA_SEP expr_add_acc;

// Iteratives

declare_repeat: REPSTART;
declare_repeat_end: REPEND | REPEND OPEN_PAR INTEGER? CLOSE_PAR;

// Functions
declare_staff: STAFF OPEN_PAR INTEGER COMMA_SEP INTEGER CLOSE_PAR OPEN_BRACKET (staff_block)+ CLOSE_BRACKET;
staff_block: expr_acc staff_block | staff_block expr_acc | declare_measures staff_block | staff_block declare_measures | declare_measures | declare_measures_up staff_block | staff_block declare_measures_up | declare_measures_up;