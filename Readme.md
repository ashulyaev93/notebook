Данный блокнот является экспериментальной работой по изучению способа миграции таблиц с помощью инструмента liquibase.

БД:
url: jdbc:h2:~/zoo;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE
user: sa
password: sa

Инициализация базы до запуска приложения:
mvn liquibase:update -Dliquibase.url=jdbc:h2:~/zoo;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE -Dliquibase.changeLogFile=src/main/resources/db/changelog/init/db.init.xml -Dliquibase.username=sa

Приложение позволяет:
a.  Получить информацию о всех животных. "~/zoo/animals/all"
b.  Получить информацию о всех продуктах. "~/zoo/products/all"
c.  Получить информацию о животном по id. "~/zoo/animals/{animal_id}"
d.  Получить информацию о продукте по id. "~/zoo/animals/{product_id}" (также можно увидеть у кого из животных в рационе есть данный продукт)
e.  Получить информацию о питании животных на 7 дней. "~/zoo/foodRates/animal/{animal_id}"
f.  Удаление животного по id. "~/zoo/animals/delete/{animal_id}"