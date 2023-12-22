package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Game.Find_SMU;
import Game.RockPaperScissors;






class Panels extends JPanel 
{
	// 패널들을 담을 cardLayout로된 전체 패널 객체를 생성 //
	JPanel cards = new JPanel(new CardLayout());
	// 전체 패널 객체에 대한 메서드를 활용하기 위해 변수에 대입 //
	CardLayout deck = (CardLayout) cards.getLayout();
	
	public Panels () 
	{

	// panel1 레퍼런스 변수 page1 객체 생성 //
	panel1 page1 = new panel1();
	// 전체 패널에 page1 추가 //
	cards.add(page1, "panel1");
	// 자기 자신(객체)에 추가 //
	add(cards);
	
	panel2 page2 = new panel2();
	cards.add(page2, "page2");
	add(cards);
	
	panel3 page3 = new panel3();
	cards.add(page3, "page3");
	add(cards);
	
	panel4 page4 = new panel4();
	cards.add(page4, "page4");
	add(cards);
	
	panel5 page5 = new panel5();
	cards.add(page5, "page5");
	add(cards);
	
	panel6 page6 = new panel6();
	cards.add(page6, "page6");
	add(cards);
	
	panel7 page7 = new panel7();
	cards.add(page7, "page7");
	add(cards);
	
	panel8 page8 = new panel8();
	cards.add(page8, "page8");
	add(cards);
	
	panel9 page9 = new panel9();
	cards.add(page9, "page9");
	add(cards);
	
	panel_10 page10 = new panel_10();
	cards.add(page10, "page10");
	add(cards);
	
	panel_11 page11 = new panel_11();
	cards.add(page11, "page11");
	add(cards);
	
	panel_12 page12 = new panel_12();
	cards.add(page12, "page12");
	add(cards);

	Ending page13 = new Ending();
	cards.add(page13, "page13");
	add(cards);
	
	}
	class panel1 extends JPanel implements ActionListener  
	{
		
		
		public panel1() 
		{
			// 컴포넌트를 직접 배치하기 위해 null로 레이아웃 설정 //
			setLayout(null);
		    setBackground (Color.black);
		    // 패널 화면 크기 설정 //
			int width = 1320;
			int height = 750;
			setPreferredSize (new Dimension(width, height));
			
			// 자기 자신 패널(객체)에 컴포넌트들 부착//
		    ImageIcon graduation = new ImageIcon ("./src/image/Graduation.png");
		    JLabel Label2 = new JLabel (graduation);
		    Label2.setBounds(520, 2, 250, 250);
		    add(Label2);

		    JLabel label = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
		    		+ "<I>수뭉이의<br><I>졸업장을 찾아라");
		    label.setForeground(Color.white);
		    label.setBounds(240, 250, 900, 300);
		    label.setFont(new Font("모리스9",Font.BOLD,120));
			add(label);
		   
		    JButton next = new JButton("Game Start!");
		    next.addActionListener (this);	

