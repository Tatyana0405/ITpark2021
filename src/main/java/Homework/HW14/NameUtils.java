package Homework.HW14;

import java.util.List;
import java.util.Random;

public class NameUtils {

    private static final List<String> NAMES =
            List.of("Авдей",
                    "Авксентий",
                    "Агапит",
                    "Агафон",
                    "Акакий",
                    "Александр",
                    "Алексей",
                    "Альберт",
                    "Альвиан",
                    "Анатолий",
                    "Андрей",
                    "Аникита",
                    "Антон",
                    "Антонин",
                    "Анфим",
                    "Аристарх",
                    "Аркадий",
                    "Арсений",
                    "Артём",
                    "Артемий",
                    "Артур",
                    "Архипп",
                    "Афанасий",
                    "Капитон",
                    "Ким",
                    "Кир",
                    "Кирилл",
                    "Климент",
                    "Кондрат",
                    "Конон",
                    "Константин",
                    "Корнилий",
                    "Кузьма",
                    "Куприян",
                    "Богдан",
                    "Борис",
                    "Вавила",
                    "Вадим",
                    "Валентин",
                    "Валерий",
                    "Валерьян",
                    "Варлам",
                    "Варсонофий",
                    "Варфоломей",
                    "Василий",
                    "Венедикт",
                    "Вениамин",
                    "Викентий",
                    "Виктор",
                    "Виссарион",
                    "Виталий",
                    "Владимир",
                    "Владислав",
                    "Владлен",
                    "Влас",
                    "Всеволод",
                    "Вячеслав",
                    "Магистриан",
                    "Макар",
                    "Максим",
                    "Мамонт",
                    "Марк",
                    "Мартын",
                    "Матвей",
                    "Мелентий",
                    "Мина",
                    "Мирон",
                    "Мирослав",
                    "Митрофан",
                    "Михаил",
                    "Мстислав",
                    "Савва",
                    "Савелий",
                    "Самуил",
                    "Святополк",
                    "Святослав",
                    "Севастьян",
                    "Семён",
                    "Серафим",
                    "Сергей",
                    "Сила",
                    "Сильвестр",
                    "Созон",
                    "Софрон",
                    "Спиридон",
                    "Станислав",
                    "Степан",
                    "Фаддей",
                    "Фёдор",
                    "Федосей",
                    "Федот",
                    "Феликс",
                    "Феоктист",
                    "Филат",
                    "Филимон",
                    "Филипп",
                    "Фирс",
                    "Фока",
                    "Фома",
                    "Фотий",
                    "Фрол",
                    "Харитон",
                    "Хрисанф",
                    "Христофор");
    private static final List<String> SURNAMES =
            List.of("Смирнов",
                    "Иванов",
                    "Петров",
                    "Сидоров",
                    "Кузнецов",
                    "Соколов",
                    "Попов",
                    "Лебедев",
                    "Козлов",
                    "Новиков",
                    "Морозов",
                    "Ершов",
                    "Соловьёв",
                    "Казаков",
                    "Карасёв",
                    "Карпов",
                    "Катаев",
                    "Кобелев",
                    "Козлов",
                    "Комиссаров",
                    "Кондаков",
                    "Кузнецов",
                    "Юдин",
                    "Юмашев",
                    "Юферевы",
                    "Сабуров",
                    "Сартаков",
                    "Семиколенных",
                    "Семичастнов",
                    "Строгальщиков",
                    "Бабурин",
                    "Бабуркин",
                    "Баранов",
                    "Бараш",
                    "Бахтин",
                    "Бердюгин",
                    "Бессонов",
                    "Боборыкин",
                    "Боталов",
                    "Замятин",
                    "Замятнин",
                    "Звягин",
                    "Зимин",
                    "Подосёнов",
                    "Поляков",
                    "Попов",
                    "Шишкин",
                    "Шишов",
                    "Арменинов",
                    "Ашихмин",
                    "Таманский",
                    "Тарханов",
                    "Левин",
                    "Львов",
                    "Негодяев",
                    "Носков");
    private static final List<String> PATRONYMICS =
            List.of("Андреевич",
                    "Алексеевич",
                    "Богданович",
                    "Викторович",
                    "Генадьевич",
                    "Дмитриевич",
                    "Харитонович",
                    "Яковлевич",
                    "Аркадьевич");

    public static String randomizeName() {
        return randomize(NAMES);
    }

    public static String randomizeSurname() {
        return randomize(SURNAMES);
    }

    public static String randomizePatronymic() {
        return randomize(PATRONYMICS);
    }

    private static String randomize(List<String> values) {
        return values.get(new Random().nextInt(values.size()));
    }
}