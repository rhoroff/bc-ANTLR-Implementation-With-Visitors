grammar Calculator;

@header {
    import java.util.Hashtable;
    import java.lang.Math;
    import java.util.*;
    import java.io.Console;
}
input: (comment)* (varAssign)* (topExpr)* (';' topExpr)* (
		comment
	)* (ifStatement)* (string)* (';' string)* (';' varAssign)* (
		';' topExpr
	)* ';'?;

comment: COMMENT;

string: STRING;

varAssign: varName = ID '=' ex = expr;

topExpr: expr;

expr
	returns[double i]:
	'-' ex = expr									# Negate
	| '(' ex = expr ')'								# ExprParen
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
	| 'read()'										# Read
	| el = expr op = '==' er = expr					# Equals
	| el = expr op = '<' er = expr					# LessThan
	| el = expr op = '>' er = expr					# GreaterThan
	| el = expr op = '>=' er = expr					# GreaterThanEquals
	| el = expr op = '<=' er = expr					# LessThanEquals
	| el = expr op = '!=' er = expr					# NotEquals
	| el = expr op = '&&' er = expr					# And
	| el = expr op = '||' er = expr					# Or
	| '!' (ex = expr)								# Not;

ifStatement:
	IF '(' (cond = expr)+ ')' action = topExpr (
		(ELSE) (altAction = input)
	)?;

STRING: '"' .* '"';
IF: 'if';
ELSE: 'else';
COMMENT: '/*' .* '*/';
ID: [_A-Za-z]+;
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip;