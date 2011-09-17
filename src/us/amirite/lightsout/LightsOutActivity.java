package us.amirite.lightsout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ToggleButton;





public class LightsOutActivity extends Activity implements OnClickListener {
    
	protected ToggleButton[][] buttonArray;
	
	
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
		buttonArray = new ToggleButton[4][4];

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				buttonArray[x][y] = new ToggleButton(this);
				LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT, 1.0f);
				buttonArray[x][y].setLayoutParams(params);
				
				((ViewGroup) findViewById(R.layout.main)).addView(buttonArray[x][y]);
			}
		}


        setContentView(findViewById(R.layout.main));
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

	}

	
	private void gameStatus() {
		boolean checker = false;

	}

	
	
	
	
	
	
	
	
	
}






















