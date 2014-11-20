grammar ValueExpression;

@header {
package expressionparser;

import trace.*;
import org.eclipse.emf.common.util.EList;
}

/* This will be the entry point of our parser. */
expression returns [ Value newValue ]
    : v=value { $newValue = $v.newValue; }
    ;

pair returns [ NameValuePair p ]: STRING '=' v=value  { $p=new NameValuePair($STRING.text.substring(1), $v.newValue); }
     ;
     
value returns [ Value newValue ]
      : STRING { $newValue = TraceFactory.eINSTANCE.createSimpleValue(); ((SimpleValue) $newValue).setValue($STRING.text); } 
	  | s=structDef { $newValue = $s.newStruct; } 
	  | a=arrayDef { $newValue = $a.newArray; }
	  ;

structDef returns [ StructValue newStruct ] : { $newStruct = TraceFactory.eINSTANCE.createStructValue(); }
      '{' p1=pair { $newStruct.getValues().put($p1.p.getName(), $p1.p.getValue()); } 
      (',' p2=pair { $newStruct.getValues().put($p2.p.getName(), $p2.p.getValue() ); } )* '}' 
      ;

arrayDef returns [ ArrayValue newArray ] : { $newArray = TraceFactory.eINSTANCE.createArrayValue(); } 
	'{' v=value { $newArray.getValues().add($v.newValue);}
	 (',' v2=value { $newArray.getValues().add($v2.newValue);} )* '}' 
	 ;
	  
STRING : [\-\.0-9a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;

