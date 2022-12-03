import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;  

public class Bot extends JFrame{
	
	private JTextArea Chatarea=new JTextArea();
	private JTextField chatbox=new JTextField();
 	
	public Bot(){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);  
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(1000 , 600);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setTitle("ChatBot");
		frame.add(Chatarea);
		frame.add(chatbox);
		
		Chatarea.setSize(1200, 400);	//for textarea
		Chatarea.setLocation(2 , 2);
		
		chatbox.setSize(1000 , 50);	//for textfield
		chatbox.setLocation(2 , 500);

		ArrayList<String> ls=new ArrayList<String>();
		ls.add("hii");//0
		ls.add("hello");//1
		ls.add("how are u?");//2
		ls.add("name");//3
		ls.add("password");//4;
		ls.add("are u a robot?");//5
		ls.add("who created u?");//6
		ls.add("how is the weather?");//7
		ls.add("tell me ur algorithm");//8
		ls.add("what are the features of system?");//9
		ls.add("sum");//10
		ls.add("what is todays date?");//11
		ls.add("bye");//12
		ls.add("email");	//13
		ls.add("what is the time now?");//14
		ls.add("who created java?");//15
		ls.add("what is today's day?");//16
		ls.add("tell me some programming languages");//17
		ls.add("oopc concepts");//18
		ls.add("what is object in java?");//19
		ls.add("what is class in java?");//20
		ls.add("types of inheritance");//21
		ls.add("what is inheritance?");//22
		ls.add("what is method overloading?");//23
		ls.add("what is method overriding?");//24
		ls.add("what is polymorphism?");//25
		ls.add("what is abstraction?");//26
		ls.add("what is encapsulation?");//27
		ls.add("what is reusability?");//28
		ls.add("how ru feeling today?");//29
		ls.add("do u like java?");//30

		ArrayList<String> list=new ArrayList<String>();
		list.add("Hii...Nice meeting you");
		list.add("Fine...Good");
		list.add("My name is Chatbot");
		list.add("Sorry!!I can't say it");
		list.add("abcd@123.gmail.com");
		list.add("Yes.I am a robot");
		list.add("My master");
		list.add("It's cold");
		list.add("Bye!!come back if u have any queries");
		list.add("I run through java");
		list.add("company:dell "+"os:windows 11 "+"ram:16gb "+"generation:11th gen "
							+"graphics:nvidia "+"ssd:512gb");
		list.add("Java was created by James Gosling");
		list.add("Python"+"\n"+"c"+"\n"+"c++"+"\n"+"java"+"\n"+"dbms");
		list.add("class"+"\n"+"object"+"\n"+"method"+"\n"+"encapsulation"+"\n"+
						"inheritance"+"\n"+"polymorphism"+"\n"+"abstraction"+"\n"+"reusability");
		list.add("a real time entity");
		list.add("a blueprint of object");
		list.add("simple inheritance"+"\n"+"multiple inheritance"+"\n"+"multilevel inheritance"+"\n"
						+"hierarchial inheritance"+"\n"+"hybrid inheriance");
		list.add("When one object acquires all the properties and behaviours of a parent object,it is known as inheritance");
		list.add("When a class have multiple methods by same name but different arguments");
		list.add("Occurs when a subclass has the same method as the parent class");
		list.add("One task is performed in different ways according to the environment");
		list.add("Hiding internal details and showing functionality");
		list.add("Binding code and data into single unit");
		list.add("A mechanism which facilitates you to reuse the fields and methods of existing class when you a create a new class");
		list.add("Now that u spoke to me,I'm feeling great!!");
		list.add("Yes,I like java.");

		chatbox.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae){

				String text=chatbox.getText().toLowerCase();
				Chatarea.append("HUMAN->"+text+"\n");
				chatbox.setText("");
	
				if(text.equals(ls.get(0)) || (text.equals(ls.get(1)))){
					
					bot(list.get(0));
				}
				if(text.equals(ls.get(2))){
					bot(list.get(1));
				}
	
				if(text.equals(ls.get(3))){
					bot(list.get(2));
				}

				if(text.equals(ls.get(4))){
					bot(list.get(3));
				}
				if(text.equals(ls.get(13))){
					bot(list.get(4));
				}
				if(text.equals(ls.get(5))){
					bot(list.get(5));
				}

				if(text.equals(ls.get(6))){
					bot(list.get(6));
				}
				
				if(text.equals(ls.get(7))){
					bot(list.get(7));
				}
				if(text.equals(ls.get(12))){
					bot(list.get(8));
				}
				
				if(text.equals(ls.get(8))){
					bot(list.get(9));
				}
				if(text.equals(ls.get(9))){
					bot(list.get(10));
				}
				if(text.equals(ls.get(10))){
					int n1=2,n2=2;
					String s1=Integer.toString(n1);
					String s2=Integer.toString(n2);
					bot("Sum:"+(n1+n2));
				}
				if(text.equals(ls.get(11))){
					LocalDate date = LocalDate.now();
					String s3=date.toString();
					bot(s3);
				}
				if(text.equals(ls.get(14))){
					LocalTime time = LocalTime.now();
					String s4=time.toString();
					bot(s4);  
				}		
				if(text.equals(ls.get(15))){
					bot(list.get(11));
				}
				if(text.equals(ls.get(16))){
					Calendar calendar = Calendar.getInstance();
					 String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday",
										 "Thursday", "Friday", "Saturday" };
					 bot("Current day = " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
				}
				if(text.equals(ls.get(17))){
					bot(list.get(12));
				}
				if(text.equals(ls.get(18))){
					bot(list.get(13));
				}
				if(text.equals(ls.get(19))){
					bot(list.get(14));
				}
				if(text.equals(ls.get(20))){
					bot(list.get(15));
				}
				if(text.equals(ls.get(21))){
					bot(list.get(16));
				}
				if(text.equals(ls.get(22))){
					bot(list.get(17));
				}
				if(text.equals(ls.get(23))){
					bot(list.get(18));
				}
				if(text.equals(ls.get(24))){
					bot(list.get(19));
				}
				if(text.equals(ls.get(25))){
					bot(list.get(20));
				}
				if(text.equals(ls.get(26))){
					bot(list.get(21));
				}
				if(text.equals(ls.get(27))){
					bot(list.get(22));
				}
				if(text.equals(ls.get(28))){
					bot(list.get(23));
				}
				if(text.equals(ls.get(29))){
					bot(list.get(24));
				}
				if(text.equals(ls.get(30))){
					bot(list.get(25));
				}
			
			}
		});

	}

	private void bot(String s){
		Chatarea.append("ROBOT->"+s+"\n\n");
			
	}
	
	public static void main(String args[]){
		new Bot();
	}
}
