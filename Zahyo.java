/** 盤のマスを座標で表す．プレーヤーが次の手を返すときや，GUI 版でクリッ
    クされたマスの座標を表すために使う */
class Zahyo {
    /** 次の手を示す盤の X,Y 座標 */
    private final int x;
    private final int y;

    /** コンストラクタ．盤面の (x,y) マスを示すオブジェクトを生成する
	@param x このマスの y 座標
	@param y このマスの y 座標 */
 	Zahyo(int x , int y){

 		this.x = x;
		this.y = y;
	}

    /** x 座標を返す
	@return x 座標 */
	int getX(){

		return this.x ;

	}

    /** y 座標を返す
	@return y 座標 */

	int getY(){
		return this.y ;

	}


}
