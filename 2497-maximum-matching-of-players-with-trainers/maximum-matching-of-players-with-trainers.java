class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int PlayersLength = players.length;
        int TrainersLength = trainers.length;
        int count=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i =0 , j=0;
         while (i < PlayersLength && j < TrainersLength) {
            if (players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}