import java.awt.event.*;

/** ウィンドウ上のボタンで次の手を入力する人間プレーヤー */
class GuiPlayer extends AbstractPlayer implements ActionListener {
    /** 次の手を actionPerformed から next に渡すために使う */
    private Zahyo te;

    /** 引数は AbstractPlayer と同じ
	@param name プレーヤー名
	@param maruBatsu このプレーヤーがマルかバツか（ Ban.MARU または Ban.BATSU ） */
    GuiPlayer(String name, int maruBatsu) {
	super(name, maruBatsu);
    }

    /** 次の手を返す．次の手は GuiMasu ボタンから得る．ボタンが押されるまで待つ．
	@param ban 盤
	@return 次の手（の座標） */
    synchronized Zahyo next(Ban ban) {

		while(true){
			try{
				wait();
			}
			catch(InterruptedException e){
			}

			return te;	
		}

	// 
	// 課題
	// 
	
    }

    /** ActionListener のメソッド．GuiMasu ボタンが押されたときに，このボタンのマスを次の手にして，next メソッドに渡す． */
    public synchronized void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof GuiMasu) {
	    GuiMasu m = (GuiMasu)e.getSource();


		te = m.getZahyo();
		

	

		
    this.notify();

	// 
	// 課題
	//
	   } 
    }
}

