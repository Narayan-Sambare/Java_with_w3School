class RecentCounter {

    private int[] ping;
    private int start;
    private int end;
    public RecentCounter() {
        ping=new int [10000];
        start=0;
        end=0;
    }
    public int ping(int t) {

        ping[end]=t;
        end++;
        while(ping[start]<t-3000)
        {
            start++;
        }
        return end-start;
    }
}
