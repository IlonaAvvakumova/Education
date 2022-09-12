package src.main.java.com.IlonaA.javacore.Patterns.Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new SubscriberSubject();
        Observer youtuber1 = new Youtuber1();
//подписываем новых пользователей
        subject.addSubscriber(youtuber1);
        subject.addSubscriber(new Youtuber2());
        subject.addSubscriber(new Youtuber3());
//новое сообщение от субъекта
        subject.notifySubscribers("Ура вышел новый ролик");
        System.out.println("----------------------------------------");
        //удаляем из подписки
        subject.deleteSubscriber(youtuber1);
        subject.notifySubscribers("Новый ролик на канале");
    }
}
