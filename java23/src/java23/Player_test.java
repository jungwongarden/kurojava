package java23;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.media.*;
import javax.media.protocol.*;
import java.io.*;

class player extends JFrame implements ActionListener, ControllerListener {
	private Container con;
	private JPanel contentPanel; // 영상이 나오게 될 패널
	private Component controlComponent; // 화면 컴포넌트
	private Component visualComponent; // 재생 컨트롤 컴포넌트
	private Player player;
	private JButton bt = new JButton("START");

	public player(String title) {
		super(title);
		init();
		start();
		this.setSize(600, 400);
		this.setVisible(true);

	}

	public void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());

		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(bt, BorderLayout.EAST);

		con.add(southPanel, BorderLayout.SOUTH);

	}

	/* Player를 만들고, 리스너를 등록한다. */
	public void makePlayer(String filePath) {
		MediaLocator locator = new MediaLocator(filePath);
		System.out.println(filePath);
		try {
			/* DataSource 생성 */
			DataSource dataSource = Manager.createDataSource(locator);

			/* 현재 동작중인 Player가 있다면 닫는다. */
			if (player != null) {
				player.close();
			}

			/* Player 생성 */
			player = Manager.createPlayer(dataSource);

			/* 리스너 등록 */
			player.addControllerListener(this);
		} catch (IOException e) {
			System.out.println(e);
		} catch (NoDataSourceException e) {
			System.out.println("DataSource를 만들 수 없습니다.");
		} catch (NoPlayerException e) {
			System.out.println("Player를 만들 수 없습니다.");
		}
	}

	/* Player의 상태변경 감지 */
	public synchronized void controllerUpdate(ControllerEvent e) {

		/* Player가 Realized 상태일 때 컴포넌트를 프레임에 추가한다. */
		if (e instanceof RealizeCompleteEvent) {
			contentPanel = new JPanel(new BorderLayout());

			/* 기본 조정 컴포넌트 */
			controlComponent = player.getControlPanelComponent();
			if (controlComponent != null) {
				contentPanel.add(controlComponent, BorderLayout.SOUTH);
			}

			/* Visual 컴포넌트 */
			visualComponent = player.getVisualComponent();
			if (visualComponent != null) {
				contentPanel.add(visualComponent, BorderLayout.CENTER);
			}

			/* 프레임에 컴포넌트 추가 */
			con.add(contentPanel);
			// setContentPane(contentPanel);
			pack();
		}

	}

	public void start() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		bt.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		/* 열기 선택 이벤트 처리 */
		if (e.getSource() == bt) {
			File f = new File("1.mp4");
			String filePath = "file:/" + f.getAbsolutePath();
			/* Player를 만들고, 재생시키다. */
			makePlayer(filePath);
			try {
				player.start();
			} catch (NullPointerException ee) {
			}

		}

	}

};

class Player_test {
	public static void main(String[] args) {
		player ppp = new player("test");
	}
}
