import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Ban の派生クラス．Ban と同様に 3x3 の盤面の管理する．盤面を JPanel に表示する．マスの状態は
    GUI と int 型配列の両方に入っているので，両者が一致するように注意して作る． */
class GuiBan extends Ban {
    private GuiMasu[][] masu;
    private JPanel panel;

    /** 盤面を表示する JPanel オブジェクトを用意し，各マスに GuiMasu を並べる．
	@param listener マスボタン（ GuiMasu ）が押されたイベントのリスナー */
    GuiBan(ActionListener listener) {

		masu = new GuiMasu[3][3];
		panel = new JPanel();

		panel.setLayout(new GridLayout(3,3));

		for(int a=0; a<3; a++){
			for(int b=0; b<3; b++){
				Zahyo zahyo = new Zahyo (a,b);
				masu[a][b] = new GuiMasu(zahyo);
				panel.add(masu[a][b]);
				masu[a][b].addActionListener(listener);
				

							
			}


		}

		
	//
	// 課題7 （9 つの GuiMasu オブジェクトを生成し，それらを GuiMasu 配列に格納する．
	//        3x3 のグリッドレイアウトの panel を生成し，GuiMasu オブジェクトを panel に配置する．
	//        GuiMasu の ActionListener を listener にする）
    }
    
    /** Ban.put() と同様．JPanel 内の (x,y) ボタンの表示を更新する
	@return Ban.put() と同様 */
    boolean put(int x, int y, int maruBatsu) {
	//
	// 課題7 （親クラスの Ban.put を呼び出し，正常にマス (x,y) に置けたか確かめる．
	// 正常にマス (x,y) に置ければ，GUI のマス (x,y) の表示も更新する）

		if(super.put(x,y,maruBatsu)==true){

			if(maruBatsu ==1){
			
				masu[x][y].setText("O");
				return true;
			}
			else{
			
				masu[x][y].setText("X");
				return true;
			}

		}
		else return false;



    }

    /** 盤面を表示している JPanel オブジェクトを返す
	@return GUI パネル */
    JPanel getPanel() {
	return panel;
    }

    /** 盤面を表示する．表示先は内包する JPanel オブジェクト（すでに put() で表示を更新しているので何もしないでよい） */
    void display() {
    }
}
