import java.awt.*;
import javax.swing.*;

/** GUI 版三目並べアプリケーションのメインウィンドウ */
class SanmokuGui extends JFrame {
    /** GUI 版三目並べアプリケーションのメインウィンドウ */
    public SanmokuGui() {
	GuiPlayer guiPlayer = new GuiPlayer("あなた", Ban.MARU);
        JLabel label = new JLabel("メッセージ");
        GuiBan gBan = new GuiBan(guiPlayer);
	
        this.setTitle("TicTacToe");
        this.setBounds(100, 150, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label, BorderLayout.NORTH);
        this.add(gBan.getPanel(), BorderLayout.CENTER);
        this.setVisible(true);



	SimplePlayer p2 = new SimplePlayer("コンピュータ",Ban.BATSU);
        GuiGameField gf = new GuiGameField(guiPlayer, p2, gBan,label);
          gf.play();

	

	// 
	// 課題8
	// 
    }
    
    public static void main(String[] args) {
        new SanmokuGui();
    }
}
