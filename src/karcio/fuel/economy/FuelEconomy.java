package karcio.fuel.economy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FuelEconomy extends Activity 
{
	private EditText editText1;
	private EditText editText2;
	
	private TextView textView4;
	private TextView textView6;
	
	private Button button1;
		
	private double miles;
	private double liters;
	private double result;
	private double convertMilesToKm;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initParams();
    }
    
    private void initParams()
    {
    	editText1 = (EditText)findViewById(R.id.editText1);
    	editText2 = (EditText)findViewById(R.id.editText2);
    	
    	textView4 = (TextView)findViewById(R.id.textView4);
    	textView6 = (TextView)findViewById(R.id.textView6);
    	
    	button1 = (Button)findViewById(R.id.button1);
    	
    	button1.setOnClickListener(new Button.OnClickListener() 
    	{ 
    		public void onClick (View v)
			{ 
				calculate(); 
			}
    	});
    	
    }
    
    private void calculate()
    {
    	miles = Double.parseDouble(editText1.getText().toString());
    	liters = Double.parseDouble(editText2.getText().toString());
    	
    	convertMilesToKm = miles * 1.61;
    	result = 100 * liters / convertMilesToKm;
    	
    	String ConvertMilesToKm = String.format("%.0f", convertMilesToKm);
    	textView6.setText(ConvertMilesToKm);
    	
    	String Result = String.format("%.1f", result);
    	textView4.setText(Result);

    	//textView6.setText(Double.toString(convertMilesToKm));
    	//textView4.setText(Double.toString(result));
    	    	
    }

}
