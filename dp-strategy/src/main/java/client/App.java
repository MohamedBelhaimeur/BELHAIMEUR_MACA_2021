package client;

import api.CompressionContext;
import api.CompressionStrategy;
import api.LZHCompressionStrategy;
import api.THSCompressionStrategy;

public class App {
    public static void main(String[] args) {
        String data = "Donnée à compresser";
        CompressionContext cc = new CompressionContext(new THSCompressionStrategy());

        String compressedData = cc.compress(data);
        System.out.println(compressedData);

        CompressionStrategy strategy = new LZHCompressionStrategy();
        cc.setCompressionStrategy(strategy);
        System.out.println(cc.compress(compressedData));
    }
}
