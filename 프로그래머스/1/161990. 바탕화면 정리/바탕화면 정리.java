class Solution {
    public int[] solution(String[] wallpaper) {
        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        
        
        for(int x=0; x<wallpaper.length; x++){
            for(int y=0; y<wallpaper[x].length(); y++){
                if(wallpaper[x].charAt(y)=='#'){
                    xMax = Math.max(xMax, x);
                    yMax = Math.max(yMax, y);
                    xMin = Math.min(xMin, x);
                    yMin = Math.min(yMin, y);
                }
            }
        }
        return new int[]{xMin, yMin, xMax+1, yMax+1};
    }
}