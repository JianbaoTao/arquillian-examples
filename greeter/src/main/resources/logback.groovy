appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{YYYY-MM-dd/HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
    }
}
root(INFO, ["STDOUT"])