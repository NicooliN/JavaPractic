package interviewer.patterns;

/*
Реализуйте синглтон с использованием ленивой инициализации и двойных проверок блокировки (double-checked locking).
 */
public class SingletonPtr {
    private static volatile SingletonPtr instance;

    private SingletonPtr() {}

    public static SingletonPtr getInstance() {
        if (instance == null) {
            synchronized (SingletonPtr.class) {
                if (instance == null) {
                    instance = new SingletonPtr();
                }
            }
        }
        return instance;
    }
}
