package us.amirite.lightsout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;





public class LightsOutActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.id.but0).setOnClickListener(this);
        findViewById(R.id.but1).setOnClickListener(this);
        findViewById(R.id.but2).setOnClickListener(this);
        findViewById(R.id.but3).setOnClickListener(this);
        findViewById(R.id.but4).setOnClickListener(this);
        findViewById(R.id.but5).setOnClickListener(this);
        findViewById(R.id.but6).setOnClickListener(this);
        findViewById(R.id.but7).setOnClickListener(this);
        findViewById(R.id.but8).setOnClickListener(this);
        findViewById(R.id.but9).setOnClickListener(this);
        findViewById(R.id.but10).setOnClickListener(this);
        findViewById(R.id.but11).setOnClickListener(this);
        findViewById(R.id.but12).setOnClickListener(this);
        findViewById(R.id.but13).setOnClickListener(this);
        findViewById(R.id.but14).setOnClickListener(this);
        findViewById(R.id.but15).setOnClickListener(this);
        
    }
    
    
    
    
    
    // Called first time user clicks on the menu button
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	return true;
    }

    
    
    
    
    // Called when an options item is clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case R.id.itemInfo:
    		startActivity(new Intent(this, InfoActivity.class));
    		break;
    	}
    	return true;
    }





	@Override
	public void onClick(View v) {
		gameStatus();
		ToggleButton b = (ToggleButton) v;
		switch (b.getId()) {
		case R.id.but0:
			((ToggleButton) findViewById(R.id.but1)).toggle();
			((ToggleButton) findViewById(R.id.but4)).toggle();
			break;
			
		case R.id.but1:
			((ToggleButton) findViewById(R.id.but0)).toggle();
			((ToggleButton) findViewById(R.id.but2)).toggle();
			((ToggleButton) findViewById(R.id.but5)).toggle();
			break;

		case R.id.but2:
			((ToggleButton) findViewById(R.id.but1)).toggle();
			((ToggleButton) findViewById(R.id.but3)).toggle();
			((ToggleButton) findViewById(R.id.but6)).toggle();
			break;
			
		case R.id.but3:
			((ToggleButton) findViewById(R.id.but2)).toggle();
			((ToggleButton) findViewById(R.id.but7)).toggle();
			break;
			
		case R.id.but4:
			((ToggleButton) findViewById(R.id.but0)).toggle();
			((ToggleButton) findViewById(R.id.but5)).toggle();
			((ToggleButton) findViewById(R.id.but8)).toggle();
			break;
			
		case R.id.but5:
			((ToggleButton) findViewById(R.id.but1)).toggle();
			((ToggleButton) findViewById(R.id.but4)).toggle();
			((ToggleButton) findViewById(R.id.but6)).toggle();
			((ToggleButton) findViewById(R.id.but9)).toggle();
			break;
		case R.id.but6:
			((ToggleButton) findViewById(R.id.but2)).toggle();
			((ToggleButton) findViewById(R.id.but5)).toggle();
			((ToggleButton) findViewById(R.id.but7)).toggle();
			((ToggleButton) findViewById(R.id.but10)).toggle();
			break;
			
		case R.id.but7:
			((ToggleButton) findViewById(R.id.but3)).toggle();
			((ToggleButton) findViewById(R.id.but6)).toggle();
			((ToggleButton) findViewById(R.id.but11)).toggle();
			break;
			
		case R.id.but8:
			((ToggleButton) findViewById(R.id.but4)).toggle();
			((ToggleButton) findViewById(R.id.but9)).toggle();
			((ToggleButton) findViewById(R.id.but12)).toggle();
			break;
			
		case R.id.but9:
			((ToggleButton) findViewById(R.id.but5)).toggle();
			((ToggleButton) findViewById(R.id.but8)).toggle();
			((ToggleButton) findViewById(R.id.but10)).toggle();
			((ToggleButton) findViewById(R.id.but13)).toggle();
			break;
			
		case R.id.but10:
			((ToggleButton) findViewById(R.id.but6)).toggle();
			((ToggleButton) findViewById(R.id.but9)).toggle();
			((ToggleButton) findViewById(R.id.but11)).toggle();
			((ToggleButton) findViewById(R.id.but14)).toggle();
			break;
			
		case R.id.but11:
			((ToggleButton) findViewById(R.id.but7)).toggle();
			((ToggleButton) findViewById(R.id.but10)).toggle();
			((ToggleButton) findViewById(R.id.but15)).toggle();
			break;
			
		case R.id.but12:
			((ToggleButton) findViewById(R.id.but8)).toggle();
			((ToggleButton) findViewById(R.id.but13)).toggle();
			break;
			
		case R.id.but13:
			((ToggleButton) findViewById(R.id.but9)).toggle();
			((ToggleButton) findViewById(R.id.but12)).toggle();
			((ToggleButton) findViewById(R.id.but14)).toggle();
			break;
			
		case R.id.but14:
			((ToggleButton) findViewById(R.id.but10)).toggle();
			((ToggleButton) findViewById(R.id.but13)).toggle();
			((ToggleButton) findViewById(R.id.but15)).toggle();
			break;
			
		case R.id.but15:
			((ToggleButton) findViewById(R.id.but11)).toggle();
			((ToggleButton) findViewById(R.id.but14)).toggle();
			break;
		}
	}

	
	private void gameStatus() {
		boolean checker = false;
	    ToggleButton but0 = (ToggleButton) findViewById(R.id.but0);
	    ToggleButton but1 = (ToggleButton) findViewById(R.id.but1);
	    ToggleButton but2 = (ToggleButton) findViewById(R.id.but2);
	    ToggleButton but3 = (ToggleButton) findViewById(R.id.but3);
	    ToggleButton but4 = (ToggleButton) findViewById(R.id.but4);
	    ToggleButton but5 = (ToggleButton) findViewById(R.id.but5);
	    ToggleButton but6 = (ToggleButton) findViewById(R.id.but6);
	    ToggleButton but7 = (ToggleButton) findViewById(R.id.but7);
	    ToggleButton but8 = (ToggleButton) findViewById(R.id.but8);
	    ToggleButton but9 = (ToggleButton) findViewById(R.id.but9);
	    ToggleButton but10 = (ToggleButton) findViewById(R.id.but10);
	    ToggleButton but11 = (ToggleButton) findViewById(R.id.but11);
	    ToggleButton but12 = (ToggleButton) findViewById(R.id.but12);
	    ToggleButton but13 = (ToggleButton) findViewById(R.id.but13);
	    ToggleButton but14 = (ToggleButton) findViewById(R.id.but14);
	    ToggleButton but15 = (ToggleButton) findViewById(R.id.but15);
		
	}

	
	
	
	
	
	
	
	
	
}






















