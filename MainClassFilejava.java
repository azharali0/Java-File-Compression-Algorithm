public class MainClassFilejava {

    public static void main(String[] args) {

        Huffman huffman = new Huffman("sdbjkfasvsdjk vsd,vjkbv");

        String encodedText = huffman.encode();
        System.out.println(encodedText);

        huffman.printCodes();

        String originalText = huffman.decode(encodedText);
        System.out.println(originalText);

    }

}