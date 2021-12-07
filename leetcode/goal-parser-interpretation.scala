object Solution {
    def interpret(command: String): String = {
        command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al")
    }
}