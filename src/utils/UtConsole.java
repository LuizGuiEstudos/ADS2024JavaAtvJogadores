package utils;

import java.util.Scanner;

public class UtConsole {
	
	public static void clearConsole( Scanner scan ) {
		//chamar funcao logo na linha acima da proxima solicitação de entrada pulada
		if (scan.hasNext()) {
			scan.next();
		}
	}
	
}
