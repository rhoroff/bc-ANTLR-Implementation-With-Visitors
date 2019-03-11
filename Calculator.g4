grammar Calculator;

@header {
    import java.util.Hashtable;
    import java.lang.Math;
    import java.util.*;
    import java.io.Console;
}
input: (comment)* (varAssign)* (topExpr)* (';' topExpr)* (
		comment
	)* (ifStatement)* (topBool)* (string)* (';' string)* (';' topBool)* (';' varAssign)* (';' topExpr)* ';'?;

comment: COMMENT;

string: STRING;

varAssign: varName = ID '=' ex = expr;

topBool: bool;

bool
	returns[int j]:
	el = expr op = '==' er = expr	# Equals
	| el = expr op = '<' er = expr	# LessThan
	| el = expr op = '>' er = expr	# GreaterThan
	| el = expr op = '>=' er = expr	# GreaterThanEquals
	| el = expr op = '<=' er = expr	# LessThanEquals
	| el = expr op = '!=' er = expr	# NotEquals
	| el = expr op = '&&' er = expr	# And
	| el = expr op = '||' er = expr	# Or
	| '!' ex = expr					# Not;

topExpr: expr;

expr
	returns[double i]:
	'-' ex = expr									# Negate
	| '(' ex = expr ')'								# Paren
	| variable = expr op = ('++' | '--')			# PostCrement
	| op = ('++' | '--') variable = expr			# PreCrement
	| el = expr op = '^' er = expr					# Pow
	| el = expr op = ('/' | '*' | '%') er = expr	# DivTimesMod
	| el = expr op = ('+' | '-') er = expr			# AddSub
	| INT											# Int
	| DOUBLE										# Double
	| var = ID										# VarRead
	| 's(' ex = expr ')'							# Sin
	| 'c(' ex = expr ')'							# Cos
	| 'l(' ex = expr ')'							# Ln
	| 'e(' ex = expr ')'							# Exp
	| 'sqrt(' ex = expr ')'							# Sqrt
	| 'read()'										# Read;

ifStatement: IF '('cond = input')' action = expr ((ELSE) (altAction = input))?;

STRING: '"' .* '"';
IF:'if';
ELSE:'else';
COMMENT: '/*' .* '*/';
ID: [_A-Za-z]+;
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip;