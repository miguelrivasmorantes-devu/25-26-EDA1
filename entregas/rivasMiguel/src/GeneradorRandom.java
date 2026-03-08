public class GeneradorRandom {
    private long seed;

    public GeneradorRandom() {
        seed = System.currentTimeMillis() % 2147483647;
    }

    public int nextInt(int max) {
        seed = (seed * 48271) % 2147483647;
        return (int)(seed % max);
    }

    public double nextDouble() {
        seed = (seed * 48271) % 2147483647;
        return (double)(seed % 10000) / 10000.0;
    }
}
