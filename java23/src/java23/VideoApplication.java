package java23;

import  java.awt.*;
import  java.awt.event.*;
import  java.io.*;
import  java.net.*;
import  javax.swing.*;
import  javax.media.*;

public  class  VideoApplication  extends  JFrame  {
        private  Player  player;  //  자바  미디어  재생기

        private  Component  visualMedia;  //  시각적  내용  컴포넌트

        private  Component  mediaControl;  //  미디어를  위한  컴포넌트  제어

        private  Container  container;  //  주  컨체이너

        private  File  mediaFile;  //  미디어  파일과  미디어  위치

        private  URL  fileURL;

        public  VideoApplication()  {  //  생성자
                super("Video  Application  player");
                container  =  getContentPane();
                JMenu  fileMenu  =  new  JMenu("File");  //  메뉴  생성
                fileMenu.setMnemonic('F');
                container.add(fileMenu,  BorderLayout.NORTH);
                //  메뉴의  Open  File  클릭
                JMenuItem  openItem  =  new  JMenuItem("Open  File");  //  파일  열기
                openItem.setMnemonic('O');
                openItem.addActionListener(new  ActionListener()  {
                        public  void  actionPerformed(ActionEvent  event)  {
                                mediaFile  =  getFile();  //  getFile  메소드  실행
                                if  (mediaFile  !=  null)  {
                                        try  {
                                                fileURL  =  mediaFile.toURL();
                                        }  catch  (MalformedURLException  badURL)  {
                                                badURL.printStackTrace();
                                                showErrorMessage("Bad  URL");
                                        }
                                        makePlayer(fileURL.toString());
                                }
                        }
                });
                //  파일  열기

                fileMenu.add(openItem);
                JMenuItem  openURLItem  =  new  JMenuItem("Open  Locator");  //  URL  이용  재생
                openURLItem.setMnemonic('L');
                openURLItem.addActionListener(new  ActionListener()  {
                        public  void  actionPerformed(ActionEvent  event)  {
                                String  addressName  =  getMediaLocation();
                                if  (addressName  !=  null)  {
                                        makePlayer(addressName);
                                }
                        }
                });
                fileMenu.add(openURLItem);
                JMenuItem  exitItem  =  new  JMenuItem("Exit");  //  종료
                exitItem.setMnemonic('x');
                exitItem.addActionListener(new  ActionListener()  {
                        public  void  actionPerformed(ActionEvent  event)  {
                                System.exit(0);
                        }
                });
                fileMenu.add(exitItem);
                JMenuBar  bar  =  new  JMenuBar();
                setJMenuBar(bar);
                bar.add(fileMenu);
                Manager.setHint(Manager.LIGHTWEIGHT_RENDERER,  Boolean.TRUE);
        }

        public  void  showErrorMessage(String  error)  {  //  팝업  에러  메시지
                JOptionPane.showMessageDialog(this,  error,  "Error",
                                JOptionPane.ERROR_MESSAGE);
        }

        //  사용자가  로컬  컴퓨터에서  미디어  클립을  선택하게  한다
        public  File  getFile()  {  //  컴퓨터로부터  파일을  얻음
                JFileChooser  fileChooser  =  new  JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int  result  =  fileChooser.showOpenDialog(this);
                if  (result  ==  JFileChooser.CANCEL_OPTION)  {
                        return  null;
                }  else  {
                        return  fileChooser.getSelectedFile();
                }
        }

        public  String  getMediaLocation()  {  //  사용자  입력으로  비디오  위치
                String  input  =  JOptionPane.showInputDialog(this,  "Enter  URL");
                if  (input  !=  null  &&  input.length()  ==  0)  {
                        return  null;
                }
                return  input;
        }

        //  클립의  Player를  생성하기  위해  필요한  준비  작업을  수행
        public  void  makePlayer(String  mediaLocation)  {  //  위치에  따른  플레이어  생성
                if  (player  !=  null)  {
                        removePlayerComponents();
                }
                MediaLocator  mediaLocator  =  new  MediaLocator(mediaLocation);
                if  (mediaLocator  ==  null)  {
                        showErrorMessage("Error  opening  file");
                        return;
                }
                try  {
                        player  =  Manager.createPlayer(mediaLocator);
                        //  createPlayer()  를  호출함으로써새로운  Player메소드를  초기화  한다.
                        //  createPlayer()  는  정해진  미디어  소스를  열고  그에  적합한  Player를  결정한다.
                        player.addControllerListener(new  PlayerEventHandler());
                        player.realize();
                }  //  연결문제시  IOException
                catch  (NoPlayerException  noPlayerException)  {
                        noPlayerException.printStackTrace();
                }  catch  (IOException  ioException)  {
                        ioException.printStackTrace();
                }
        }

        //  새로운  Player를  생성하기  전에  이전  Player의  시각  콤포넌트와  GUI  컨트롤을  프레임에서  제거한다
        public  void  removePlayerComponents()  {  //  플레이어  자원  반환,  미디어/컨트롤  초기화
                if  (visualMedia  !=  null)  {
                        container.remove(visualMedia);
                }
                if  (mediaControl  !=  null)  {
                        container.remove(mediaControl);
                }
                //  모든  플레이어의  활동  중지,  이전의  Player들이  지니고  있던  시스템  자원을  반환한다.
                player.close();
        }

        public  void  getMediaComponents()  {  //  시각  미디어와  플레이어  컨트롤  얻음
                visualMedia  =  player.getVisualComponent();
                if  (visualMedia  !=  null)  {
                        container.add(visualMedia,  BorderLayout.CENTER);
                }
                mediaControl  =  player.getControlPanelComponent();
                if  (mediaControl  !=  null)  {
                        container.add(mediaControl,  BorderLayout.SOUTH);
                }
        }

        private  class  PlayerEventHandler  extends  ControllerAdapter  {  //  핸들러
                public  void  realizeComplete(RealizeCompleteEvent  realizeDoneEvent)  {
                        player.prefetch();
                }

                public  void  prefetchComplete(  //  pretetching  후  재생작업  시작
                                PrefetchCompleteEvent  prefetchDoneEvent)  {
                        getMediaComponents();
                        validate();
                        player.start();
                }

                public  void  endOfMedia(EndOfMediaEvent  mediaEndEvent)  {
                        player.setMediaTime(new  Time(0));
                        player.stop();
                }
        }

        public  static  void  main(String  args[])  {
                VideoApplication  testPlayer  =  new  VideoApplication();
                testPlayer.setSize(400,  400);
                testPlayer.setLocation(400,  400);
                testPlayer.setDefaultCloseOperation(EXIT_ON_CLOSE);
                testPlayer.setVisible(true);
        }
}

