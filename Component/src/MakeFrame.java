import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MakeFrame extends Frame implements ActionListener{

	private List ls;
	private Panel pl;
	private TextField tf;
	private Button okbtn;
	private Button exitbtn;
	
	public MakeFrame() {
		// TODO Auto-generated constructor stub
		ls = new List();
		pl = new Panel();
		tf = new TextField(20);
		okbtn = new Button("OK");
		exitbtn = new Button("EXIT");
		
		setLayout(new BorderLayout());
		add(pl,BorderLayout.NORTH);
		add(ls,BorderLayout.CENTER); 
		
		pl.add(new Label("write"));
		pl.add(tf);
		pl.add(okbtn);
		pl.add(exitbtn);
		
		okbtn.addActionListener(this);//this = actionPerformed를 자동으로 찾음
		exitbtn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == okbtn) {
			ls.add(tf.getText());
			tf.setText("");
		}else {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
	
	
}
