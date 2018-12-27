package java39;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerA extends JFrame implements ActionListener {
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	InetAddress ip;
	int myPort = 5000;
	int yourPort = 6000;
	
	
	
	public MessengerA() throws Exception {
		setTitle("메신저 A 채팅 창");
		socket = new DatagramSocket(myPort);
		ip = InetAddress.getByName("127.0.0.1");
		
		list = new JTextArea(10, 30);
		input = new JTextField();
		
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		pack();
		
		list.setEditable(false);
		input.setBackground(Color.yellow);
		input.setForeground(Color.blue);
		list.setForeground(Color.red);
		input.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = input.getText();
		System.out.println("내가 입력>> " + text);
		list.append("내가 입력>> " + text + "\n");
		input.setText("");
		byte[] data = text.getBytes();
		DatagramPacket packet = 
				new DatagramPacket(data, data.length, ip, yourPort);
		try {
			socket.send(packet);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void process() throws Exception {
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket	packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			String s = new String(data);
			list.append("네가 입력>> " + s + "\n");
		}
	}

	public static void main(String[] args) throws Exception {
		MessengerA m = new MessengerA();
		m.process();
		
	}

}
