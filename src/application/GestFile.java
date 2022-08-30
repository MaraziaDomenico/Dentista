package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestFile
{
    /*--------------------------------------------------------*/
    /* Se il file esiste lo apre in append, altrimeni lo crea */
    /*--------------------------------------------------------*/
	String NOME_FILE = new String();
	FileWriter fileWriter;
	FileReader fileReader;
	BufferedReader bufferedReader;

	/*========================================================*/
	/*  Costruttore vuoto                                     */
	/*========================================================*/
	public GestFile()
	{
	}
	/*========================================================*/
	/*  Apertura del file (modo w/a/r)                        */
	/*========================================================*/
	void apri(String nomeFile, char modo) throws FileNotFoundException, IOException
	{
		NOME_FILE = nomeFile;
		if (modo == 'w')  // apre in scrittura/append
		{
          File f = new File(nomeFile);  		  // Get the file
          /*--------------------------------------------------------*/
          /* Se il file esiste lo apre in append, altrimeni lo crea */
          /*--------------------------------------------------------*/
          if (f.exists())
          {
            fileWriter = new FileWriter (NOME_FILE, true);
          }
          else
          {
            fileWriter = new FileWriter (NOME_FILE);
          }
		}
		else            // apre in lettura
		{
			fileReader = new FileReader(NOME_FILE);
			bufferedReader = new BufferedReader( fileReader );
		}
	}
	/*========================================================*/
	/*  Chiusura del File (aperto in scrittura/lettura)       */
	/*========================================================*/
	void chiudi(char modo) throws IOException
	{
		if (modo == 'w')
		{
		  fileWriter.close();
		}
		else
		{
			fileReader.close();
		}
	}
	/*========================================================*/
	/*  Rimozione del file(nome.txt)*/
	/*========================================================*/
	void cancella (String nome) {
		File f = new File(nome);
		f.delete();
	}
	/*========================================================*/
	/*  Scrittura del record sul file  (campi separati dal ;) */
	/*========================================================*/
	public void scriviRecord (String record) throws FileNotFoundException, IOException
	{
	  fileWriter.write(record);
	}
	/*========================================================*/
	/*  Lettura di una riga dal file (campi separati da ;)    */
	/*========================================================*/
	String leggiRecord() throws FileNotFoundException, IOException
	{
		String linea = bufferedReader.readLine();
		return (linea);   // ritorna la linea letta oppure null se EOF	
	}
}