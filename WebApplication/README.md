# Хеширование паролей с помощью BCrypt

`qwerty007` -> `$2a$10$zReBnvm3Hx2Tyy1/HPCT6OIdvf7SV0wrMo1M4zFYr/iMkOMJTOG9e`

```
$[2a]$[10]$[zReBnvm3Hx2Tyy1/HPCT6O][Idvf7SV0wrMo1M4zFYr/iMkOMJTOG9e]
            ^                       ^
            |                       |
        random salt                hash
```

## Сохранение пароля в базе

`qwerty007`:

1) salt generate -> `zReBnvm3Hx2Tyy1/HPCT6O`
2) hash(password + salt) -> hash(`qwerty007zReBnvm3Hx2Tyy1/HPCT6O`) -> `Idvf7SV0wrMo1M4zFYr/iMkOMJTOG9e`
3) `$2a$10[salt][hash]` -> done

## Проверка пароля

* Пользователь ввел email и пароль, мы по email-у нашли хеш пароля.
* Имеем - пароль в чистом виде и пароль хешированный. Нужно понять, могли ли мы получить хеш от пароля в чистом виде,
чтобы он совпал с тем, что есть в базе

`qwerty007`, `$2a$10$zReBnvm3Hx2Tyy1/HPCT6OIdvf7SV0wrMo1M4zFYr/iMkOMJTOG9e`

1. Выделяем соль из хеш-пароля -> `zReBnvm3Hx2Tyy1/HPCT6O`
2. Хешируем пароль, который дали hash(password + salt) = hash
3. Сравниваем хеши

## Страницы

0. profile
1. Все пользователи /users
2. Страница конкретного пользователя /users/{id}
3. Страница отдельного курса