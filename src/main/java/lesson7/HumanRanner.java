package lesson7;

public class HumanRanner {

    public static void main(String[] args) {
        Human me = new Human();
        me.name="Vitaliy";
        me.surname="Ivanov";
        me.age=33;
        me.weight=82;
        me.height=190;
        me.hasQrCode=false;

        Human nataliaIvanovna = new Human();
        nataliaIvanovna.name="Natalia";
        nataliaIvanovna.surname="Petrova";
        nataliaIvanovna.age=27;
        nataliaIvanovna.weight=55;
        nataliaIvanovna.height=165;
        nataliaIvanovna.hasQrCode=true;

        Human inkognito= new Human ("Unknown", "Unknown" );

        Human vasyaPupkin = new Human ("Vasiliy", "Pupkin", 50, -1, -1, null);

        System.out.println(me==vasyaPupkin);
        System.out.println(me==me);

        Human[] humans= new Human[] {me, nataliaIvanovna, vasyaPupkin};
        for (Human human: humans){
            if (Integer.valueOf(50).equals(human.age)) {
                System.out.println("Человек с  именем " +human.name+" и фамилией " +human.surname+" имеет  возраст 50 лет");
            }
        }
me.beOlder();
        System.out.println("Мне на следующий год исполнится "+me.getAge());
        me.vaccinated();
        System.out.println("Наличие кода: " +me.getHasQrCode());

        me.setName("IVAN");
        System.out.println("Теперь я "+me.getName());
    }
}
