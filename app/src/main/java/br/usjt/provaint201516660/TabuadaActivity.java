package br.usjt.provaint201516660;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * @author Matheus Ribeiro Barbosa Santos 201516660
 */

public class TabuadaActivity extends Activity
{

    /**
     * @author Matheus Ribeiro Barbosa Santos 201516660
     */
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tabuada );

        Intent intent = getIntent( );
        String chave = intent.getStringExtra( MainActivity.EXTRA_MESSAGE );

        ArrayList< String > lista = new ArrayList< >( );

        lista = geraTabuada( chave );

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, lista );
        ListView listView = ( ListView ) findViewById( R.id.listview );
        listView.setAdapter(adapter);
    }

    /**
     * @author Matheus Ribeiro Barbosa Santos 201516660
     */
    public ArrayList<String> geraTabuada( String chave )
    {
        ArrayList< String > tabuada = new ArrayList<  >( );

        String vetor [ ] = chave.split( ":" );

       try
       {
           int numero = Integer.parseInt( vetor[ 0 ] );
           int ate = Integer.parseInt( vetor[ 1 ] );

           for( int i = 0 ; i <= ate ; i++ )
           {
               int calculo = i * numero ;

               String texto =  numero + " X " + i +  " = " + calculo;

               tabuada.add( texto );
           }
       }
       catch( Exception e )
       {

       }
       return  tabuada;
    }





}
