package api;

public final class CompressionContext {
    private CompressionStrategy strategy;

    public CompressionContext() {
    }

    public CompressionContext(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public String compress(String data) {
        return this.strategy.compress(data);
    }
}
