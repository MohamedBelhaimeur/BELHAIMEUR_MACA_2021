package api;

public class LZHCompressionStrategy implements CompressionStrategy {
    @Override
    public String compress(String data) {
        return data + "LZHCompressionStrategy";
    }
}
