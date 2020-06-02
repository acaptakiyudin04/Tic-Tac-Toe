/** 3x3 の盤面．盤にマルやバツを置く．盤面を標準出力に表示する．勝敗の判定を担う */
class Ban {
    /** 盤の大きさ（幅・高さ） */
    static final int N = 3;
    /** マルが置かれたマスの値．盤面の判定結果として，マルが勝ちの値 */
    static final int MARU = 1;
    /** バツが置かれたマスの値．盤面の判定結果として，バツが勝ちの値 */
    static final int BATSU = -1;
    /** 空きマスの値．判定結果として，勝敗はわからないことを示す値 */
    static final int AKI = 0;
    /** 盤のマス目の状態 */
    private int[][] masu;


 	Ban(){

 		masu = new int [N][N];
	}

	  boolean isBlank(int x , int y){
		if (masu[x][y] == 0 ){
			return true;
		}
		else{
			return false;
		}
	
	 }

	  int get(int x , int y){
		if (masu[x][y] == 1 ){
			return MARU;
		}
		if (masu[x][y] == -1 ){
			return BATSU;
		}
		else return AKI;

	  }


 	  boolean put(int x , int y , int maruBatsu){
		
		if(masu[x][y]==0){
			
			masu[x][y]= maruBatsu;
			return true;
		}
		else{
			return false;
		}


	 }

	 boolean isFull(){
		int a = 0;
		    for (int i = 0; i < N; i++){ // 縦方向
		
				for (int j = 0; j < N; j++){ // 横方向
			
					if(masu[i][j]==0){
						a++ ;
											


					}
				}
		
	    	   }
		if(a>0){
			return false;
		}
		else{

			return true;
		}
			
	}




     int checkWon() {
	int count_zero = 0;
	int count_batsu = 0;
	    for (int i = 0; i < N; i++){ // 縦方向
		if(masu[i][0]==1&&masu[i][1]==1&&masu[i][2]==1) return 1;
		if(masu[i][0]==-1&&masu[i][1]==-1&&masu[i][2]==-1) return -1;		

	    }
	   for (int j = 0; j < N; j++){ // 横方向
		if(masu[0][j]==1&&masu[1][j]==1&&masu[2][j]==1) return 1;
		if(masu[0][j]==-1&&masu[1][j]==-1&&masu[2][j]==-1) return -1;		

	   }
		if(masu[0][0]==1&&masu[1][1]==1&&masu[2][2]==1) return 1;
		if(masu[0][0]==-1&&masu[1][1]==-1&&masu[2][2]==-1) return -1;	
		if(masu[2][0]==1&&masu[1][1]==1&&masu[0][2]==1) return 1;	
		if(masu[2][0]==-1&&masu[1][1]==-1&&masu[0][2]==-1) return -1;	
		else return 0;	
		
	//
	// 課題2
	//
	
    }
     void display() {
	System.out.println("+---+");
	    for (int i = 0; i < N; i++){ // 縦方向
		System.out.print("|");
		for (int j = 0; j < N; j++){ // 横方向
			if(masu[i][j]==1){
				System.out.print("O");
			}
			else if(masu[i][j]==-1){
				System.out.print("X");
			}
			else if(masu[i][j]==0){
				System.out.print(" ");
			}
		}
		System.out.println("|");
	    }



	System.out.println("+---+");		

    }
    //
    // 課題3 （コンストラクタとメソッド）
    //
}
