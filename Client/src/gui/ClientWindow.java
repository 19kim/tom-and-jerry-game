package gui;

import javax.swing.JFrame;

class ClientWindow extends JFrame{
    public SignUpScreen signUpScreen = null;
    public MakeRoomScreen makeRoomScreen = null;
    public WaitingRoom waitingRoom = null;
    
    public ClientWindow() {
        setTitle("frame test");
        
        signUpScreen = new SignUpScreen(this);
        makeRoomScreen = new MakeRoomScreen(this);
        waitingRoom = new WaitingRoom(this);
        
        add(signUpScreen);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1280,720);
        setVisible(true);    
	}
    
    // �г��� �����մϴ�.
    public void change(String panelName) {
        if(panelName.equals("signUpScreen")){
            getContentPane().removeAll();
            getContentPane().add(signUpScreen);
            revalidate();
            repaint();
        }
        if(panelName.equals("makeRoomScreen")){
            getContentPane().removeAll();
            getContentPane().add(makeRoomScreen);
            revalidate();
            repaint();
        }
        if(panelName.equals("waitingRoom")){
            getContentPane().removeAll();
            getContentPane().add(waitingRoom);
            revalidate();
            repaint();
        }
    }
    
    public static void main(String[] args) {
       ClientWindow win = new ClientWindow();
    }
}