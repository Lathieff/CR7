import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class C1 extends Applet implements ActionListener {

TextField display;
Button[] num = new Button[10];
Button add, sub, mul, div, mod, pow, eq, clr, dot;

double n1, n2, result;
char op;

public void init(){

setLayout(new BorderLayout());

display = new TextField();
display.setEditable(false);
add(display, BorderLayout.NORTH);

Panel p = new Panel();
p.setLayout(new GridLayout(5,4));

// number buttons
for(int i=0;i<=9;i++){
num[i] = new Button(String.valueOf(i));
num[i].addActionListener(this);
}

// operation buttons
add = new Button("+");
sub = new Button("-");
mul = new Button("*");
div = new Button("/");
mod = new Button("%");
pow = new Button("^");
eq = new Button("=");
clr = new Button("C");
dot = new Button(".");

// add listeners
Button[] ops = {add, sub, mul, div, mod, pow, eq, clr, dot};
for(Button b : ops){
b.addActionListener(this);
}

// layout
p.add(num[7]); p.add(num[8]); p.add(num[9]); p.add(add);
p.add(num[4]); p.add(num[5]); p.add(num[6]); p.add(sub);
p.add(num[1]); p.add(num[2]); p.add(num[3]); p.add(mul);
p.add(num[0]); p.add(dot); p.add(mod); p.add(div);
p.add(clr); p.add(pow); p.add(eq);

add(p, BorderLayout.CENTER);
}

public void actionPerformed(ActionEvent e){

String cmd = e.getActionCommand();

// numbers
if(cmd.charAt(0)>='0' && cmd.charAt(0)<='9'){
display.setText(display.getText() + cmd);
}

// decimal
else if(cmd.equals(".")){
if(!display.getText().contains(".")){
display.setText(display.getText() + ".");
}
}

// clear
else if(cmd.equals("C")){
display.setText("");
n1=n2=result=0;
}

// equals
else if(cmd.equals("=")){
n2 = Double.parseDouble(display.getText());

switch(op){
case '+': result = n1+n2; break;
case '-': result = n1-n2; break;
case '*': result = n1*n2; break;
case '/': result = n1/n2; break;
case '%': result = n1%n2; break;
case '^': result = Math.pow(n1,n2); break;
}

display.setText(String.valueOf(result));
}

// operator
else{
n1 = Double.parseDouble(display.getText());
op = cmd.charAt(0);
display.setText("");
}
}
}