Данный блокнот является экспериментальной работой по изучению способа миграции таблиц с помощью инструмента liquibase.

url:
jdbc:h2:~/zoo;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE

user:
sa

password:
sa

Инициализация базы до запуска приложения:
mvn liquibase:update -Dliquibase.url=jdbc:h2:~/zoo;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE -Dliquibase.changeLogFile=src/main/resources/db/changelog/init/db.init.xml -Dliquibase.username=sa

!!!Не использовать команду ниже, так как ломает кириллицу в базе, нужно разбираться. Миграции делать запустив приложение, с помощью Hibernate.
Миграция данных в базу:
mvn liquibase:update -Dliquibase.url=jdbc:h2:~/zoo;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE -Dliquibase.changeLogFile=src/main/resources/db/changelog/db.changelog-master.xml -Dliquibase.username=sa