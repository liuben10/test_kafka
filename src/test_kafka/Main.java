package test_kafka;

public class Main {
    public static void main(String[] args) {

        Producer.publishMessage("Hello World From App", "test_topic");

    }
}