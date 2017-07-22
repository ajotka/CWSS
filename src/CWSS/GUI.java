package CWSS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GUI {

	protected Shell shell;
	private static Text InputAll;
	private static Text ResultWindow;
	static Text TI_value;
	static Text AP_value;
	static Text AL_value;
	static Text IC_value;
	static Text RP_value;
	static Text FC_value;
	static Text RL_value;
	static Text AV_value;
	static Text IN_value;
	static Text AS_value;
	static Text SC_value;
	static Text BI_value;
	static Text DI_value;
	static Text EX_value;
	static Text EC_value;
	static Text P_value;
	
	static Map<String, String> All = new HashMap<String, String>();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void show() {
		try {
			GUI window = new GUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(785, 700);
		shell.setText("CWSS 1.1 Calculator");
		
		Label TI_label = new Label(shell, SWT.NONE);
		TI_label.setBounds(65, 123, 24, 15);
		TI_label.setText("TI");
		
		Label AP_label = new Label(shell, SWT.NONE);
		AP_label.setBounds(65, 178, 24, 15);
		AP_label.setText("AP");
		
		Label AL_label = new Label(shell, SWT.NONE);
		AL_label.setBounds(65, 233, 24, 15);
		AL_label.setText("AL");
		
		Label IC_label = new Label(shell, SWT.NONE);
		IC_label.setBounds(65, 288, 24, 15);
		IC_label.setText("IC");
		
		Label FC_label = new Label(shell, SWT.NONE);
		FC_label.setBounds(230, 123, 24, 15);
		FC_label.setText("FC");
		
		Label RP_label = new Label(shell, SWT.NONE);
		RP_label.setBounds(230, 178, 24, 15);
		RP_label.setText("RP");
		
		Label RL_label = new Label(shell, SWT.NONE);
		RL_label.setBounds(230, 233, 24, 15);
		RL_label.setText("RL");
		
		Label AV_label = new Label(shell, SWT.NONE);
		AV_label.setBounds(230, 288, 24, 15);
		AV_label.setText("AV");
		
		Label AS_label = new Label(shell, SWT.NONE);
		AS_label.setBounds(405, 123, 24, 15);
		AS_label.setText("AS");
		
		Label IN_label = new Label(shell, SWT.NONE);
		IN_label.setBounds(405, 178, 24, 15);
		IN_label.setText("IN");
		
		Label SC_label = new Label(shell, SWT.NONE);
		SC_label.setBounds(405, 233, 24, 15);
		SC_label.setText("SC");
		
		Label BI_label = new Label(shell, SWT.NONE);
		BI_label.setBounds(405, 288, 24, 15);
		BI_label.setText("BI");
		
		Label DI_label = new Label(shell, SWT.NONE);
		DI_label.setBounds(580, 123, 24, 15);
		DI_label.setText("DI");
		
		Label EX_label = new Label(shell, SWT.NONE);
		EX_label.setBounds(580, 178, 24, 15);
		EX_label.setText("EX");
		
		Label EC_label = new Label(shell, SWT.NONE);
		EC_label.setBounds(580, 233, 24, 15);
		EC_label.setText("EC");
		
		Label P_label = new Label(shell, SWT.NONE);
		P_label.setBounds(580, 288, 24, 15);
		P_label.setText("P");
		
		TI_value = new Text(shell, SWT.BORDER);
		TI_value.setEditable(false);
		TI_value.setText("0.0");
		TI_value.setBounds(95, 120, 76, 21);
		
		AP_value = new Text(shell, SWT.BORDER);
		AP_value.setEditable(false);
		AP_value.setText("0.0");
		AP_value.setBounds(95, 175, 76, 21);
		
		AL_value = new Text(shell, SWT.BORDER);
		AL_value.setEditable(false);
		AL_value.setText("0.0");
		AL_value.setBounds(95, 230, 76, 21);
		
		IC_value = new Text(shell, SWT.BORDER);
		IC_value.setEditable(false);
		IC_value.setText("0.0");
		IC_value.setBounds(95, 285, 76, 21);
		
		FC_value = new Text(shell, SWT.BORDER);
		FC_value.setEditable(false);
		FC_value.setText("0.0");
		FC_value.setBounds(260, 120, 76, 21);
		
		RP_value = new Text(shell, SWT.BORDER);
		RP_value.setEditable(false);
		RP_value.setText("0.0");
		RP_value.setBounds(260, 175, 76, 21);
		
		RL_value = new Text(shell, SWT.BORDER);
		RL_value.setEditable(false);
		RL_value.setText("0.0");
		RL_value.setBounds(260, 230, 76, 21);
		
		AV_value = new Text(shell, SWT.BORDER);
		AV_value.setEditable(false);
		AV_value.setText("0.0");
		AV_value.setBounds(260, 285, 76, 21);
		
		AS_value = new Text(shell, SWT.BORDER);
		AS_value.setEditable(false);
		AS_value.setText("0.0");
		AS_value.setBounds(435, 120, 76, 21);
		
		IN_value = new Text(shell, SWT.BORDER);
		IN_value.setEditable(false);
		IN_value.setText("0.0");
		IN_value.setBounds(435, 175, 76, 21);
		
		SC_value = new Text(shell, SWT.BORDER);
		SC_value.setEditable(false);
		SC_value.setText("0.0");
		SC_value.setBounds(435, 230, 76, 21);
		
		BI_value = new Text(shell, SWT.BORDER);
		BI_value.setEditable(false);
		BI_value.setText("0.0");
		BI_value.setBounds(435, 285, 76, 21);
		
		DI_value = new Text(shell, SWT.BORDER);
		DI_value.setEditable(false);
		DI_value.setText("0.0");
		DI_value.setBounds(610, 120, 76, 21);
		
		EX_value = new Text(shell, SWT.BORDER);
		EX_value.setEditable(false);
		EX_value.setText("0.0");
		EX_value.setBounds(610, 175, 76, 21);
		
		EC_value = new Text(shell, SWT.BORDER);
		EC_value.setEditable(false);
		EC_value.setText("0.0");
		EC_value.setBounds(610, 230, 76, 21);
		
		P_value = new Text(shell, SWT.BORDER);
		P_value.setEditable(false);
		P_value.setText("0.0");
		P_value.setBounds(610, 285, 76, 21);
		
		Label SampleAll = new Label(shell, SWT.NONE);
		SampleAll.setBounds(10, 13, 749, 30);
		SampleAll.setText("Sample: \r\nTI:H,0.9/AP:A,1.0/AL:A,1.0/IC:N,1.0/FC:T,1.0/RP:L,0.9/RL:A,1.0/AV:I,1.0/AS:N,1.0/IN:T,0.9/SC:A,1.0/BI:C,0.9/DI:H,1.0/EX:H,1.0/EC:N,1.0/P:NA,1.0");
		
		InputAll = new Text(shell, SWT.BORDER);
		InputAll.setBounds(10, 49, 749, 21);
		
		// Start create placeholder for InputAll
		if (InputAll.getText().length() == 0) {  
			InputAll.setText("> Type All here...");
		} 
		InputAll.addFocusListener(new FocusListener() {  

		    @Override  
		    public void focusGained(FocusEvent e) {  
		    	InputAll.setText("");
		    }  

		    @Override  
		    public void focusLost(FocusEvent e) { 

		        if (InputAll.getText().length() == 0) {  
		        	InputAll.setText("> TYPE VECTOR HERE");
		        }  

		    }  
		});
		// End placeholder
		// Start listener which get value
		InputAll.addFocusListener(new FocusListener() {
			
			@Override
			public void focusGained(FocusEvent e) {
				InputAll.setText("");				
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				
			}

		});
		// End get vector
		
		Label Result_label = new Label(shell, SWT.NONE);
		Result_label.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		Result_label.setBounds(10, 309, 55, 20);
		Result_label.setText("Results");
		
		ResultWindow = new Text(shell, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL);
		ResultWindow.setText("...\n");
		ResultWindow.setEditable(false);
		ResultWindow.setBounds(10, 335, 749, 316);
		
		Button btnSprawd = new Button(shell, SWT.NONE);
		btnSprawd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				GUI.clearResult();
				
				String All = InputAll.getText();
				
				ReadString example = new ReadString();
				boolean cnd = example.endSolution( All );
				
				if (cnd == true) {
					GUI.clearResult();
					try {
						for(Data var:  example.getVector()){
							setSingleValue( var.getName(),  var.getValue() );
							Vector.setNumeral( var.getName(),  var.getValue() );
							Vector.setLiteral( var.getName(),  var.getLiteral() );
						}
					} catch (MyExeption err) {}
				
				
					Vector.create();
					Algorithms.calc();
				}
			}
		});
		btnSprawd.setBounds(634, 76, 125, 25);
		btnSprawd.setText("Sprawdz wektor");

	}
	
	public static void setSingleValue(String label, Double value){
		String val =  String.valueOf(value);
		switch (label) {
			case "TI":
				GUI.TI_value.setText( val );
			break;
			case "AP":
				GUI.AP_value.setText( val );
			break;
			case "AL":
				GUI.AL_value.setText( val );
			break;
			case "IC":
				GUI.IC_value.setText( val );
			break;
			case "RP":
				GUI.RP_value.setText( val );
			break;
			case "FC":
				GUI.FC_value.setText( val );
			break;
			case "RL":
				GUI.RL_value.setText( val );
			break;
			case "AV":
				GUI.AV_value.setText( val );
			break;
			case "IN":
				GUI.IN_value.setText( val );
			break;
			case "AS":
				GUI.AS_value.setText( val );
			break;
			case "SC":
				GUI.SC_value.setText( val );
			break;
			case "BI":
				GUI.BI_value.setText( val );
			break;
			case "DI":
				GUI.DI_value.setText( val );
			break;
			case "EX":
				GUI.EX_value.setText( val );
			break;
			case "EC":
				GUI.EC_value.setText( val );
			break;
			case "P":
				GUI.P_value.setText( val );
			break;
		}
	}
	
	public static void setResult( String wynik){
		ResultWindow.append( wynik );
	}
	public static void setError ( String error ){
		ResultWindow.setText( error );
	}
	public static void clearResult() {
		ResultWindow.setText("");
	}
}