import javax.swing.*;
import java.awt.*;

public class Example extends JFrame {


    public Example(){
        initUI();
    }
    double answer;
    String answerAsString;
    String addString;
    String subString;
    String multiString;
    String divString;
    String finalString;
    double addDouble;
    double subDouble;
    double multiDouble;
    double divDouble;
    double finalDouble;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton add;
    private JButton sub;
    private JButton mul;
    private JButton div;
    private JButton deci;
    private JButton clr;
    private JButton equal;
    private JButton quitButton;
   
    private JPanel pane;
    private JPanel Block;
    private JTextField tf1;
   
    private Font font = new Font("SansSerif", Font.PLAIN, 20);

    private void initUI(){
    	
    	
    	 zero = new JButton("0");
    	 one = new JButton("1");
    	 two = new JButton("2");
    	 three = new JButton("3");
    	 four = new JButton("4");
    	 five = new JButton("5");
    	 six = new JButton("6");
    	 seven = new JButton("7");
    	 eight = new JButton("8");
    	 nine = new JButton("9");
    	 add = new JButton("+");
    	 sub = new JButton("-");
    	 mul = new JButton("x");
    	 div = new JButton("/");
    	 deci = new JButton(".");
    	 clr = new JButton("AC");
    	 equal = new JButton("=");
        //new Button
        quitButton = new JButton("Quit");
        
        //set tooltip text
        quitButton.setToolTipText("Want to quit?");
        
        
        
        //ActionListener (Actions on Button Press)
        quitButton.addActionListener((event) -> System.exit(0));

    
        	zero.addActionListener( (event)->{
                    tf1.setText(tf1.getText() + "0");
        	});
             
        	one.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "1");
        	});
        	two.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "2");
        	});

        	three.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "3");
        	});
        
        	four.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "4");
        	});
        	
        	five.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "5");
        	});
        	
        	six.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "6");
        	});
        	
        	seven.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "7");
        	});
        	eight.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "8");
        	});
        	nine.addActionListener( (event)->{
                tf1.setText(tf1.getText() + "9");
        	});
        	
        	add.addActionListener( (event)->{
        	    addString = tf1.getText();
                addDouble = Double.parseDouble(addString);
                tf1.setText("");
 
        	});
        	
        	sub.addActionListener( (event)->{
        		subString = tf1.getText();
                subDouble = Double.parseDouble(subString);
                tf1.setText("");
                deci.setEnabled(true);
 
        	});
        	
        	mul.addActionListener( (event)->{
        		multiString = tf1.getText();
                multiDouble = Double.parseDouble(multiString);
                tf1.setText("");
                deci.setEnabled(true);

 
        	});
        	
        	div.addActionListener( (event)->{
        		divString = tf1.getText();
                divDouble = Double.parseDouble(divString);
                tf1.setText("");
                deci.setEnabled(true);
 
        	});
        	
        	deci.addActionListener( (event)->{
        		tf1.setText(tf1.getText() + ".");
                String numDisplayContents = tf1.getText();

                if (numDisplayContents.contains(".")) {
                    deci.setEnabled(false);
                }
        	});
        	
        	clr.addActionListener( (event)->{
        		 tf1.setText("");
                 addString = null;
                 subString = null;
                 multiString = null;
                 divString = null;
                 finalString = null;
                
 
        	});
        	
        	equal.addActionListener( (event)->{
        	    finalString = tf1.getText();
                finalDouble = Double.parseDouble(finalString);
           
                if (addString != null) {
                    answer = (addDouble + finalDouble);
                    answerAsString = Double.toString(answer);
                    tf1.setText(answerAsString);

                } else if (subString != null) {
                    answer = (subDouble - finalDouble);
                    answerAsString = Double.toString(answer);
                    tf1.setText(answerAsString);

                } else if (multiString != null) {
                    answer = (multiDouble * finalDouble);
                    answerAsString = Double.toString(answer);
                    tf1.setText(answerAsString);

                } else if (divString != null) {
                    answer = (divDouble / finalDouble);
                    answerAsString = Double.toString(answer);
                    tf1.setText(answerAsString);

                } else {
                    addString = null;
                    subString = null;
                    multiString = null;
                    divString = null;
                }
        	});
        	
        	
        	
        
        tf1= new JTextField();
        tf1.setPreferredSize(new Dimension(130, 30));
        tf1.setEditable(false);
        tf1.setFont(font);
        tf1.setText("");
        setTitle("Simple Calculator");
        
        numBlock() ;
        createFlowLayout();

        //Position in screen center
        setLocationRelativeTo(null);
        //Close Application when window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void numBlock() {
    	this.Block = new JPanel();
    	
    	this.Block.add(this.one);
    	this.Block.add(this.two);
    	this.Block.add(this.three);
    	this.Block.add(this.add);
    	this.Block.add(this.four);
    	this.Block.add(this.five);
    	this.Block.add(this.six);
    	this.Block.add(this.sub);
    	this.Block.add(this.seven);
    	this.Block.add(this.eight);
    	this.Block.add(this.nine);
    	this.Block.add(this.div);
    	this.Block.add(this.clr);
    	this.Block.add(this.zero);
    	this.Block.add(this.deci);
    	this.Block.add(this.mul);
    	this.Block.add(this.quitButton);
    	this.Block.add(this.equal);
    	this.Block.setLayout( new GridLayout( 5, 5 ) );
    }

    private void createFlowLayout(){
    	
    	   //mind the order of the components!
        pane = (JPanel) getContentPane();
        pane.add(tf1);
       
        pane.add(Block);
        pane.setLayout(new FlowLayout());
        pane.setSize(300,300);
        pack();
    }
    
    
    public static void main(String[] args){
        //places the application on the Swing Event Queue such that all UI updates are concurrency-safe
        EventQueue.invokeLater(() ->{
            Example ex = new Example();
            ex.setVisible(true);
        });
    }

}
