package Enum;


public enum Gender {
    KAFKA_V2("application/vnd.kafka.v2+json"),
    KAFKA_V2_JSON("application/vnd.kafka.json.v2+json"),
    KAFKA_V1_JSON("application/vnd.kafka+json"),
    APPLICATION_JSON("application/json");

    public String data;

    Gender(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
