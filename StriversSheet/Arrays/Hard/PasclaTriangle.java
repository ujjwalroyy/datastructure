package StriversSheet.Arrays.Hard;

public class PasclaTriangle {
    static int pascla(int r, int c){
        int element = nCr(r-1, c-1);
        return element;
    }
    static int nCr(int r, int c){
        int res = 1;
        for(int i = 0; i < c; i++){
            res = res * (r - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        int element = pascla(r, c);
        System.out.println(element);
    }
}
