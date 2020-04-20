package CodeChallenge3;

public class CC3 {

    public int Pairof2 (){
        int vector[]={5,9,-5,7,-5};
        int result=0;
        for(var i=0; i<vector.length;i++){
            System.out.println(vector[i]);
            for(var j=vector.length-1; j>0;j--){
                if(vector[i] + vector[j] == 0 && vector[i] != 0){
                    System.out.println(vector[j]);
                    vector[i]=0;
                    vector[j]=0;
                    result=+1;
                }
            }
        }
        return result;
    }

    public int Pairof3(){
        int vector[]={-1,-1,-1,2};
        int result = 0;
        for(var i=0;i<vector.length;i++){
            for(var j=vector.length-1;j>0;j--){
                for(var k=1;k<vector.length;k++){

                    if(vector[i] + vector[j] + vector[k] == 0 && vector[i] !=0 ){
                        vector[i]=0;
                        vector[j]=0;
                        vector[k]=0;
                        result=+1;
                    }
                }
            }
        }
        return result;
    }

}