			next.setPreferredSize(new Dimension(50, 50));
			next.setBounds(530, 550, 200, 50);
			next.setFont(new Font("모리스9",Font.BOLD,30));
			add(next);
				

		}
			// 사용자가 버튼을 누르면 next 메서드를 이용 다음 페이지로 이동 //
				public void actionPerformed (ActionEvent event) 	
				{
					deck.next(cards);	
					
				}
			

	}
	class panel2 extends JPanel implements ActionListener
	{
		public panel2 () 
		{
			 
			        setLayout(null);
			        
					setBackground (Color.black);
					JLabel label1 = new JLabel("<html>재밌고 힘들었던 학교 생활을 마친<br>"
							+ "<html>수뭉이는 드디어 졸업에 성공했다!!<br>"
							+ "<html>그런데 이게 웬걸?! 아무리 찾아봐도 졸업장이 보이지 않는다<br>"
							+ "<html>기억을 되듬어보던 수뭉이는 무언가 떠오른 듯 어딘가로 달려간다<br>"
							+ "<html>지금부터 수뭉이의 잃어버린 졸업장을 찾는 여행이 시작된다!!<br>");
					label1.setForeground(Color.white);
					label1.setFont(new Font("모리스9",Font.BOLD,35));
					label1.setBounds(50, -180, 1200, 700);
					add(label1);
					
					ImageIcon certification = new ImageIcon ("./src/image/certificate.png");
					JLabel Label2 = new JLabel (certification);
					Label2.setBounds(50, 200, 500, 500);
					add(Label2);
					
					ImageIcon find = new ImageIcon ("./src/image/find.png");
					JLabel Label3 = new JLabel (find);
					Label3.setBounds(750, 200, 500, 500);
					add(Label3);
				
					JButton next = new JButton("next");
					next.addActionListener (this);	

					next.setPreferredSize(new Dimension(50, 50));
					next.setBounds(530, 550, 200, 50);
					next.setFont(new Font("모리스9",Font.BOLD,30));
					
					add(next);
					
					
						
					
		}
		public void actionPerformed (ActionEvent event) 	
		{
			deck.next(cards);	
			
		}
	}
	
	class panel3 extends JPanel implements ActionListener
	{
		public panel3 () 
		{
			 
			        setLayout(null);
			        
					setBackground (Color.black);
					JLabel label1 = new JLabel("<html>[하이리온]: 뭐라고?! 졸업장을 잃어버렸다고?!<br>"
							+ "<html>[하이리온]: 흠.. 아 맞다! 저번에 니 졸업장 ???가 들고 갔었잖아<br>"
							+ "<html>[하이리온]: 설마 맨입으로 알려달라는 건 아니지?<br>"
							+ "<html>[하이리온]: 좋아 이번 게임을 클리어하면 ???를 알려주지 <br>"
							+ "<html>[하이리온]: 게임 시작이다 으르렁!!<br>");
					label1.setForeground(Color.white);
					label1.setFont(new Font("모리스9",Font.BOLD,35));
					label1.setBounds(50, -180, 1200, 700);
					add(label1);
					
					ImageIcon hilion = new ImageIcon ("./src/image/한양대 하이리온2.png");
					JLabel Label2 = new JLabel (hilion);
					Label2.setBounds(750, 200, 500, 500);
					add(Label2);
					
					JButton next = new JButton("next");
					next.addActionListener (this);	

					next.setPreferredSize(new Dimension(50, 50));
					next.setBounds(530, 550, 200, 50);
					next.setFont(new Font("모리스9",Font.BOLD,30));
					
					add(next);
					
					
						
					
		}
		public void actionPerformed (ActionEvent event) 	
		{
			deck.next(cards);	
			
		}
	}
	public class panel4 extends JPanel implements ActionListener  
	{
		/** 
		 * 가위바위보 게임  
		 */	
		protected RockPaperScissors game;
		/** 
		 * 타이머  
		 */	
		private   Timer timer;
		
		/** 
		 * 가위바위보 참여자   
		 */	
		protected int[] playerA;
		/** 
		 * 가위바위보 상대편   
		 */	
		protected int[] playerB;

		/** 
		 * 가위바위보 참여자의 선택 결과를 이미지로 표현    
		 */	
		protected JLabel imgPlayerA;
		/** 
		 * 가위바위보 상대편의 선택 결과를 이미지로 표현  
		 */	
		protected JLabel imgPlayerB;

		/** 
		 * 가위바위보 참여자와 상대편의 상태를 문자열로 표현      
		 */	
		protected JLabel strPlayer1;
		protected JLabel strPlayer2;

		/** 
		 * 가위바위보 버튼      
		 */	
		protected JButton[] button;	
		/** 
		 * 가위바위보 3가지, 미선택 1가지, 승패 2가지를 2차원 배열로 고려하여 총 8(=(3+1)*2)가지 경우의 이미지를 준비      
		 */	
		protected ImageIcon[][] image;
		
		/** 
		 * 가위바위보 기본 이미지 상수 
		 */	
		protected final int BASE = 0;
		/** 
		 * 가위바위보 이겼을 때 이미지 상수  
		 */	
		protected final int WIN = 1;
		/** 
		 * 가위바위보 대기중 물음표 이미지 상수   
		 */	
		protected final int QUESTIONMARK = 3;

		/**
		 * 가위바위보 GUI 패널 초기화 
		 */
		
		// 목숨 life 변수 //
		protected int life = 10;
		// 승리 win 변수 //
		protected int win = 0;
		// 목숨(남은 기회)을 나타내기 위해 //
		protected JLabel label3;
		// 승리 횟수를 나타내기 위해 //
		protected JLabel label4;
		
		
		public panel4() 
		{
			// 화면에 맞게 하기 위해 재배치 //
			setLayout(null);
		        
			setBackground (Color.black);
			// 가위바위보 게임 초기화 
			this.game = new RockPaperScissors();
			// 가위바위보 선택 후 잠깐 1초 쉬었다가 재시작할 수 있도록 타이머 설정  
			this.timer = new Timer( 1000, new TimerListener() );
			
			// 참여자와 상대편의 가위바위보 선택 결과 및 승패의 2가지 정보를 저장 
			this.playerA = new int[2];
			this.playerB = new int[2];
			this.playerA[0] = this.playerB[0] = game.SCISSORS;
			this.playerA[1] = this.playerB[1] = BASE;
			// 가위바위보 3가지, 미선택 1가지, 승패 2가지를 2차원 배열로 고려하여 총 8(=(3+1)*2)가지 경우의 이미지를 준비 
			final String imgPath = "./src/rockPaperScissors/image/";
			image = new ImageIcon[4][2];
			final String pathImgScissors = imgPath + "scissors.gif";
			final String pathImgRock = imgPath + "rock.gif";
			final String pathImgPaper = imgPath + "paper.gif";
			final String pathImgScissorsWin = imgPath + "scissors_win.gif";
			final String pathImgRockWin = imgPath + "rock_win.gif";
			final String pathImgPaperWin = imgPath + "paper_win.gif";
			final String pathImgQuestionmark = imgPath + "questionmark.gif";
			image[QUESTIONMARK][BASE] = new ImageIcon( new ImageIcon( pathImgQuestionmark ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[QUESTIONMARK][WIN] = new ImageIcon( new ImageIcon( pathImgQuestionmark ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.SCISSORS][BASE] = new ImageIcon( new ImageIcon( pathImgScissors ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.SCISSORS][WIN] = new ImageIcon( new ImageIcon( pathImgScissorsWin ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.ROCK][BASE] = new ImageIcon( new ImageIcon( pathImgRock ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.ROCK][WIN] = new ImageIcon( new ImageIcon( pathImgRockWin ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.PAPER][BASE] = new ImageIcon( new ImageIcon( pathImgPaper ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.PAPER][WIN] = new ImageIcon( new ImageIcon( pathImgPaperWin ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
				
			// 참여자와 상대편의 가위바위보 이미지 화면 초기화 
			strPlayer1 = new JLabel( "<html><br><br>[하이리온]", JLabel.CENTER );
			strPlayer2 = new JLabel( "<html><br><br>[수뭉이]", JLabel.CENTER );
			strPlayer1.setForeground(Color.white);
			strPlayer2.setForeground(Color.white);
			imgPlayerA = new JLabel( image[QUESTIONMARK][BASE] );
			imgPlayerB = new JLabel( image[QUESTIONMARK][BASE] );
			
		    imgPlayerB.setBounds(400, -90, 500, 500);
			strPlayer1.setBounds(400, 10, 500, 500);
			strPlayer2.setBounds(400, 30, 500, 500);
			imgPlayerA.setBounds(400, 180, 500, 500);
			add( imgPlayerB );
			add( strPlayer1 );
			add( strPlayer2 );
			add( imgPlayerA );

			// 가위바위보 입력 버튼 3개 초기화  
			button = new JButton[3];
			button[game.SCISSORS] = new JButton( new ImageIcon( image[game.SCISSORS][BASE].getImage().getScaledInstance( 50, 50, Image.SCALE_SMOOTH ) ) );
			button[game.SCISSORS].addActionListener( this ); 

			button[game.ROCK] = new JButton( new ImageIcon( image[game.ROCK][BASE].getImage().getScaledInstance( 50, 50, Image.SCALE_SMOOTH ) ) );
			button[game.ROCK].addActionListener( this ); 

			button[game.PAPER] = new JButton( new ImageIcon( image[game.PAPER][BASE].getImage().getScaledInstance( 50, 50, Image.SCALE_SMOOTH ) ) );
			button[game.PAPER].addActionListener( this ); 
			
			button[game.SCISSORS].setBounds(500, 550, 100, 70);
			button[game.ROCK].setBounds(600, 550, 100, 70);
			button[game.PAPER].setBounds(700, 550, 100, 70);
			
			add( button[game.SCISSORS] );
			add( button[game.ROCK] );
			add( button[game.PAPER] );
			
			JLabel label1 = new JLabel("<html>STAGE1: 가위바위보 게임<br><br>");
			label1.setForeground(Color.white);
			label1.setFont(new Font("모리스9",Font.BOLD,30));
			label1.setBounds(500, -300, 1200, 700);
			add(label1);
			
			JLabel label2 = new JLabel( "<html>게임 방법: 하이리온과 가위바위보를 해서 <br>"
					+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<html> &nbsp;&nbsp&nbsp;4번을 이기면 클리어!<br>"
					+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<html> &nbsp;&nbsp&nbsp;목숨은 총 10!<br>"
		         	+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
		          	+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
		        	+ "<html> &nbsp;&nbsp&nbsp;질 때마다 1씩 차감!<br>");
			label2.setForeground(Color.white);
			label2.setFont(new Font("모리스9",Font.BOLD,25));
			label2.setBounds(50, -250, 1200, 700);
			add(label2);
			
			// 남은 기회를 확인할 수 있게 텍스트 라벨 배치 //
			label4 = new JLabel("life: " + life );
			label4.setForeground(Color.white);
			label4.setFont(new Font("모리스9",Font.BOLD,50));
			label4.setBounds(1106, 10, 300, 100);
			add(label4);

			// 승리 횟수를 확인할 수 있게 텍스트 라벨 배치 //
			label3 = new JLabel("win: " + win );
			label3.setForeground(Color.white);
			label3.setFont(new Font("모리스9",Font.BOLD,50));
			label3.setBounds(1100, 60, 300, 100);
			add(label3);

			
			
		}

		/**
		 * 참여자가 버튼을 눌러서 선택한 가위바위보 결과를 int형 자료로 변환
		 * @param event 버튼을 눌러서 선택한 결과 
		 * @return 가위바위보 선택 결과 
		 */
		protected int selectRockPaperScissors( ActionEvent event )
		{
			if( event.getSource() == button[game.SCISSORS] ) 
				return game.SCISSORS;
			else if ( event.getSource() == button[game.ROCK] ) 
				return game.ROCK;
			else
				return game.PAPER;
		}
		
		/**
		 * 가위바위보 선택 결과를 분석하여 누가 이겼는지 표기
		 */
		protected void setGameResult() 
		{
			String result = game.judge( playerA[0], playerB[0] );
			if ( result.contains( "참여자가 이겼습니다" ) )
			{ 	// 사용자가 이길 경우 승리 횟수 업데이트// 
				win++;
				label3.setText("win: "+ win);
				playerA[1] = WIN;
				playerB[1] = BASE;
			} 
			else if ( result.contains( "상대편이 이겼습니다" ) )
			{ 			
				playerA[1] = BASE;
				playerB[1] = WIN;
			} 
			else
			{
				playerA[1] = BASE;
				playerB[1] = BASE;	
			}
		} 
			
		/**
		 * 참여자가 가위바위보를 선택시 상대편 선택과 비교하여 승패 결과를 제시하고 게임 상황 업데이트 
		 * @param event : 참여자의 가위바위보 선택 결과 
		 */
		public void actionPerformed( ActionEvent event )  
		{
			
			label4.setText("life: "+life);
			// 참여자가 먼저 가위바위보 내기 
			playerA[0] = selectRockPaperScissors( event );
			// 상대편도 임의로 가위바위보 내기 
			playerB[0] = game.selectRockPaperScissors();

			// 승패 결과를 GUI 화면에 업데이트 
			setGameResult();
			String result = game.judge( playerA[0], playerB[0] );
			if ( result.contains( "참여자가 이겼습니다" ) )
			{
				
			}
				
			else {
				// 사용자가 질 경우 목숨 1 차감
				life--;
				label4.setText("life: "+life);
			}
			imgPlayerA.setIcon( image[ playerA[0] ][ playerA[1] ] );
			imgPlayerB.setIcon( image[ playerB[0] ][ playerB[1] ] );	
			
			// 다음 판은 잠시 대기 
			button[0].setEnabled( false );
			button[1].setEnabled( false );
			button[2].setEnabled( false );
			timer.start();		
			
		}
		
		/**
		 * 타이머 클래스 
		 */
		private class TimerListener implements ActionListener 
		{
			
			/**
			 * 잠시 대기후 다음 판 허용 
			 */
			public void actionPerformed( ActionEvent event ) 
			{
				timer.stop();		
				imgPlayerB.setIcon( image[QUESTIONMARK][BASE] );
				button[0].setEnabled( true );
				button[1].setEnabled( true );
				button[2].setEnabled( true );
				
				// 승리 횟수 4이면 스테이지 클리어로 다음 페이지로 이동 //
				if (win == 4) 
				
					deck.next(cards);
					
				
				else if (life == 0) 
				{
					// 목숨(남은 기회) 0이면 전 페이지로 돌아가 다시 게임 진행 //
					deck.previous(cards);
					// 목숨, 승리 초기화 //
					life = 10;
					win = 0;
					// 사용자에게 알려주는 텍스트도 초기화 //
					label4.setText("life: "+ life);
					label3.setText("win: " + +win);
				}	
			
				
			}
		}
	}	
	
		class panel5 extends JPanel implements ActionListener
		{
			public panel5 () 
			{
				 
				        setLayout(null);
				        
						setBackground (Color.black);
						JLabel label1 = new JLabel("<html>[하이리온]: 으르렁!! 오 ~ 제법인데<br>"
								+ "<html>[하이리온]: 좋아 ???를 알려주지<br>"
								+ "<html>[하이리온]: ???은 '곰두리'다 그럼 난 운동하러 가볼게~<br>"
								+ "<html>하아리온은 곰두리가 졸업장을 가져갔다 말했다<br>"
								+ "<html>그렇다면 곰두리를 찾아가보자<br>");
						label1.setForeground(Color.white);
						label1.setFont(new Font("모리스9",Font.BOLD,35));
						label1.setBounds(50, -180, 1200, 700);
						add(label1);
						
						ImageIcon hilion2 = new ImageIcon ("./src/image/한양대 하이리온.png");
						JLabel Label2 = new JLabel (hilion2);
						Label2.setBounds(750, 200, 500, 500);
						add(Label2);
						
						JButton next = new JButton("next");
						next.addActionListener (this);	

						next.setPreferredSize(new Dimension(50, 50));
						next.setBounds(530, 550, 200, 50);
						next.setFont(new Font("모리스9",Font.BOLD,30));
						
						add(next);
						
						
							
						
			}
			public void actionPerformed (ActionEvent a) 	
			{
				deck.next(cards);	
				
			}
		}
		class panel6 extends JPanel implements ActionListener
		{
			public panel6 () 
			{
				 
				        setLayout(null);
				        
						setBackground (Color.black);
						JLabel label1 = new JLabel("<html>[곰두리]: 쩝쩝~ 아 맛있다!!<br>"
								+ "<html>[곰두리]: 수뭉아 하이! 무슨 일이야?<br>"
								+ "<html>[곰두리]: 뭐라고? 졸업장을 잃어버렸어?!<br>"
								+ "<html>[곰두리]: 아 맞다! 저번에 곧 졸업을 앞둔 ?가 가져가는 봤어<br>"
								+ "<html>[곰두리]: ?를 알려달라고? 수뭉아 나 목말라서 그러는데 음료수 사주면 알려줄게<br>"
						        + "<html>[곰두리]: 돈이 없다고? 그렇다면 나와 게임을 해서 이기면 알려주지 메롱~<br>"
								+ "<html>[곰두리]: 좋아 게임 시작이다! 쩝쩝~");
						label1.setForeground(Color.white);
						label1.setFont(new Font("모리스9",Font.BOLD,35));
						label1.setBounds(50, -180, 1200, 700);
						add(label1);
						
						ImageIcon hilion2 = new ImageIcon ("./src/image/강원대 곰두리.png");
						JLabel Label2 = new JLabel (hilion2);
						Label2.setBounds(750, 200, 500, 500);
						add(Label2);
						
						JButton next = new JButton("next");
						next.addActionListener (this);	

						next.setPreferredSize(new Dimension(50, 50));
						next.setBounds(530, 550, 200, 50);
						next.setFont(new Font("모리스9",Font.BOLD,30));
						
						add(next);
						
						
							
						
			}
			public void actionPerformed (ActionEvent a) 	
			{
				deck.next(cards);	
				
			}
		}
		/**
		 * 구슬찾기 패널 
		 * @author So Young Park
		 * @version 0.8
		 */
		public class panel7 extends JPanel implements ActionListener	
		{
			/** 
			 * 구슬찾기 참여자   
			 */	
			protected int player;
			/** 
			 * 구슬이 숨어 있는 위치
			 */	
			protected int ball;
			/** 
			 * 구슬찾기 버튼      
			 */	
			private JButton[] button;	
			/** 
			 * 타이머  
			 */	
			private Timer timer;
			/** 
			 * 구슬찾기 게임 상태를 문자열로 표현      
			 */	
			protected JLabel label;	
			/** 
			 * 구슬찾기 게임에서 컵 상태를 이미지로 표현     
			 */	
			private JLabel[] cup;	
			/** 
			 * 컵 이미지는 기본 컵, 구슬이 있는 컵, 구슬찾기에 실패한 컵의 3가지 경우를 준비      
			 */	
			private ImageIcon[] img;	
			/** 
			 * 기본 컵 이미지 번호  
			 */	
			private final int BASE = 0;
			/** 
			 * 구슬이 있는 컵 이미지 번호  
			 */	
			private final int BALL = 1;
			/** 
			 * 구슬찾기에 실패한 컵 이미지 번호 
			 */	
			private final int MISS = 2;
			// 목숨(남은 기회) life 변수 //
			private int life = 10;
			// 승리(클리어 조건) win 변수 // 
			private int win = 0;
			// 목숨, 승리를 사용자가 알 수 있도록 텍스트를 위한 라벨 선언 //
			private JLabel label3;
			private JLabel label4;

			/**
			 * 구슬찾기 GUI 패널 초기화 
			 */
			public panel7() 
			{
				setLayout(null);
			        
				setBackground (Color.black);
				
				JLabel label1 = new JLabel("<html>STAGE2: 구슬 찾기 게임<br><br>");
				label1.setForeground(Color.white);
				label1.setFont(new Font("모리스9",Font.BOLD,30));
				label1.setBounds(500, -300, 1200, 700);
				add(label1);
				
				JLabel label2 = new JLabel( "<html>게임 방법: 곰두리가 구슬을 숨겨 놓은 <br>"
						+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<html> &nbsp;&nbsp&nbsp;구슬이 담긴 컵 번호를 5번을 멎추면 클리어!<br>"
						+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<html> &nbsp;&nbsp&nbsp;목숨은 총 10!<br>"
			         	+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
			          	+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
			        	+ "<html> &nbsp;&nbsp&nbsp;못 맞출 때마다 1씩 차감!<br>");
				label2.setForeground(Color.white);
				label2.setFont(new Font("모리스9",Font.BOLD,25));
				label2.setBounds(50, -250, 1200, 700);
				add(label2);
				
				label4 = new JLabel("life: " + life );
				label4.setForeground(Color.white);
				label4.setFont(new Font("모리스9",Font.BOLD,50));
				label4.setBounds(1106, 10, 300, 100);
				add(label4);

				label3 = new JLabel("win: " + win );
				label3.setForeground(Color.white);
				label3.setFont(new Font("모리스9",Font.BOLD,50));
				label3.setBounds(1100, 60, 300, 100);
				add(label3);

				
				// 기본 컵, 구슬이 있는 컵, 구슬찾기에 실패한 컵의 3가지 경우의 이미지를 준비 
				img = new ImageIcon[3];
				final String imgPath = "./src/ThreeCupGame/image/";
				final String PathImgCup  = imgPath + "cup.jpg";
				final String PathImgBall = imgPath + "cup_ball.jpg";
				final String PathImgFail = imgPath + "cup_fail.jpg";		
				img[ BASE ] = new ImageIcon( new ImageIcon( PathImgCup  ).getImage().getScaledInstance( 200, 250, Image.SCALE_SMOOTH ) );
				img[ BALL ] = new ImageIcon( new ImageIcon( PathImgBall ).getImage().getScaledInstance( 200, 250, Image.SCALE_SMOOTH ) );
				img[ MISS ] = new ImageIcon( new ImageIcon( PathImgFail ).getImage().getScaledInstance( 200, 250, Image.SCALE_SMOOTH ) );

				// 컵 3개를 기본 이미지로 초기화 
				cup = new JLabel[3];
				cup[0] = new JLabel( img[ BASE ] );
				cup[1] = new JLabel( img[ BASE ] );
				cup[2] = new JLabel( img[ BASE ] );
				
				cup[0].setBounds(300, 200, 300, 300);
				cup[1].setBounds(505, 200, 300, 300);
				cup[2].setBounds(710, 200, 300, 300);
						
				add( cup[0] );
				add( cup[1] );
				add( cup[2] );

				// 컵 3개 입력 버튼 초기화  
				button = new JButton[3];
				button[0] = new JButton( "1");
				button[0].addActionListener( this ); 

				button[1] = new JButton( "2" );
				button[1].addActionListener( this ); 

				button[2] = new JButton( "3" );
				button[2].addActionListener( this ); 


				button[0].setBounds(350, 480, 200, 30);
				button[1].setBounds(555, 480, 200, 30);
				button[2].setBounds(760, 480, 200, 30);		
				add( button[0] );
				add( button[1] );
				add( button[2] );
	


				// 구슬찾기 선택 후 잠깐 1초 쉬었다가 재시작할 수 있도록 타이머 설정  
				this.timer = new Timer( 1000, new TimerListener() );
			}
			
			/**
			 * 참여자가 버튼을 눌러서 선택한 구슬찾기 결과를 int형 자료로 변환
			 * @param event 버튼을 눌러서 선택한 결과 
			 * @return 구슬찾기 선택 결과 
			 */
			protected int selectCup( ActionEvent event )
			{
				if( event.getSource() == button[0] ) 
					return 0;
				else if ( event.getSource() == button[1] ) 
					return 1;
				else
					return 2;
			}
			
			/**
			 * 구슬찾기 선택 및 승패 결과를 화면에 업데이트
			 */
			protected void showGameResult( int player, int ball ) 
			{
				cup[ ball ].setIcon( img[ BALL ] ); 
				if ( player != ball )
					cup[ player ].setIcon( img[ MISS ] ); 
				else {
					// 구슬이 담긴 컵을 맞출 경우 win 1 증가 //
					win++;
					// 사용자가 볼 수 있는 승리 텍스트 업데이트 // 
				    label3.setText("win: "+win);
				}
			} 
			
			/**
			 * 구슬찾기 게임 진행하기 
			 * @param event : 참여자의 구슬찾기 선택 결과 
			 */
			public void actionPerformed( ActionEvent event )  
			{
				
				// 컵 3개 중 하나에 임의로 구슬을 숨기기 
				this.ball = (int)( Math.random() * 3 );
				// 참여자는 구슬을 숨긴 컵을 맞추기 
				this.player = this.selectCup( event );
				// 승패 결과를 GUI 화면에 업데이트 
				showGameResult( this.player, this.ball );
				if ( player != ball ) {
					life--;
					label4.setText("life: "+life);
				}
					
				else {
					
					
				}
				
				// 다음 판은 잠시 대기 
				timer.start();		
				button[0].setEnabled( false );
				button[1].setEnabled( false );
				button[2].setEnabled( false );
			}	
			
			/**
			 * 타이머 클래스 
			 */
			private class TimerListener implements ActionListener
			{
				/**
				 * 잠시 대기후 다음 판 허용 
				 */
				public void actionPerformed( ActionEvent event ) 
				{
					
					timer.stop();			
					// 컵에 구슬 숨기고 구슬찾기 선택 허용
					cup[0].setIcon( img[ BASE ] ); 
					cup[1].setIcon( img[ BASE ] ); 
					cup[2].setIcon( img[ BASE ] ); 	
					button[0].setEnabled( true );
					button[1].setEnabled( true );
					button[2].setEnabled( true );
					
					// 사용자가 5번 맞출 경우 클리어 조건을 달성했으므로 다음 페이지로 이동 //
					if (win == 5) 
						deck.next(cards);
					
					else if (life == 0) 
					{
						// 목숨(남은 기회)가 0이 될 경우 전 페이지로 돌아가 다시 게임 시작 //
						deck.previous(cards);
						// 목숨, 승리 횟수 초기화 //
						life = 10;
						win = 0;
						// 목숨, 승리 나타내는 텍스트 초기화 //
						label4.setText("life: "+ life);
						label3.setText("win: " + +win);
					}
				}
			}
		}
		class panel8 extends JPanel implements ActionListener
		{
			public panel8 () 
			{
				 
				        setLayout(null);
				        
						setBackground (Color.black);
						JLabel label1 = new JLabel("<html>[곰두리]: 역시 훌륭하군!<br>"
								+ "<html>[곰두리]: 게임에 이겼으니 ?를 알려주지<br>"
								+ "<html>[곰두리]: ?은 '쿠'다 난 진정한 아티스트가 되기 위해 떠나지 이만!<br>"
								+ "<html>곰두리는 쿠가 졸업장을 가져갔다 말했다 <br>"
								+ "<html>그렇다면 쿠를 찾아가보자<br>");
						label1.setForeground(Color.white);
						label1.setFont(new Font("모리스9",Font.BOLD,35));
						label1.setBounds(50, -180, 1200, 700);
						add(label1);
						
						ImageIcon hilion2 = new ImageIcon ("./src/image/강원대 곰두리2.png");
						JLabel Label2 = new JLabel (hilion2);
						Label2.setBounds(750, 200, 500, 500);
						add(Label2);
						
						JButton next = new JButton("next");
						next.addActionListener (this);	

						next.setPreferredSize(new Dimension(50, 50));
						next.setBounds(530, 550, 200, 50);
						next.setFont(new Font("모리스9",Font.BOLD,30));
						
						add(next);
						
						
							
						
			}
			public void actionPerformed (ActionEvent a) 	
			{
				deck.next(cards);	
				
			}
		}
			class panel9 extends JPanel implements ActionListener
			{
				public panel9 () 
				{
					 
					        setLayout(null);
					        
							setBackground (Color.black);
							JLabel label1 = new JLabel("<html>[쿠]: 음메~ 드디어 졸업이다 야호!<br>"
									+ "<html>[쿠]: 오! 수뭉쿤 반가워~ 무슨 일이야?<br>"
									+ "<html>[쿠]: 아 졸업증 내가 저번에 모르고 갖고 가버렸어 미안..<br>"
									+ "<html>[쿠]: 졸업증은 상명대 공학관 ????에 있어 <br>"
									+ "<html>[쿠]: 알았어 ????을 알려줄게 대신 내 부탁 하나만 들어줄 수 있을까?<br>"
									+ "<html>[쿠]: 내가 자바를 이용해서 만든 게임인데 한 번만 해주라 제발 부탁이야 <br>"
									+ "<html>[쿠]: 고마워 수뭉쿤 그럼 게임 시작이다! 음메~ <br>");
							label1.setForeground(Color.white);
							label1.setFont(new Font("모리스9",Font.BOLD,35));
							label1.setBounds(50, -180, 1200, 700);
							add(label1);
							
							ImageIcon hilion2 = new ImageIcon ("./src/image/건국대 쿠.png");
							JLabel Label2 = new JLabel (hilion2);
							Label2.setBounds(750, 200, 500, 500);
							add(Label2);
							
							JButton next = new JButton("next");
							next.addActionListener (this);	

							next.setPreferredSize(new Dimension(50, 50));
							next.setBounds(530, 550, 200, 50);
							next.setFont(new Font("모리스9",Font.BOLD,30));
							
							add(next);
							
							
								
							
				}
				public void actionPerformed (ActionEvent a) 	
				{
					deck.next(cards);	
					
				}
		}
			class panel_10 extends JPanel implements ActionListener { 
				// 슬롯 머신 게임 패널 //
				
				// 숫자들을 담을 라벨 배열 //
				   private JLabel[] Labels; 
				   
				// 슬롯 머신을 멈추고 돌릴 버튼 //
				   private JButton button; 
				   
				// 숫자들을 정수 배열로 //
				   private int[] Numbers; 
				// 슬롯 머신을 멈추고 돌릴 때 쓰이는 타이머 //
				   private Timer timer;
				// 결과 값 나타내는 라벨 //   
				   private JLabel result;
				// 목숨 나타낼 라벨 //
				   private JLabel label3; 
				// 슬리 나타낼 라벨 //
				   private JLabel label4; 
			   // 목숨 
				   int life = 10;
			   // 버튼 누르는 카운트
				   int count = 0;
			   // 승리
				   int win = 0;
				    
				   public panel_10() { 
					   
				      setLayout(null);
				      setBackground (Color.black);
				      
					  
					  JLabel label1 = new JLabel("<html>STAGE3: 슬롯 머신 게임<br><br>");
					  label1.setForeground(Color.white);
					  label1.setFont(new Font("모리스9",Font.BOLD,30));
					  label1.setBounds(500, -300, 1200, 700);
					  add(label1);
					  
					  JLabel label2 = new JLabel( "<html>게임 방법: 쿠가 발명한 슬롯 머신 게임! <br>"
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;계속해서 숫자가 바뀌는 슬롯 머신을 멈춰서<br>"
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;다음의 조합을 6번을 만들면 클리어!<br>"
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;(단, Jackpot의 경우 바로 클리어!)<br>"
								
                                + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp&nbsp;목숨은 총 10!<br>"
                                
	                            + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	                            + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp&nbsp;질 때마다 1씩 차감!<br><br><br><br><br>"
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Combination List<br>"
								
                                + "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp&nbsp;Jackpot: 숫자가 777인 경우<br>"

								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;One pair: 숫자가 한 쌍이 같은 경우<br>"
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Straight: 숫자가 차례로 이어지는 경우<br>" 
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Reverse: 숫자가 반대로 이어지는 경우<br>" 
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Trips: 3개의 숫자가 모두 같은 경우<br>" 
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Odd nums: 숫자가 모두 홀수인 경우<br>" 
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Even nums: 숫자가 모두 짝수인 경우<br>" 
								+ "");
						label2.setForeground(Color.white);
						label2.setFont(new Font("모리스9",Font.BOLD,20));
						label2.setBounds(30, -75, 1200, 700);
						add(label2);
						
						label4 = new JLabel("life: " + life );
						label4.setForeground(Color.white);
						label4.setFont(new Font("모리스9",Font.BOLD,50));
						label4.setBounds(1106, 10, 300, 100);
						add(label4);

						label3 = new JLabel("win: " + win );
						label3.setForeground(Color.white);
						label3.setFont(new Font("모리스9",Font.BOLD,50));
						label3.setBounds(1100, 60, 300, 100);
						add(label3);

					// 3자리 숫자를 텍스토 나타낼 라벨 베열 
				      Labels = new JLabel[3]; 
				    // 3자리 숫자 배열
				      Numbers = new int[3];
				   
				      
                    // 3자리 숫자 초기화 및 배치 //
				      for (int i = 0; i < 3; i++) { 
				         Labels[i] = new JLabel("" + Numbers[i]); 
				         Labels[i].setForeground(Color.white);
				         Labels[i].setFont(new Font("모리스9",Font.BOLD,180));
						 Labels[i].setBounds((i*100)+500, 100, 200, 200);

				        add(Labels[i]);

				       }
				      
				      
				     
				      // stop 버튼을 누를 때까지 숫자가 바뀌는 시간 변수
				       timer = new Timer( 100, new TimerListener() );
				      // 계속해서 숫자 변경
				       timer.start();

                     // stop 버튼
				      button = new JButton("Stop"); 
				      button.setFont(new Font("모리스9",Font.BOLD,50));
				      button.setBounds(510, 550, 300, 60);

				     add(button);
                      
				     // 버튼 눌렀을 때 이벤트 발생
				      button.addActionListener(this); 
				      
				      // 멈췄을 때 결과
				        result = new JLabel("Combination", JLabel.CENTER);
				        result.setForeground(Color.white);
				        result.setFont(new Font("모리스9",Font.BOLD,70));
				        result.setBounds(410, 350, 500, 200);
						add(result);
						
						
				    
				   }



				   public void actionPerformed(ActionEvent event) { 
					   // 버튼 누르는 횟수 
					   count++;
					  
						if (count %2 != 0) 
						{
							
						   // 숫자 변경 멈추기
						   timer.stop();
						   // 버튼 텍스트를 다시 돌아갈 수 있게 spin!으로 업데이트
					       button.setText("Spin!");
					       
					       // Jackpot: 777의 경우
					       if ( ( Numbers[0] == 7  ) &&
						    		( Numbers[1] == 7 ) &&
						    		( Numbers[2] == 7 ))
						       {
						    	   result.setText("Jackpot");
						    	   // 승리 +1
						    	   win = 6;
						    	   // 텍스트 업데이트
						    	   label3.setText("win: " + +win);
						    	   // 승리(클리어 조건) 5가 되면 다음 페이지로 이동
						    	   if (win == 6) 
										deck.next(cards);
						    	   
						       }
					       
					       // Trips: 자리 숫자가 모두 같은 경우
					       else if ( ( Numbers[0] == Numbers[1]  ) &&
						    		( Numbers[1] == Numbers[2] ) )
						       {
						    	   result.setText("Trips");
						    	   // 승리 +1
						    	   win++;
						    	   // 텍스트 업데이트
						    	   label3.setText("win: " + +win);
						    	   // 승리(클리어 조건) 5가 되면 다음 페이지로 이동
						    	   if (win == 6) 
										deck.next(cards);
						    	   
						       }
					      
					      // one pair: 숫자가 한 쌍이 같은 경우
					       else if ( ( Numbers[0] == Numbers[1] ) ||
					    		( Numbers[1] == Numbers[2] ) ||  
					    		( Numbers[0] == Numbers[2] ) ) 
					       {
					    	   result.setText("one pair");
					    	   win++;
					    	   label3.setText("win: " + +win);
					    	   if (win == 6) 
									deck.next(cards);
					        	
					       }
					       // Straight: 숫자가 차례로 이어지는 경우
					       else  if ( ( Numbers[0] + 1 == Numbers[1]  ) &&
						    		( Numbers[1] + 1 == Numbers[2] ) )
						       {
						    	   result.setText("Straight");
						    	   win++;
						    	   label3.setText("win: " + +win);
						    	   if (win == 6) 
										deck.next(cards);
						       }
					       // Reverse: 숫자가 반대로 이어지는 경우
					       else  if ( ( Numbers[2] + 1 == Numbers[1]  ) &&
						    		( Numbers[1] + 1 == Numbers[0] ) )
						       {
						    	   result.setText("Reverse");
						    	   win++;
						    	   label3.setText("win: " + +win);
						    	   if (win == 6) 
										deck.next(cards);
						       }
					      // Odd nums: 숫자가 모두 홀수
					       else if ( ( Numbers[0] % 2 != 0 ) &&
						    		( Numbers[1] % 2 != 0 ) &&
						    		( Numbers[2] % 2 != 0 ) ) 
						       {
						    	   result.setText("Odd nums");
						    	   win++;
						    	   label3.setText("win: " + +win);
						    	   if (win == 6) 
										deck.next(cards);
						       }
					       // Even nums: 숫자가 모두 짝수
					       else if ( ( Numbers[0] % 2 == 0 ) &&
						    		( Numbers[1] % 2 == 0 ) &&
						    		( Numbers[2] % 2 == 0 ) ) 
						       {
						    	   result.setText("Even nums");
						    	   win++;
						    	   label3.setText("win: " + +win);
						    	   if (win == 6) 
										deck.next(cards);
						       }
					      // Miss: 조합을 성공시키지 못한 경우
					       else
					       {
					    	   
					    	   // 목숨(남은 기회) 1차감
							   life--;
							   // 텍스트 업데이트
							   label4.setText("life: "+ life);
					    	  
					    	   result.setText("Miss");
					    	   
					    	  // 목숨(남은 기회) 0일 경우
					    	   if (life == 0) 
								{
						    	   // 전 페이지로 돌아가기
									deck.previous(cards);
									// 목숨, 승리 초기화
									life = 10;
									win = 0;
									
									label4.setText("life: "+ life);
									label3.setText("win: " + +win);
								}
					    	
					       }
					       
					   }
					
					   else
					   {
					   
					   // 숫자 계속해서 변경되게 타이머 스타트
					   timer.start();
					   // 버튼 숫자 멈추게 Stop!으로 업데이트
					   button.setText("Stop!");
					   // 조합 결과 텍스트 초기화
					   result.setText("Combination");
					   }
				      
				   } 
				   private class TimerListener implements ActionListener 
					{
						public void actionPerformed( ActionEvent event ) 
						{
							
							// 숫자가 계속해서 랜덤으로 변경
							   
								
							for (int i = 0; i < 3; i++) { 
						         Numbers[i] = (int) (Math.random() * 10);

						         Labels[i].setText(""+Numbers[i]);
						         
						         }
							
							
							
							
						}
					}
				}


			
			class panel_11 extends JPanel implements ActionListener
			{
				public panel_11 () 
				{
					 
					        setLayout(null);
					        
							setBackground (Color.black);
							JLabel label1 = new JLabel("<html>[쿠]: 대단해 수뭉쿤!! 음메~<br>"
									+ "<html>[쿠]: 내 게임을 해줬으니 ????를 알려줄게<br>"
									+ "<html>[쿠]: ????는 G418이야 나 오늘 졸업식 있어서 이만 가볼게 사요나라~<br>"
									+ "<html>쿠는 졸업증이 상명대 공학관 G418에 있다고 하였다<br>"
									+ "<html>지금 당장 달려가보자!<br>");
							label1.setForeground(Color.white);
							label1.setFont(new Font("모리스9",Font.BOLD,35));
							label1.setBounds(50, -180, 1200, 700);
							add(label1);
							
							ImageIcon hilion2 = new ImageIcon ("./src/image/건국대 쿠2.png");
							JLabel Label2 = new JLabel (hilion2);
							Label2.setBounds(750, 200, 500, 500);
							add(Label2);
							
							JButton next = new JButton("next");
							next.addActionListener (this);	

							next.setPreferredSize(new Dimension(50, 50));
							next.setBounds(530, 550, 200, 50);
							next.setFont(new Font("모리스9",Font.BOLD,30));
							
							add(next);
							
							
								
							
				}
				public void actionPerformed (ActionEvent a) 	
				{
					deck.next(cards);	
					
				}
			}
				class panel_12 extends JPanel implements ActionListener
				{
					public panel_12 () 
					{
						 
						        setLayout(null);
						        
								setBackground (Color.black);
								JLabel label1 = new JLabel("<html>G418에 달려가 수뭉이는 이곳저곳을 살폈다<br>"
										+ "<html>그러다 칠판 밑에 빛나는 무언가를 발견하게 되었다<br>"
										+ "<html>드디어 수뭉이는 고된 여정 끝에 잃어버린 졸업증을 찾게 되었다!!!!<br>");
								label1.setForeground(Color.white);
								label1.setFont(new Font("모리스9",Font.BOLD,35));
								label1.setBounds(50, -180, 1200, 700);
								add(label1);
								
								
								ImageIcon certification = new ImageIcon ("./src/image/certificate.png");
								JLabel Label3 = new JLabel (certification);
								Label3.setBounds(50, 150, 500, 500);
								add(Label3);
								
								ImageIcon sparkle = new ImageIcon ("./src/image/sparkling.png");
								JLabel Label4 = new JLabel (sparkle);
								Label4.setBounds(200, 290, 100, 100);
								add(Label4);
								
								JLabel Label5 = new JLabel (sparkle);
								Label5.setBounds(338, 430, 100, 100);
								add(Label5);
								
								ImageIcon glad = new ImageIcon ("./src/image/glad.png");
								JLabel Label6 = new JLabel (glad);
								Label6.setBounds(700, 170, 500, 500);
								add(Label6);
								
								JButton next = new JButton("next");
								next.addActionListener (this);	

								next.setPreferredSize(new Dimension(50, 50));
								next.setBounds(530, 550, 200, 50);
								next.setFont(new Font("모리스9",Font.BOLD,30));
								
								add(next);
								
								
									
								
					}
					public void actionPerformed (ActionEvent a) 	
					{
						deck.next(cards);	
						
					}
		}
				
	
	
}



	



