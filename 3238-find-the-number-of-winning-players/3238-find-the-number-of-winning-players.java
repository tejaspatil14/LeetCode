class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
           HashMap<Integer, Integer>[] playerColors = new HashMap[n];
        
        for (int i = 0; i < n; i++) {
            playerColors[i] = new HashMap<>();
        }
        
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            playerColors[player].put(color, playerColors[player].getOrDefault(color, 0) + 1);
        }
        
        int winningPlayers = 0;
        
        for (int i = 0; i < n; i++) {
            
            for (int count : playerColors[i].values()) {
                if (count >= (i + 1)) {
                    winningPlayers++;
                    break; 
                }
            }
        }
        
        return winningPlayers;
    }
}