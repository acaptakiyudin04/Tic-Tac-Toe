/** コンピュータプレーヤー．決まった順番で空きマスを探し，最初に見つかった空きマスを次の手にする． */
class SimplePlayer extends AbstractPlayer {

    /** コンストラクタ．引数は AbstractPlayer と同じ
	@param name プレーヤー名
	@param maruBatsu このプレーヤーがマルかバツか（ Ban.MARU また
	は Ban.BATSU ） */
	SimplePlayer(String name , int maruBatsu ){

		super(name , maruBatsu);

        }

    /** 次の手を返す．決まった順番で空きマスを探し，最初に見つかった空きマスを次の手にする．
	@param ban 盤
	@return 次の手（の座標） */

	 Zahyo next(Ban ban){

		if(ban.isBlank(1 , 1)==true) return new Zahyo (1,1);
		else if(ban.isBlank(0 , 0)==true) return new Zahyo (0,0);
		else if(ban.isBlank(0 , 2)==true) return new Zahyo (0,2);
		else if(ban.isBlank(2 , 0)==true) return new Zahyo (2,0);
		else if(ban.isBlank(2 , 2)==true) return new Zahyo (2,2);
		else if(ban.isBlank(0 , 1)==true) return new Zahyo (0,1);
		else if(ban.isBlank(1 , 0)==true) return new Zahyo (1,0);
		else if(ban.isBlank(1 , 2)==true) return new Zahyo (1,2);
		else  return new Zahyo (2,1);


	}
}
