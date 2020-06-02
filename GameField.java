/** 三目並べのゲームの進行役．盤面の状態とメッセージを標準出力に表示する */
class GameField {
    /** マルのプレーヤー */
    private final AbstractPlayer maru;
    /** バツのプレーヤー */
    private final AbstractPlayer batsu;
    /** 盤 */
    private final Ban ban;

    /** maru と batsu が ban を使ってゲームをする準備をする
	@param maru マルのプレーヤー
	@param batsu バツのプレーヤー
	@param ban 盤面 */
    GameField(AbstractPlayer maru, AbstractPlayer batsu, Ban ban) {
		this.maru = maru;
		this.batsu= batsu;
		this.ban = ban;


	//
	// 課題5
	//
    }

    /** 勝ち負けが決まるまでゲームを進行する */
    void play() {
	AbstractPlayer currentPlayer;
	Zahyo te;
	displayMsg("ゲームを開始しました");
	displayBan();
	currentPlayer = maru;
	while (! ban.isFull()) {

			te = currentPlayer.next(this.ban);
			int x =te.getX();
			int y =te.getY();
//System.out.println(x+" "+y);
				while(ban.isBlank(x,y)==false){
//System.out.println("re");
					te = currentPlayer.next(this.ban);
					 x = te.getX();
					 y = te.getY();
				}
			ban.put(te.getX(),te.getY(),currentPlayer.getMaruBatsu());

	    //
	    // 課題5 （プレーヤー maru と batsu に交互に次の手を尋ね，そのマスにマルやバツを置く）
	    //
	    displayMsg(String.format("%s が(%d,%d)に %s を置きました",
				     currentPlayer.getName(),
				     te.getX(), te.getY(),
				     currentPlayer.getMaruBatsu()==Ban.MARU ? "マル" : "バツ"));
	    displayBan();


		if(ban.checkWon()==1 || ban.checkWon()== -1){

			displayMsg(String.format("%sの勝ち",currentPlayer.getName()));
			break;

		}
		else if(currentPlayer == maru){
			 currentPlayer = batsu;
		}
		else{						
			currentPlayer = maru ;				

		} 
	
	    //
	    // 課題5 （勝敗が決まったら，勝ちプレーヤー名を表示して return する．決まっていなければ currentPlayer を次のプレーヤーに変更する）
	    //
	}

		if(ban.checkWon()==0){
			
			displayMsg(String.format("引き分け"));

		}
	//
	// 課題5 （引き分けのメッセージを標準出力に表示する）
	//
    }

    /** ban に依頼して，盤を標準出力に表示する */
    void displayBan() {
		ban.display();
	//
	// 課題5
	//
    }

    /** メッセージを標準出力に表示する
	@param msg 表示するメッセージ */
    void displayMsg(String msg) {
	System.out.println(msg);
    }
}
