# 第12回講義課題
## 課題の内容 
REST APIの作成（GET/POST/PATCH/DELETEのリクエストを扱えるControllerの実装）  

## 構成要件
Java 17  
Gradle 7.4.1  
Spring Boot 2.6.7  
Docker Desktop 4.8.7  
Docker Compose 2.5.0  
MySQL 8.0  
MyBatis Spring Boot Starter 2.2.2  

## アプリケーションの内容
- シンプルなIDとユーザーのリスト  

## HTTPリクエスト
- GET : クエリ文字列でidを受け取り、そのIDに対応したユーザーを返す  

| <img width="869" alt="スクリーンショット 2022-07-26 1 22 46" src="https://user-images.githubusercontent.com/103230014/180907867-6a79b20f-5756-4914-b91c-93b1232c62db.png"> |
|:-:|

- POST : ユーザーのIDとNAMEを送信し、ユーザーのデータを新規作成  

| <img width="861" alt="スクリーンショット 2022-07-26 1 24 25" src="https://user-images.githubusercontent.com/103230014/180907912-8d0b8e03-b4ea-4f5c-a5f3-9388a74c6b59.png"> |
|:-:|

| <img width="561" alt="スクリーンショット 2022-07-26 1 24 53" src="https://user-images.githubusercontent.com/103230014/180907931-be2cc482-46ba-42be-9df3-60acf7d0ce93.png"> |
|:-:|

- PATCH : ユーザーのIDとNAMEを送信し、URLで指定したIDに対応するユーザーのデータを更新  

| <img width="865" alt="スクリーンショット 2022-07-26 1 26 32" src="https://user-images.githubusercontent.com/103230014/180907941-58c4c036-2c75-4030-a3a8-8aa260f1ffe6.png"> |
|:-:|

| <img width="499" alt="スクリーンショット 2022-07-26 1 26 40" src="https://user-images.githubusercontent.com/103230014/180907946-ffca79ab-c4aa-4140-9da6-a7b975626817.png"> |
|:-:|

- DELETE : URLで指定したIDに対応するユーザーのデータを削除  

| <img width="873" alt="スクリーンショット 2022-07-26 1 26 53" src="https://user-images.githubusercontent.com/103230014/180907952-f5c2dc9b-2842-4901-beef-636e0695f99e.png"> |
|:-:|

| <img width="502" alt="スクリーンショット 2022-07-26 1 27 11" src="https://user-images.githubusercontent.com/103230014/180907959-da642bc9-118c-47a4-874f-aac221a464ac.png"> |
|:-:|

