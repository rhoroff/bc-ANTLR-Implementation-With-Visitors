grammar Calculator;

@header {
    import java.util.Hashtable;
    import java.lang.Math;
    import java.util.*;
    import java.io.Console;
}
input: (comment)* (varAssign)* (topExpr)* (';' topExpr)* (
		comment
	)* (loops)* (ifStatement)* (string)* (';' string)* (
		';' loops
	)* (';' varAssign)* (';' topExpr)* ';'?;

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
	| '!' (ex = expr)								# Not
	| varAssign										# VarAssignment;

ifStatement:
	IF '(' (cond = expr)+ ')' action = topExpr (
		(ELSE) (altAction = topExpr)
	)?;

loops:
	WHILE '(' ex = expr ')' action = topExpr								# WhileLoop
	| FOR '(' ex1 = expr ';' ex2 = expr ';' ex3 = expr ')' action = topExpr	# ForLoop;

STRING: '"' .* '"';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
COMMENT: '/*' .* '*/';
ID: [_A-Za-z]+;
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip;