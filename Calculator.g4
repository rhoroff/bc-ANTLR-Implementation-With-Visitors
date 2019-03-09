grammar Calculator;

@header {
    import java.util.Hashtable;
    import java.lang.Math;
    import java.util.*;
    import java.io.Console;
}
input: (comment)* (varAssign)* (topExpr)*  (';' topExpr)* (comment)*  (';' varAssign)*  (';' topExpr)* ';'?;

comment: COMMENT;

varAssign:
	varName = ID '=' ex = expr ;

topBool: bool {System.out.println("result: " + $bool.j);};

bool
	returns[int j]:
	el = expr op = '==' er = expr { 
        if($el.i == $er.i){ 
            $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
	| el = expr op = '<' er = expr {
        if($el.i < $er.i){ 
            $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
	| el = expr op = '>' er = expr {
        if($el.i > $er.i){ 
            $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
	| el = expr op = '>=' er = expr {
        if($el.i >= $er.i){ 
            $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
	| el = expr op = '<=' er = expr {
        if($el.i <= $er.i){ 
            $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
	| el = expr op = '!=' er = expr {
        if($el.i != $er.i){ 
            $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
	| el = expr op = '&&' er = expr {
        if($el.i != 0 && $er.i != 0){
           $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
	| el = expr op = '||' er = expr {
        if($el.i != 0 || $er.i != 0){
           $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
	| '!' ex = expr {
        if($ex.i == 0 ){
           $j = 1; 
        }
        else{ 
             $j = 0; 
        }
    }
    ;

topExpr: expr;

expr
	returns[double i]:
     '-' ex = expr # Negate
	| '(' ex = expr ')' #Paren
	| variable = expr op = ('++' | '--') # PostCrement
	| op = ('++' | '--') variable = expr # PreCrement
	| el = expr op = '^' er = expr # Pow
	| el = expr op = ('/' | '*' | '%') er = expr #DivTimesMod
	| el = expr op = ('+' | '-') er = expr # AddSub
	| INT # Int 
	| DOUBLE  # Double
	| var = ID  # VarRead
	| 's(' ex = expr ')' # Sin
	| 'c(' ex = expr ')' # Cos
	| 'l(' ex = expr ')' # Ln
	| 'e(' ex = expr ')' # Exp
	| 'sqrt(' ex = expr ')'  # Sqrt
    | 'read()' # Read
    ; 
COMMENT: '/*' .* '*/';
ID: [_A-Za-z]+;
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip;