/** プレーヤーの抽象クラス．SimplePlayer などは派生クラス */
abstract class AbstractPlayer {
    /* プレーヤー名 */
    private final  String name;
    /* 自分がマルかバツか */
    private final  int maruBatsu;

    /** コンストラクタ．
	@param name プレーヤー名
	@param maruBatsu このプレーヤーがマルかバツか（ Ban.MARU または Ban.BATSU ） */
	AbstractPlayer(String name , int maruBatsu ){

		this.name = name;
		this.maruBatsu = maruBatsu; 

        }

    /** プレーヤー名を返す
	@return プレーヤー名 */
	String getName(){
		return this.name;

	}

    /** プレーヤーのマル・バツを返す
	@return Ban.MARU か Ban.BATSU */
	int getMaruBatsu(){
		if(this.maruBatsu == Ban.MARU) return Ban.MARU;
		else return Ban.BATSU;

	}
    
    /** 次の手（マルやバツを置く座標）を返す抽象メソッド
	@param ban 盤
	@return 次の手の座標 */
	
	abstract Zahyo next(Ban ban);




}
