package Calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

public class CalculatorDemo extends JFrame{
	private JButton add1,sub,mul,div,ok;
	private JLabel leftnum,rightnum,equal;
	private JTextField opera,result;
	private int index = 0;
	public static void main(String[] args) {
		new CalculatorDemo();
	}
	public CalculatorDemo(){
		this.setTitle("my_calculator");
		this.setBounds(300, 300, 570, 260);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//--------------------添加按钮--------------------------
		add1 =new JButton("+");
		sub =new JButton("-");
		mul =new JButton("*");
		div =new JButton("/");
		ok =new JButton("ok");
		setLayout(null);
		add1.setBounds(10,120,100,100);
		sub.setBounds(120,120,100,100);
		mul.setBounds(230,120,100,100);
		div.setBounds(340,120,100,100);
		ok.setBounds(450,120,100,100);
		this.add(add1);
		this.add(sub);
		this.add(ok);
		this.add(mul);
		this.add(div);
//------------------添加显示框-------------------------------
		leftnum = new JLabel("12",JLabel.CENTER);
		rightnum = new JLabel("2",JLabel.CENTER);
		equal = new JLabel("=",JLabel.CENTER);
		leftnum.setBounds(10,10,100,100);
		rightnum.setBounds(230,10,100,100);
		equal.setBounds(340,10,100,100);
		this.add(leftnum);
		leftnum.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(rightnum);
		rightnum.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(equal);
		equal.setBorder(BorderFactory.createLineBorder(Color.black));

//-------------------改变字体----------------------
		final Font font = new Font("宋体", Font.BOLD, 21);
		add1.setFont(font);
		equal.setFont(font);
		sub.setFont(font);
		mul.setFont(font);
		div.setFont(font);
		ok.setFont(font);
		leftnum.setFont(font);
		rightnum.setFont(font);

//----------------添加文本框---------------------
		opera = new JTextField();
		opera.setHorizontalAlignment(JTextField.CENTER);
		result = new JTextField();
		result.setHorizontalAlignment(JTextField.CENTER);
		opera.setBounds(120,10,100,100);
		result.setBounds(450,10,100,100);
		this.add(opera);
		this.add(result);
		opera.setFont(font);
		result.setFont(font);

		this.setVisible(true);
//----------------添加事件-------------------
		add1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				opera.setText("+");
				result.setText("?");
				index = 1;
			}
		});

		sub.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				opera.setText("-");
				result.setText("?");
				index = 2;
			}
		});

		mul.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				opera.setText("*");
				result.setText("?");
				index = 3;
			}
		});

		div.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				opera.setText("/");
				result.setText("?");
				index = 4;
			}
		});

		ok.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if (index == 1) {
					result.setText("14");
				}
				if (index == 2) {
					result.setText("10");
				}
				if (index == 3) {
					result.setText("24");
				}
				if (index == 4) {
					result.setText("6");
				}
				index = 0;
			}
		});
	}

}
