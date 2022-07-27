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
- GET : パス変数でidを受け取り、そのIDに対応したユーザーを返す  

| <img width="882" alt="スクリーンショット 2022-07-26 17 42 23" src="https://user-images.githubusercontent.com/103230014/181149765-66098664-4128-4354-8170-a4ca5f8b2edb.png"> |
|:-:|

- POST : ユーザーのIDとNAMEを送信し、ユーザーのデータを新規作成  

| <img width="861" alt="スクリーンショット 2022-07-26 17 45 01" src="https://user-images.githubusercontent.com/103230014/181149830-1fa7c43c-c91d-43ec-9670-fba056740106.png"> |
|:-:|

| <img width="561" alt="スクリーンショット 2022-07-26 1 24 53" src="https://user-images.githubusercontent.com/103230014/180907931-be2cc482-46ba-42be-9df3-60acf7d0ce93.png"> |
|:-:|

- PATCH : ユーザーのIDとNAMEを送信し、URLで指定したIDに対応するユーザーのデータを更新  

| <img width="860" alt="スクリーンショット 2022-07-26 17 45 50" src="https://user-images.githubusercontent.com/103230014/181149939-ebabf74a-8744-4dde-82fa-c26a23f7c30e.png"> |
|:-:|

| <img width="499" alt="スクリーンショット 2022-07-26 1 26 40" src="https://user-images.githubusercontent.com/103230014/180907946-ffca79ab-c4aa-4140-9da6-a7b975626817.png"> |
|:-:|

- DELETE : URLで指定したIDに対応するユーザーのデータを削除  

| <img width="873" alt="スクリーンショット 2022-07-26 1 26 53" src="https://user-images.githubusercontent.com/103230014/180907952-f5c2dc9b-2842-4901-beef-636e0695f99e.png"> |
|:-:|

| <img width="502" alt="スクリーンショット 2022-07-26 1 27 11" src="https://user-images.githubusercontent.com/103230014/180907959-da642bc9-118c-47a4-874f-aac221a464ac.png"> |
|:-:|

