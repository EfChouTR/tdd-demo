/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javademo;

public class App {
    private String greeting;

    public String getGreeting() {
        return this.greeting;
    }

    public void setGreeting(String msg) {
        this.greeting = msg;
    }

    App() {
        this.setGreeting("Hello World!");
    }

    App(String msg) {
        this.setGreeting(msg);
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
