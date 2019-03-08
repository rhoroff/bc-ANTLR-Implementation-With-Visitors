grammar Calculator;

@header {
    import java.util.Hashtable;
    import java.lang.Math;
    import java.util.*;
    import java.io.Console;
}

@members {
     Hashtable<String, Double> variables = new Hashtable<String,Double>();
}

input: (varAssign)* (topExpr)* (comment)* (topBool)* (';' topExpr)* (';' comment)* (';' varAssign)* (';' topBool)*  (';' topExpr)* ';'?;

comment: COMMENT;

varAssign:
	varName = ID '=' ex = expr {variables.put($varName.text, $ex.i);};

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
	| '(' ex = expr ')' { $i = $ex.i; } #Paren
	| variable = expr op = ('++' | '--') { 
        if($op.text.equals("++")){
            if(variables.get($variable.text) == null){
                $i=0;
                variables.put($variable.text, 1.0);
            }else{ 
                $i= variables.get($variable.text);
                variables.put($variable.text, variables.get($variable.text) + 1);
            }
        } 
        if($op.text.equals("--")){
            if(variables.get($variable.text) == null){
                $i=0;
                variables.put($variable.text, -1.0);
            }else{ 
                $i= variables.get($variable.text);
                variables.put($variable.text, variables.get($variable.text) - 1);
            }
        } 
    } # PostCrement
	| op = ('++' | '--') variable = expr { 
        if($op.text.equals("++")){
            if(variables.get($variable.text) == null){
                $i=1;
                variables.put($variable.text, 1.0);
            }else{ 
                $i= variables.get($variable.text) + 1;
                variables.put($variable.text, variables.get($variable.text) + 1);
            }
        } 
        if($op.text.equals("--")){
            if(variables.get($variable.text) == null){
                $i=-1;
                variables.put($variable.text, -1.0);
            }else{ 
                $i= variables.get($variable.text) -1;
                variables.put($variable.text, variables.get($variable.text) - 1);
            }
        } 
    } # PreCrement
	| el = expr op = '^' er = expr { 
        $i = Math.pow($el.i, $er.i);
    } # Pow
	| el = expr op = ('/' | '*' | '%') er = expr #DivTimesMod
	| el = expr op = ('+' | '-') er = expr # AddSub
	| INT # Int 
	| DOUBLE  #Double
	| var = ID { 
        if(variables.get($var.text) == null){
            $i=0;
        }else{ 
            $i= variables.get($var.text);
        }
    }#VarAss
	| 's(' ex = expr ')' { $i = Math.sin($ex.i);} # Sin
	| 'c(' ex = expr ')' { $i = Math.cos($ex.i);} # Cos
	| 'l(' ex = expr ')' { $i = Math.log($ex.i);} # Ln
	| 'e(' ex = expr ')' { $i = Math.exp($ex.i);} # Exp
	| 'sqrt(' ex = expr ')' {$i = Math.sqrt($ex.i);} # Sqrt
    | 'read()' { 
        Scanner s = new Scanner(System.in);
        String input = s.next();
        $i = Double.parseDouble(input);
        s.close();
    } # Read
    ; 
COMMENT: '/*' .* '*/';
ID: [_A-Za-z]+;
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip;