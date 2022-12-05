<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Курсы</title>
</head>
<body>
<#include "../header/navigation.ftlh">
</body>
<table>
    <tr>
        <th>ID</th>
        <th>Название</th>
        <#if role == 'ADMIN'>
            <th>Действия</th>
        </#if>
    </tr>
    <#list courses as course>
        <tr>
            <td>${course.id}</td>
            <td>${course.title}</td>
            <#if role == 'ADMIN'>
            <td>
                <a href="/courses/${course.id}">Перейти</a>
                <a href="/courses/${course.id}/delete">Удалить</a>
            </td>
            </#if>
        </tr>
    </#list>
</table>
</html>