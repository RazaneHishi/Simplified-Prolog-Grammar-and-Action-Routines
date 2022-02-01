grammar T;

options{
backtrack = true;
language = Java;
}

@members {
	Tsem s = new Tsem();
}



prog : identifierList 
;

identifierList : identifier identifierList |
;

 
identifier: fact | query
;

fact:  	id1 = ID '(' id2 = ID ',' id3= ID {s.input($id1.text,$id2.text,$id3.text);}  
	 
	').' 
;

query: '?-' id1 = ID '(' id2 = ID ',' id3 = ID ').' {s.query($id1.text,$id2.text,$id3.text);}
;

//SCANNER
Digit:	('-')?('0'..'9')+
;


ID: ('a'..'z'|'\_') ('a'..'z'|'A'..'Z'|'0'..'9'|'\_')*
;

UC: ('A'..'Z'|'\_') ('a'..'z'|'A'..'Z'|'0'..'9'|'\_')*
;

String: '\'' ('a'..'z'|'A'..'Z'|'0'..'9')*  '\''
;

Op: '+'|'-'|'*'
;
// consume whitespace
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
