package compilador;

public interface ParserConstants
{
    int START_SYMBOL = 35;

    int FIRST_NON_TERMINAL    = 35;
    int FIRST_SEMANTIC_ACTION = 62;

    int[][] PARSER_TABLE =
        {
            { -1,  0, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1,  0, -1,  0,  0,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 21, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, 21, -1, 21, 21, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { 23, 22, -1, -1, -1, -1, 22, -1, 23, 23, -1, -1, -1, 22, -1, 22, 22, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1,  7,  7,  7,  7,  7, -1, -1, -1, -1,  7,  7, -1, -1,  7, -1, -1, -1, -1, -1, -1, -1,  7, -1, -1, -1, -1, -1, -1, -1,  7,  7, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  8, -1, -1, -1, -1,  9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 16, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, 17, -1, 18, 18, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, -1, 26, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, 11, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 27, 27, 27, 27, 27, -1, -1, -1, -1, 27, 27, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, 27, 27, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, 29, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, 28, 28, -1, 28, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 31, 31, 31, 31, 31, -1, -1, -1, -1, 33, 34, -1, -1, 32, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, 31, 31, -1, -1 },
            { -1, 35, 35, 35, 35, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, 35, 35, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, 36, 36, -1, 36, -1, 36, 37, 37, 37, 37, 37, 37, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, 39, 40, 41, 42, 43, -1, -1, -1, -1 },
            { -1, 44, 44, 44, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, 44, 44, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, 45, 45, -1, 45, -1, 45, 45, 45, 45, 45, 45, 45, 46, 47, -1, -1 },
            { -1, 48, 48, 48, 48, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, 48, 48, -1, -1 },
            { -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, 49, 49, -1, 49, -1, 49, 49, 49, 49, 49, 49, 49, 49, 49, 50, 51 },
            { -1, 52, 53, 54, 55, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, -1, -1, 58, 59, -1, -1 }
        };

        int[][] PRODUCTIONS = 
        {
            { 77, 83, 36, 78 },
            { 41, 21, 51, 44 },
            { 87, 22, 18, 51, 88 },
            { 86 },
            { 14, 23, 41, 89, 24 },
            { 16, 23, 38, 24 },
            { 17, 23, 38, 24, 79 },
            { 51, 76, 39 },
            { 19, 38 },
            {  0 },
            { 18, 23, 51, 24, 90, 36, 48, 10, 91 },
            { 92,  9, 36 },
            {  0 },
            {  7, 93, 23, 51, 24, 22, 18, 50, 94, 36, 10, 95 },
            { 15 },
            { 11 },
            { 43 },
            { 45 },
            { 46 },
            { 47 },
            { 49 },
            { 40, 20, 37 },
            { 36 },
            {  0 },
            {  2, 84, 42 },
            { 19, 41 },
            {  0 },
            { 53, 52 },
            {  0 },
            {  8, 53, 80, 52 },
            { 13, 53, 81, 52 },
            { 54 },
            { 15, 73 },
            { 11, 74 },
            { 12, 53, 75 },
            { 57, 55 },
            {  0 },
            { 56, 71, 57, 72 },
            { 25 },
            { 26 },
            { 27 },
            { 28 },
            { 29 },
            { 30 },
            { 59, 58 },
            {  0 },
            { 31, 59, 63, 58 },
            { 32, 59, 64, 58 },
            { 61, 60 },
            {  0 },
            { 33, 61, 65, 60 },
            { 34, 61, 66, 60 },
            {  2, 85 },
            {  3, 67 },
            {  4, 68 },
            {  5 },
            {  6, 82 },
            { 23, 51, 24 },
            { 31, 61 },
            { 32, 61, 70 }
        };
        
    String[] PARSER_ERROR =
    {
        "",
        "esperado EOF",
        "esperado identificador",
        "esperado constante_int",
        "esperado constante_float",
        "esperado constante_binaria",
        "esperado constante_string",
        "esperado check",
        "esperado and",
        "esperado else",
        "esperado end",
        "esperado false",
        "esperado not",
        "esperado or",
        "esperado read",
        "esperado true",
        "esperado write",
        "esperado writeln",
        "esperado if",
        "esperado \",\"",
        "esperado \";\"",
        "esperado \"=\"",
        "esperado \":\"",
        "esperado \"(\"",
        "esperado \")\"",
        "esperado \"==\"",
        "esperado \"!=\"",
        "esperado \"<\"",
        "esperado \"<=\"",
        "esperado \">\"",
        "esperado \">=\"",
        "esperado \"+\"",
        "esperado \"-\"",
        "esperado \"*\"",
        "esperado \"/\"",
        "esperado identificador check read write writeln if", 							   //"<lista_comandos> inválido",
        "esperado EOF identificador check else end read write writeln if", 				   //"<lista_comandos1> inválido",
        "esperado expressao",  									//<lista_expressao> inválido",
        "esperado , )", 										//<lista_expressao1> inválido",
        "esperado identificador check read write writeln if", 	//"<comando> inválido",
        "esperado identificador", 								//"<lista_id> inválido",
        "esperado , = )", 										//<lista_id1> inválido",
        "esperado identificador", 								//<atribuicao> inválido",
        "esperado ; :", 										//<atribuicao1> inválido",
        "esperado read", 										//<entrada_dados> inválido",
        "esperado write writeln", 								//<saida_dados> inválido",
        "esperado if", 											//<selecao> inválido",
        "esperado else end",									//<selecao1> inválido",
        "esperado check", 										//<repeticao> inválido",
        "esperado false true", 									//<repeticao1> inválido",
        "esperado expressao",  									//"<expressao> inválido",
        "esperado expressao", 			    			 		//<expressao_> inválido",
        "esperado expressao",  	 								//"<elemento> inválido",
        "esperado expressao", 				 					//"<relacional> inválido",
        "esperado expressao", 							    	//<relacional_> inválido",
        "esperado == != < <= > >=",        						//<operador_relacional> inválido",
        "esperado expressao", 		 					    	//"<aritmetica> inválido",
        "esperado expressao", 							    	//<aritmetica_> inválido",
        "esperado expressao", 				 			    	//"<termo> inválido",
        "esperado expressao", 						 			//<termo_> inválido",
        "esperado expressao", 				 			    	//<fator> inválido"
        "esperado identificador check read write writeln if", 	//<programa> inválido"
    };
}
