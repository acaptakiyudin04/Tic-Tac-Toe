import javax.swing.*;

/** 盤面の一マス．座標とそのマスのマル・バツの表示情報を持つ．JButton の派生クラス */
class GuiMasu extends JButton {
    /** ボタンの座標 */
    private final Zahyo zahyo;

    /** 座標が zahyo のマスを表すボタン
	@param zahyo マスの座標 */
    GuiMasu(Zahyo zahyo) {
	this.zahyo = zahyo;
    }

    /** ボタンの座標（Zahyoオブジェクト）を返す
	@return ボタンの座標 */
    Zahyo getZahyo() {
	return zahyo;
    }
}
