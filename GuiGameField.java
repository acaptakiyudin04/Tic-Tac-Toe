import javax.swing.*;

/** 三目並べのゲームの進行役．盤面の状態とメッセージをウィンドウ上に表
    示する．GameFieldの派生クラス */
class GuiGameField extends GameField {
    /** メッセージ表示用ラベル */
    private JLabel label;

    /** maru と batsu が gBan を使ってゲームをする準備をする．メッセージ表示するときは label を使う
	@param maru マルのプレーヤー
	@param batsu バツのプレーヤー
	@param gBan 盤面
	@param label メッセージ表示用ラベル */
    GuiGameField(AbstractPlayer maru, AbstractPlayer batsu, GuiBan gBan, JLabel label) {
	super(maru,batsu,gBan);
	this.label=label;
	// 
	// 課題8
	// 
    }

    /** 盤を GUI （9 つのボタン）に表示するのは gBan.put ですでに済ま
	せているので，このメソッドは空のメソッドにすればよい */
    void displayBan() {

//		gBan.display();
	// 
	// 課題8
	// 
    }
    
    /** メッセージ（ msg ）をラベル（ label ）に表示する */
    void displayMsg(String msg) {
		label.setText(msg);
	// 
	// 課題8
	// 
    }

}
