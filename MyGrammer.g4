grammar MyGrammer;

prog: EOF;

KEYWORD: 'bpm' | 'staff' | 'measure' | 'accidental' | 'note' | 'repstart' | 'repend' | 'chord' | 'continuous';

INTEGER: [0-9]+;

FRACTION: INTEGER'/'INTEGER;

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