package br.usjt.provaint201516660;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/**
 * @author Matheus Ribeiro Barbosa Santos 201516660
 */

public class MainActivity extends Activity
{
    public static final String EXTRA_MESSAGE = "br.usjt.meuprimeiroapp.MESSAGE" ;

    /**
     * @author Matheus Ribeiro Barbosa Santos 201516660
     */
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    /**
     * @author Matheus Ribeiro Barbosa Santos 201516660
     java.lang.String*/
    public void enviar( View view )
    {
        Intent intent = new Intent( this , TabuadaActivity.class );

        EditText numero = ( EditText ) findViewById( R.id.edit_tabuada );
        EditText tabuada = ( EditText ) findViewById( R.id.edit_number );


        String message = numero.getText( ).toString( ) + ":" + tabuada.getText( ).toString( );

        intent.putExtra( EXTRA_MESSAGE , message );

        startActivity( intent );
    }
}
