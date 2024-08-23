package main;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Jogador;
import utils.UtConsole;

public class Main {
	
	static boolean keepLoop = true;
	static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int act = 0;
		//LOOP - GERENCIAMENTO DE JOGADORES
		while( keepLoop ) {
			//DISPLAY - ACOES
			System.out.println( "  Digite a ação desejada para o gerenciamento dos jogadores ( 1 - adicionar, 2 - resgatar, 3 - alterar, 4 - listar, 5 - deletar, 0 - sair ) :  " );
			//DECIDIR ACTION
			act = scan.nextInt(); 
			switch ( act ) { 
				case 1: add();break;
				case 2: request(); break;
				case 3: alter();  break;
				case 4: list();  break;
				case 5: delete(); break;
				default:quit(); break;
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	
		scan.close();
		
		System.out.println( " Programa fechado." );
	}

	private static void quit() {
		System.out.println( " Saindo do programa..." );
		keepLoop = false;
	}

	private static void delete() {
		// TODO Auto-generated method stub
	}

	private static void alter() {
		// TODO Auto-generated method stub
		
	}

	private static void request() {
		// TODO Auto-generated method stub
		
	}

	private static void add() {
		System.out.println( " #########   Adicionar Novo Jogador   ######### " );
		
		jogadores.add( solicitarEntradasDeNovoJogador() );
		
		System.out.println( " ### jogador adicionado - OK " );
	}

	private static void list() {
		System.out.println( " #########   Listando todos jogadores cadastrados   ######### " );
		int i = 0;
		//LOOP - printar elementos jogadores
		for ( Jogador jogador : jogadores ) {
			i++;
			System.out.println( i + ": " );
			System.out.println( "	Nome: " + jogador.getNome() );
			System.out.println( "	Time: " + jogador.getTime() );
			System.out.println( "	Camisa: " + jogador.getCamisa() );
		}
		
		System.out.println( " ### listagem terminada - OK " );
	}
	
	private static Jogador solicitarEntradasDeNovoJogador() {
		System.out.println( "informe seu time: " );
		scan.next();
		String jTime = scan.nextLine();
		System.out.println( "informe seu nome: " );
		String jNome = scan.nextLine();
		System.out.println( "informe sua camisa: " );
		int jCamisa = scan.nextInt();
		
		Jogador nJ = new Jogador(jNome, jTime, jCamisa);
		
		return nJ;
				
		/*String nome;
		String time;
		int camisa;*/
	}
	
	
	
}




/*o que fazer:
//		1 – Adicionar jogador
		2 – Resgatar jogador
		3 – Alterar jogador
		4 – Listar todos os jogador
		5 – Excluir um jogador
		6 - Sai

*/