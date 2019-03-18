grammar Calculator;

input: (comment)* (varAssign)* (topExpr)* (';' topExpr)* (
		comment
	)* (loops)* (ifStatement)* (string)* (functionDef)* (
		';' string
	)* (';' loops)* (';' varAssign)* (';' topExpr)* (
		';' functionDef
	)* ';'?;

id: ID;

paramList: id (',' id)*?;

argumentList: (expr)* (',' expr)*?;

exprList: (expr)+ (';' expr)* ';'?;

statementList: '{' topExpr (';' topExpr)*? ';'? '}';

comment: COMMENT;

string: STRING;

varAssign: varName = ID '=' ex = expr;

functionCall: funcName = ID '(' argumentList ')';

topExpr: expr;

expr
	returns[double i]:
	'-' ex = expr									# Negate
	| '(' ex = expr ')'								# ExprParen
	| functionCall									# exprFunctionCall
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
	| varAssign										# VarAssignExpression
	;

ifStatement:
	IF '(' (cond = expr)+ ')' action = topExpr (
		(ELSE) (altAction = topExpr)
	)?;

loops:
	WHILE '(' ex = expr ')' (action = topExpr| statements = statementList) # WhileLoop
	| FOR '(' (ex1 = expr | varAss = varAssign) ';' ex2 = expr ';' (
		ex3 = expr
		| varUpdate = varAssign
	) ')' action = topExpr # ForLoop;

functionDef:
	DEFINE funcName = ID '(' idList = paramList ')' (WS)? '{' (
		exprList
	)? 'return ' returnValue = expr ';'? '}';

CONTINUE: 'continue';
BREAK: 'break';
DEFINE: 'define';
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